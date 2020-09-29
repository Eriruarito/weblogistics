package es.eduardosarabia.weblogistics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.istack.NotNull;

import es.eduardosarabia.weblogistics.interfaces.IAlmacenSERVICE;
import es.eduardosarabia.weblogistics.interfaces.IProductoSERVICE;
import es.eduardosarabia.weblogistics.interfaces.IVentaSERVICE;
import es.eduardosarabia.weblogistics.model.Almacen;
import es.eduardosarabia.weblogistics.model.Producto;
import es.eduardosarabia.weblogistics.model.Venta;

@Controller
public class MiControlador {

	@Autowired
	IProductoSERVICE productoService;
	
	@Autowired
	IAlmacenSERVICE almacenService;
	
	@Autowired
	IVentaSERVICE ventaService;
	
	@RequestMapping("/")
	public String indice() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login.html";
	}
	
	@RequestMapping("/almacenes")
	public String verAlmacenes(Model model) {
		System.out.println(almacenService.findAll());
		model.addAttribute("almacenes", almacenService.findAll());
		return "almacenes.html";
	}
	@RequestMapping("/productos")
	public String verProductos(Model model) {
		model.addAttribute("almacenes", almacenService.findAll());
		model.addAttribute("selectedOne", new Almacen());
		return "productos.html";
	}
	@RequestMapping("/productos/selalm")
	public String verProductos(@ModelAttribute("selectedOne") @NotNull Almacen selectedOne, Model model){
		int idAlmacen = selectedOne.idalmacenes; 
		List<Producto> productos = productoService.findByAlm(idAlmacen);
		model.addAttribute("almacenes", almacenService.findAll()); 
		model.addAttribute("selectedOne", new Almacen());
		model.addAttribute("productos", productos);
		return "/productos";
	}
	@RequestMapping("/ventas")
	public String verVentas() {
		return "ventas.html";
	}
	@RequestMapping("/ventas/filven")
	public String verVentas(@RequestParam("almacenes_idalmacenes") @NotNull int idalmacenes, @RequestParam("fechadeventa") @NotNull int añodeventa, Model model) {
		List<Venta> ventasFil = null;;
		if((idalmacenes == 11) && (añodeventa == 0)) {
			ventasFil = ventaService.findAll();
		}
		if((idalmacenes == 11) && (añodeventa != 0)) {
			ventasFil = ventaService.findAllByDate(añodeventa);
		}
		if((añodeventa == 0) && (idalmacenes != 11)) {
			ventasFil = ventaService.findAllByAlm(idalmacenes);
		}
		if((idalmacenes != 11) && (añodeventa != 0)){
			ventasFil = ventaService.findAllByDateAlm(añodeventa, idalmacenes);
		}
		
		model.addAttribute("ventas", ventasFil);
		return "/ventas";
	}
	@RequestMapping("/opercliente")
	public String operativaCliente() {
		Producto producto = productoService.deleteProducto(1);
		return "/opercliente";
	}
	@RequestMapping("/compras")
	public String comprasAlmacen() {
		Producto producto = productoService.addProducto(1);
		return "/compras";
	}
	@RequestMapping("/stock")
	public String gestionStock() {
		Producto producto = productoService.modProducto(1);
		return "/stock";
	}
}
