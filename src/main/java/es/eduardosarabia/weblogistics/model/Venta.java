package es.eduardosarabia.weblogistics.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ventas")
public class Venta {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	public int idventa;
	@Column
	public int productos_idproductos;
	@Column
	public int almacenes_idalmacenes;
	@Column
	public Date fechadeventa;
	
	public Venta() {
		super();
	}

	public Venta(int idVenta, int idProducto, int idAlmacen, Date fechaDeVenta) {
		super();
		this.idventa = idVenta;
		this.productos_idproductos = idProducto;
		this.almacenes_idalmacenes = idAlmacen;
		this.fechadeventa = fechaDeVenta;
	}

	public int getIdVenta() {
		return idventa;
	}

	public void setIdVenta(int idVenta) {
		this.idventa = idVenta;
	}

	public int getIdProducto() {
		return productos_idproductos;
	}

	public void setIdProducto(int idProducto) {
		this.productos_idproductos = idProducto;
	}

	public int getalmacenes_idalmacenes() {
		return almacenes_idalmacenes;
	}

	public void setalmacenes_idalmacenes(int idAlmacen) {
		this.almacenes_idalmacenes = idAlmacen;
	}

	public Date getfechadeventa() {
		return fechadeventa;
	}

	public void setfechadeventa(Date fechaDeVenta) {
		this.fechadeventa = fechaDeVenta;
	}

	@Override
	public String toString() {
		return "Venta [idVenta=" + idventa + ", idProducto=" + productos_idproductos + ", idAlmacen=" + almacenes_idalmacenes
				+ ", fechaDeVenta=" + fechadeventa + "]";
	}
	
	
}
