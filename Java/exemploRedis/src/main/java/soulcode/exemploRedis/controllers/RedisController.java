package soulcode.exemploRedis.controllers;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

	@Cacheable("hello")
	@GetMapping("/hello")
	public String hello() {
		System.out.println("hello sem cache");
		return "Hello World";
	}
	
	@CacheEvict("hello")
	@GetMapping("/cancel")
	public String bye() {
		System.out.println("Eu tenho, reclamações a fazer");
		return "Bye bye seus pipoquinhas sem torcida";
	}
}
