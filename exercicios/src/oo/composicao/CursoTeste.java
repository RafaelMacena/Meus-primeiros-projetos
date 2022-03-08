package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("java completo");
		Curso curso2 = new Curso("Spring boot");
		Curso curso3 = new Curso("Banco de Dados Mysql");
		
		aluno1.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso1);
		aluno2.adicionarCurso(curso2);
		
		curso1.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno1);
		
		for (Aluno aluno : curso1.alunos) {
			System.out.println("Estou matriculado no curso 1....");
			System.out.println("....e o meu nome é " + aluno.nome + "\n");
			
		}
		
	}

}
