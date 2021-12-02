package com.curso.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.ecommerce.model.Producto;
import com.curso.ecommerce.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProdutoService {

	
	@Autowired
	private ProductoRepository productoRepositry;
	
	
	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoRepositry.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		// TODO Auto-generated method stub
		return productoRepositry.findById(id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		productoRepositry.save(producto);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		productoRepositry.deleteById(id);
		
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return productoRepositry.findAll();
	}

}
