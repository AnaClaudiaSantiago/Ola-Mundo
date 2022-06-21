package Aula;

import java.util.ArrayList;



public class Disciplina {
	private String nome;
	private float cargaHoraria;
	private String ementa;
	private Professor professor;
	private ArrayList<Aluno> alunos;
	private int alunosNecessarios;
		
	public Disciplina() {		
		alunos = new ArrayList<>();
		alunosNecessarios = 3;
	}
	
	public Disciplina(String nome) {
		this.nome = nome;
		alunos = new ArrayList<>();
		alunosNecessarios = 3;
	}
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	

	public void adicionarAluno(String nome) {
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		alunos.add(aluno);
	}
	
	public void exibeDados() {
		System.out.println("Nome Disciplina: " + this.getNome());
		for (Aluno aluno : alunos) {
			System.out.println("Nome Aluno: " + aluno.getNome());
			System.out.println("Matricula Aluno: " + aluno.getMatricula());
		}
		
		if(professor != null)
			System.out.println("Nome Professor: " + professor.getNome());
	}
	
	public boolean iniciarDisciplina() {
		if(professor == null) {
			System.out.println("Professor da disciplina nao informado.");
			return false;
		} else if (alunos.size() == 0) {
			System.out.println("Nao ha alunos na disciplina.");
			return false;
		} else if (alunos.size() < alunosNecessarios) {
			System.out.println("Nao ha numero suficiente de alunos: " + alunosNecessarios);
			return false;
		}
		else {
			return true;
		}
	}
	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public int getAlunosNecessarios() {
		return alunosNecessarios;
	}

	public void setAlunosNecessarios(int alunosNecessarios) {
		this.alunosNecessarios = alunosNecessarios;
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(float cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}	
}
