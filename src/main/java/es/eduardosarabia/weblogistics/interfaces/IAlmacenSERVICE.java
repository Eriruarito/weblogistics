package es.eduardosarabia.weblogistics.interfaces;

import es.eduardosarabia.weblogistics.model.Almacen;

public interface IAlmacenSERVICE {
	
	public Almacen findById();
	public Almacen findByName();
	public Iterable<Almacen> findAll();

}
