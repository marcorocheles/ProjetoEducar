package br.com.generation.projeto.java.educa;

import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TurmaAluno {

	//public static void main(String[] args) {
	
		public void turmaAlunos() {
			
		Scanner leia = new Scanner(System.in);
		String ciclo, turma;
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		JOptionPane.showMessageDialog(null,"Qual o Ciclo da Turma?");
		System.out.println("Digite o Ciclo: ");
        ciclo = leia.nextLine();
        
        JOptionPane.showMessageDialog(null,"Qual o Nome da Turma?");
        System.out.println("Digite a Turma: ");
        turma = leia.nextLine();
		
		JOptionPane.showMessageDialog(null, "Quantos alunos voc� deseja inserir? ");
		System.out.println("\nDigite aqui a quantidade de alunos: ");

		int numeroAlunos = leia.nextInt();
		
		leia.nextLine();		
		
		for(int i = 0; i < numeroAlunos; i++) {
			System.out.println("\nDigite o nome do " + (i+1) + "� Aluno: ");
			String nome = leia.nextLine();
			leia.nextLine();
						
			System.out.println("Digite o endere�o do Aluno: ");
			String endereco = leia.nextLine();
			leia.nextLine();
						
			System.out.println("O aluno entregou a atividade? ");
			String entregaAtividade = leia.nextLine();
			leia.nextLine();
			
			System.out.println("Observa��es: ");
			String observacoes = leia.nextLine();
			
								
			alunos.add(new Aluno(nome, endereco, entregaAtividade, observacoes));
		}
		
		for(Aluno al : alunos) {
			System.out.println(al);
		
		}
	}
	
}
