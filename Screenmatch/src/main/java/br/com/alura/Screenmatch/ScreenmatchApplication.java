package br.com.alura.Screenmatch;
import br.com.alura.Screenmatch.Service.ConsumoApi;

import br.com.alura.Screenmatch.Service.ConsumoApi;
import br.com.alura.Screenmatch.Service.ConverteDados;
import br.com.alura.Screenmatch.model.DadosSerie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var ConsumoApi = new ConsumoApi();
		var json = ConsumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=d2725f00");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados (json, DadosSerie.class);
		System.out.println(dados);
	}
}
