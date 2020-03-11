package br.com.fiap.model;

/* Classe Aluno - Camada Model */

public class AlunoModel {

	private String nome;
	private String rm;
	private String turma;

	
	public AlunoModel() {
		
	}
	public AlunoModel(String nome, String rm, String turma) {
		super();
		this.nome = nome;
		this.rm = rm;
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}

	public String getRm() {
		return rm;
	}

	public String getTurma() {
		return turma;
	}

}
