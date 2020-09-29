package es.eduardosarabia.weblogistics.interfaces;

import java.util.List;

import es.eduardosarabia.weblogistics.model.Producto;

public interface IProductoSERVICE {
	
	public Producto findById(int id);
	public Producto findByName(String nombre);
	public List <Producto> findByAlm(int idalmacenes);
	public List<Producto> findAll();
	public Producto modProducto(int id);
	public Producto addProducto(int id);
	public Producto deleteProducto(int id);
}
