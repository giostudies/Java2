package br.com.terceiroprojeto;

public class AlunoTeste {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setNome("Karina");
		aluno.setIdade(35);
		aluno.setRm(2332320);
		
		System.out.println("O seu nome é " + aluno.getNome() + ". O seu RM é " + aluno.getRm() + ". Você tem " + aluno.getIdade() + " anos");
	}

}
