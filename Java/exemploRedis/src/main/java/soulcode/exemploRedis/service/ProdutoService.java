package soulcode.exemploRedis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soulcode.exemploRedis.entity.Produto;
import soulcode.exemploRedis.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;
	
	public List<Produto> findAll(){
		return (List<Produto>) produtoRepository.findAll();
	}
	public Produto findById(Integer id) {
		Optional<Produto> produto = produtoRepository.findById(id);
		return produto.orElseThrow();
	}
	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public void deleteById(Integer id) {
		produtoRepository.deleteById(id);
	}
	
	public Produto UpdateProduto(Produto produto) {
		findById(produto.getId());
		return produtoRepository.save(produto);
	}
}
