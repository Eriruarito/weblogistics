package es.eduardosarabia.weblogistics.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eduardosarabia.weblogistics.dao.IProductoRepository;
import es.eduardosarabia.weblogistics.interfaces.IProductoSERVICE;
import es.eduardosarabia.weblogistics.model.Producto;

@Service
public class ProductoSERVICE implements IProductoSERVICE {
	
	@Autowired
	IProductoRepository productoRepository;
	
	@Override
	public Producto findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto findByName(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto modProducto(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto addProducto(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto deleteProducto(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> findByAlm(int idalmacenes) {
		List<Producto> productos = productoRepository.findByidalmacenes(idalmacenes);
		return productos;
	}

}
