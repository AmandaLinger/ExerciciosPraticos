package com.amandaLinger.contador.exercicios.contador;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/* implementando a serializacao de objetos para o arquivo tarefa.json
		Tarefa tarefa = new Tarefa();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("tarefa.json"), tarefa);
		System.out.println("Dados salvos no arquivo tarefa.json");
		*/


		//implementando a desserializacao de objetos
		ObjectMapper objectMapper = new ObjectMapper();
		Tarefa tarefaLida = objectMapper.readValue(new File("tarefa.json"), Tarefa.class);
		System.out.println("Tarefa lida do JSON:");
		System.out.println(tarefaLida);
	}

}
