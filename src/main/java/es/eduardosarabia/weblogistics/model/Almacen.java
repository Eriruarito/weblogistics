package es.eduardosarabia.weblogistics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="almacenes")
public class Almacen {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	public int idalmacenes;
	@Column
	public String nombre;
	@Column
	public String ubicacion;

	public Almacen() {
		super();
	}

	public Almacen(int idalmacenes, String nombre, String ubicacion) {
		super();
		this.idalmacenes = idalmacenes;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public int getidalmacenes() {
		return idalmacenes;
	}

	public void setidalmacenes(int idalmacenes) {
		this.idalmacenes = idalmacenes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Almacen [idalmacenes=" + idalmacenes + ", nombre=" + nombre + ", ubicacion=" + ubicacion + "]";
	}
		
}
