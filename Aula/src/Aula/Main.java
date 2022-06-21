package Aula;

import java.util.ArrayList;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Joao");
		aluno1.setMatricula("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Pedro");
		aluno2.setMatricula("456");
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Aline");
		
		
		Professor professor = new Professor("ana",2000);
		professor.setNome("Prof. Roberto");	
		
		
		
	      Disciplina disciplina = new Disciplina();
	      disciplina.setNome("Orientacao Objetos");
		  professor.getDisciplina().add(disciplina);

		//ArrayList<Aluno> listaAlunos = disciplina.getAlunos();		
		//listaAlunos.add(aluno1);
		//listaAlunos.add(aluno2);		
		//disciplina.getAlunos().add(aluno3);
		//disciplina.getAlunos().clear();
		disciplina.adicionarAluno(aluno1);
		disciplina.adicionarAluno(aluno2);
		disciplina.adicionarAluno(aluno3);
		disciplina.exibeDados();
		disciplina.setProfessor(professor);
		professor.exibeDados();
		
		
		boolean resultado = disciplina.iniciarDisciplina();
		System.out.println("Foi possivel iniciar? " + resultado);
		
		
		
		ArrayList<Aluno> listaAlunos = professor.getDisciplina().get(0).getAlunos();
		
		
		  System.out.println("Lista Alunos do professor: " + professor.getNome());
	       for (Aluno aluno : listaAlunos) {			
	          System.out.println("Aluno: " + aluno.getNome());
		
	       
	       
//	   		Scanner s = new Scanner(System.in);
//	   		
//	   		System.out.println("Informe o nome do professor");
//	   		String nomeProfessor = s.nextLine();
//	   		
//	   		System.out.println("Informe o salario do professor");
//	   		float salario = s.nextFloat();
//	   		
//	   		System.out.println("Informe o nome da disciplina");
//	   		String nomeDisciplina = s.nextLine();
//	   		
//	   		Disciplina disciplina1 = new Disciplina(nomeDisciplina);
//	   		
//	   		Professor professor1 = new Professor(nomeProfessor, salario);
//	   		professor.getDisciplina().add(disciplina);
//	   		professor.exibeDados();
	       
	       
	       }
	       
	}
}

      

       

