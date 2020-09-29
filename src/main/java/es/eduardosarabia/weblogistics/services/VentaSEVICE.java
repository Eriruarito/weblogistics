package es.eduardosarabia.weblogistics.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eduardosarabia.weblogistics.dao.IVentaRepository;
import es.eduardosarabia.weblogistics.interfaces.IVentaSERVICE;
import es.eduardosarabia.weblogistics.model.Venta;

@Service
public class VentaSEVICE implements IVentaSERVICE {
	
	@Autowired
	IVentaRepository ventarepository;
	
	@Override
	public Venta findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Venta findByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Venta> findAll() {
		Iterable<Venta> ventasIt = ventarepository.findAll();
		List<Venta> ventasLis = new ArrayList<>();
		for (Venta venta : ventasIt) {
			ventasLis.add(venta);
		}
		return ventasLis;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Venta> findAllByDate(int fechadeventa) {
		Iterable<Venta> ventasIt = ventarepository.findAll();
		List<Venta> ventasFil = new ArrayList<>(); 
		for (Venta venta : ventasIt) {
			if((venta.fechadeventa.getYear() + 1900) == fechadeventa){
				ventasFil.add(venta);
			}
		}
		return ventasFil;
	}
	
	@Override
	public List<Venta> findAllByAlm(int almacenes_idalmacenes) {
		Iterable<Venta> ventasIt = ventarepository.findAll();
		List<Venta> ventasFil = new ArrayList<>(); 
		for (Venta venta : ventasIt) {
			if(venta.almacenes_idalmacenes == almacenes_idalmacenes){
				ventasFil.add(venta);
			}
		}
		return ventasFil;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Venta> findAllByDateAlm(int fechadeventa, int almacenes_idalmacenes) {
		Iterable<Venta> ventasIt = ventarepository.findAll();
		List<Venta> ventasFil = new ArrayList<>(); 
		for (Venta venta : ventasIt) {
			if((venta.almacenes_idalmacenes == almacenes_idalmacenes) && ((venta.fechadeventa.getYear() + 1900) == fechadeventa)){
				ventasFil.add(venta);
			}
		}
		return ventasFil;
	}

	@Override
	public Venta modVenta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Venta addVenta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Venta deleteVenta() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
