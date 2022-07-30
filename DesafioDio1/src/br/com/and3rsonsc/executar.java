package br.com.and3rsonsc;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.and3rsonsc.dominio.BootCamp;
import br.com.and3rsonsc.dominio.Conteudo;
import br.com.and3rsonsc.dominio.Curso;
import br.com.and3rsonsc.dominio.Dev;
import br.com.and3rsonsc.dominio.Mentoria;

/**
 * @author Anderson
 *
 */
public class executar {

	public static void main(String[] args) {
		Curso curso1 = new Curso("Básico Java","Aprender os conceitos básicos de java",20);
		Curso curso2 = new Curso("Intermediário Java", "Aprender os conceitos intermediários em Java",40);
		Curso curso3 = new Curso("Avançado Java","Aprender tudo de Java",80);
		
		Mentoria mentoria1 = new Mentoria("Desafio Java básico","Exercicio básico",LocalDate.now());
		Mentoria mentoria2 = new Mentoria("Desafio Java intermediário","Exercicio intermediário",LocalDate.now());
		Mentoria mentoria3 = new Mentoria("Desafio Java avançado","Exercício avançado",LocalDate.now());
	
		Set<Conteudo> conteudosBootCamp = new LinkedHashSet<>();
		conteudosBootCamp.add(curso1);
		conteudosBootCamp.add(mentoria1);
		conteudosBootCamp.add(curso2);
		conteudosBootCamp.add(mentoria2);
		conteudosBootCamp.add(curso3);
		conteudosBootCamp.add(mentoria3);
		
		
		
		BootCamp bootCampJava = new BootCamp("BootCamp Java",
											 "Descrição do BootCamp",
											 conteudosBootCamp);
		
		Dev aluno1 = new Dev("Anderson");
		Dev aluno2 = new Dev("Joãozinho");
		aluno1.inscreverBootcamp(bootCampJava);
		aluno2.inscreverBootcamp(bootCampJava);
		System.out.println("Conteudos inscritos aluno 1: " + aluno1.getConteudosInscritos());
		System.out.println("Conteudos inscritos aluno 2: " + aluno2.getConteudosInscritos());
		System.out.println("Conteudos concluídos aluno 1: " + aluno1.getConteudosInscritos());
		System.out.println("Conteudos concluídos aluno 2: " + aluno2.getConteudosInscritos());
		System.out.println("XP aluno 1: " + aluno1.calcularTotalXP());
		System.out.println("XP aluno 2: " + aluno2.calcularTotalXP());
		
		System.out.println("----------------------------------------------------");
		
		aluno1.progredir();
		System.out.println("Conteudos inscritos aluno 1: " + aluno1.getConteudosInscritos());
		System.out.println("Conteudos inscritos aluno 2: " + aluno2.getConteudosInscritos());
		System.out.println("Conteudos concluídos aluno 1: " + aluno1.getConteudosInscritos());
		System.out.println("Conteudos concluídos aluno 2: " + aluno2.getConteudosInscritos());
		System.out.println("XP aluno 1: " + aluno1.calcularTotalXP());
		System.out.println("XP aluno 2: " + aluno2.calcularTotalXP());

		aluno1.progredir();
		aluno2.progredir();
		System.out.println("Conteudos inscritos aluno 1: " + aluno1.getConteudosInscritos());
		System.out.println("Conteudos inscritos aluno 2: " + aluno2.getConteudosInscritos());
		System.out.println("Conteudos concluídos aluno 1: " + aluno1.getConteudosInscritos());
		System.out.println("Conteudos concluídos aluno 2: " + aluno2.getConteudosInscritos());
		System.out.println("XP aluno 1: " + aluno1.calcularTotalXP());
		System.out.println("XP aluno 2: " + aluno2.calcularTotalXP());
	}

}
