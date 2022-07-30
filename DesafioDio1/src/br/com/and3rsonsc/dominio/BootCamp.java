package br.com.and3rsonsc.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
	private String nome;
	private String descricao;
	private final LocalDate dataInicio = LocalDate.now();
	private final LocalDate dataFinal = dataInicio.plusDays(45);
	private Set<Dev> devsInscritos = new HashSet<>(); //Ordem não importa
	private Set<Conteudo> conteudos = new LinkedHashSet<>(); //Ordem importa
	
	
	public BootCamp(String nome, String descricao, Set<Conteudo> conteudos) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.conteudos.addAll(conteudos);
	}

	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicio, descricao, devsInscritos, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BootCamp other = (BootCamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicio, other.dataInicio) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devsInscritos, other.devsInscritos) && Objects.equals(nome, other.nome);
	}
	
}
