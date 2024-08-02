package br.com.terceiroprojeto;

import javax.swing.JOptionPane;

public class TesteProfessor {
	public static void main(String[] args) {
	
	Professor professor = new Professor();
	
	professor.setSalario(1412.7);
	professor.setIdade(41);
	professor.setNome("Rafael");
	
	System.out.println("Nome do prof: " + professor.getNome() + ". Recebe " 
	+ professor.getSalario() + " reais por mês. E tem " + professor.getIdade() 
	+ " anos de idade.");
	
	Professor professordois = new Professor();
	
	
	professordois.setNome(JOptionPane.showInputDialog("Professor, qual o seu nome?"));
	professordois.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Professor, qual sua idade?")));
	professordois.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Professor, qual seu salário?")));
	
	
	}
	
}
