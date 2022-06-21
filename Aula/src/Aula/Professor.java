package Aula;

import java.util.ArrayList;

public class Professor {
private String nome;
private float salario;
private ArrayList<Disciplina> disciplina ;

public Professor (String nome, float salario) {
	 this.disciplina = new ArrayList<Disciplina>();
	this.nome= nome;
	this.salario= salario;
}

 public Professor (String nome) {
	 this.nome= nome;
	 this.disciplina = new ArrayList<Disciplina>();
 }
 
 public void exibeDados() {
	 for (Disciplina disciplina : disciplina) {
	System.out.println("Disciplina" + disciplina.getNome());	
	}
 }


public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public float getSalario() {
	return salario;
}
public void setSalario(float salario) {
	this.salario = salario;
}
public ArrayList<Disciplina> getDisciplina() {
	return disciplina;
}
public void setDisciplina(ArrayList<Disciplina> disciplina) {
	this.disciplina = disciplina;
}


}
