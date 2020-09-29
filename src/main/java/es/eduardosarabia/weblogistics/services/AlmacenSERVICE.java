package es.eduardosarabia.weblogistics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eduardosarabia.weblogistics.dao.IAlmacenRepository;
import es.eduardosarabia.weblogistics.interfaces.IAlmacenSERVICE;
import es.eduardosarabia.weblogistics.model.Almacen;

@Service
public class AlmacenSERVICE implements IAlmacenSERVICE {

	@Autowired
	IAlmacenRepository almacenRespository;
	
	@Override
	public Almacen findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Almacen findByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Almacen> findAll() {
		return almacenRespository.findAll();
	}

}
