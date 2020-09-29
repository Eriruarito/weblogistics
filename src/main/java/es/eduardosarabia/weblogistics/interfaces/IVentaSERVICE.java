package es.eduardosarabia.weblogistics.interfaces;

import java.util.List;

import es.eduardosarabia.weblogistics.model.Venta;

public interface IVentaSERVICE {
	
	public Venta findById();
	public Venta findByName();
	public List<Venta> findAll();
	public List<Venta> findAllByDate(int fechadeventa);
	public List<Venta> findAllByDateAlm(int fechadeventa, int almacenes_idalmacenes);
	public List<Venta> findAllByAlm(int almacenes_idalmacenes);
	public Venta modVenta();
	public Venta addVenta();
	public Venta deleteVenta();
}
