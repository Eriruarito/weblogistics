package es.eduardosarabia.weblogistics.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import es.eduardosarabia.weblogistics.model.Producto;





public interface IProductoRepository extends CrudRepository<Producto,Integer>{
	
	@Query(value="SELECT productos.idproductos, productos.nombre, productos.precio_unitario FROM productos cross join productos_has_almacenes WHERE productos.idproductos = productos_has_almacenes.idproductos AND idalmacenes = :idalmacenes", nativeQuery = true)
	public List<Producto> findByidalmacenes(@Param("idalmacenes") int idalmacenes);
	
}
