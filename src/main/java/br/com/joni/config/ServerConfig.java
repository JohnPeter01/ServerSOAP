package br.com.joni.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig {
	@Bean
	public BuscaService meuServico() {
		return new BuscaService();
	}
}
