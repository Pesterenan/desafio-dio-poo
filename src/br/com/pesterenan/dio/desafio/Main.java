package br.com.pesterenan.dio.desafio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.pesterenan.dio.desafio.dominio.Conteudo;
import br.com.pesterenan.dio.desafio.dominio.Curso;
import br.com.pesterenan.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// Criar instâncias de classe e definir seus atributos
		Curso cursoJava = new Curso();
		cursoJava.setTitulo("Curso Java");
		cursoJava.setDescricao("Curso de Java pela Digital Innotavion One");
		cursoJava.setCargaHoraria(45);

		Curso cursoJavaScript = new Curso();
		cursoJavaScript.setTitulo("Curso JavaScript");
		cursoJavaScript.setDescricao("Curso de JavaScript pela Digital Innotavion One");
		cursoJavaScript.setCargaHoraria(45);

		Mentoria mentoriaJava = new Mentoria();
		mentoriaJava.setTitulo("Abstraindo um Bootcamp usando Java");
		mentoriaJava.setDescricao("Aprenda a abstrair o conteúdo de um Bootcamp utilizando a linguagem Java");
		mentoriaJava.setData(LocalDate.now());
		
		// Imprimir o método toString das instâncias

		List<Conteudo> conteudos = new ArrayList<>();
		conteudos.add(cursoJava);
		conteudos.add(cursoJavaScript);
		conteudos.add(mentoriaJava);
		conteudos.stream().forEach(System.out::println);
	}

}
