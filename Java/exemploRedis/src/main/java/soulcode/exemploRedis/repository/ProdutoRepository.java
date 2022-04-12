package soulcode.exemploRedis.repository;

import org.springframework.data.repository.CrudRepository;

import soulcode.exemploRedis.entity.Produto;


public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
