package br.com.pesterenan.dio.desafio;

import java.time.LocalDate;

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
		System.out.println(cursoJava);
		System.out.println(cursoJavaScript);
		System.out.println(mentoriaJava);
	}

}
