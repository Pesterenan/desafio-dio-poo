package br.com.pesterenan.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;

	public Curso() {
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
		builder.append("\nCurso \t|");
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
		builder.append("\t|cargaHoraria=");
		builder.append(cargaHoraria);
		builder.append("h");
		return builder.toString();
	}

	@Override
	public double calcularXP() {
		return cargaHoraria * XP_PADRAO;
	}

}
