package es.eduardosarabia.weblogistics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	public int idproductos;
	@Column
	public String nombre;
	@Column
	public double precioUnitario;

	
	public Producto() {
		super();
	}

	public Producto(int idproductos, String nombre, double precioUnitario) {
		super();
		this.idproductos = idproductos;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
	}

	public int getidproductos() {
		return idproductos;
	}

	public void setidproductos(int idalmacenes) {
		this.idproductos = idalmacenes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {
		return "Producto [idproductos=" + idproductos + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario + "]";
	}
		
}
