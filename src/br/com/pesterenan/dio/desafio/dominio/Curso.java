package br.com.pesterenan.dio.desafio.dominio;

public class Curso {

	private String titulo;
	private String descricao;
	private int cargaHoraria;

	public Curso() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [");
		if (titulo != null) {
			builder.append("titulo=");
			builder.append(titulo);
			builder.append(", ");
		}
		if (descricao != null) {
			builder.append("descricao=");
			builder.append(descricao);
			builder.append(", ");
		}
		builder.append("cargaHoraria=");
		builder.append(cargaHoraria);
		builder.append("]");
		return builder.toString();
	}

}
