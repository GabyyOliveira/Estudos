package soulcode.exemploRedis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soulcode.exemploRedis.entity.Produto;
import soulcode.exemploRedis.service.ProdutoService;

@RestController
@RequestMapping("redis")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/produtos")
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(produtoService.findAll());
	}
	
	@GetMapping("/produto/{id}")
	public ResponseEntity<Produto> getById(@PathVariable Integer id){
		Produto produto = produtoService.findById(id);
		return ResponseEntity.ok().body(produto);
	}
	
	@PostMapping("/saveproduto")
	public ResponseEntity<Produto> save(@RequestBody Produto produto){
		return ResponseEntity.ok(produtoService.save(produto));
	}
	
	@DeleteMapping("/produto/delete/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		produtoService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/produto/edit/{id}")
	public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Produto produto){
		produto.setId(id);
		produto = produtoService.UpdateProduto(produto);
		return ResponseEntity.noContent().build();
	}
}
