package br.com.and3rsonsc.dominio;

public abstract class Conteudo {

	protected static final double XP_PADRAO = 10d;
	
	private String titulo;
	private String descricao;
	
	public Conteudo(String titulo, String descricao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public abstract double calcularXP();
	
}
