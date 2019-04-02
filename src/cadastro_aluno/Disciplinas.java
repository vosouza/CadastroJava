package cadastro_aluno;

public class Disciplinas {
	private Texto disciplina[];
	private int tam = 5;
	private int cont = 0;
	
	public Disciplinas(){
		disciplina = new Texto[tam];
		ss
	}
	
	public void adicionarDisciplinas(String dis){
		Texto t = new Texto(dis);
		disciplina[cont] = t;
		cont++;
	}
	
	public String getDisciplina(int index){
		return disciplina[index].getTxt();
	}
	
}
