package com.curso.ecommerce.service;

import java.util.Optional;

import com.curso.ecommerce.model.Producto;

public interface ProdutoService {

	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
}
