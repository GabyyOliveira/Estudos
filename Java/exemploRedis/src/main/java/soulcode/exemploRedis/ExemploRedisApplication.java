package soulcode.exemploRedis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ExemploRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploRedisApplication.class, args);
	}

}
