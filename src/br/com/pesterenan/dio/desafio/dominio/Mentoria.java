package br.com.pesterenan.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	private LocalDate data;

	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}

	public Mentoria() {
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mentoria \t|");
		if (getTitulo() != null) {
			builder.append("titulo=");
			builder.append(getTitulo());
			builder.append("\n");
		}
		if (getDescricao() != null) {
			builder.append("\t|descricao=");
			builder.append(getDescricao());
			builder.append("\n");
		}
		if (data != null) {
			builder.append("\t|data=");
			builder.append(data);
		}
		return builder.toString();
	}


}
