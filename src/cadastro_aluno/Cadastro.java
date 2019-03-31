package cadastro_aluno;

/**
 * Escreva a descrição da classe CadastroAluno aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Cadastro
{
    private Aluno cad[];
    private int max;
    private int cont;
    
    Cadastro(int tam){
        max = tam;
        cont=0;
        cad = new Aluno[tam];
        Aluno al = new Aluno("Girafa asmdpkamsd",30,"365.365.36-5","1231232",6);
        cad[cont] = al;
        
    }
    
    public boolean inserirAluno(String nome, int idade, String rg, String ra, int semestre){
        if(cont < max){
            cont++;
            Aluno al = new Aluno(nome,idade,rg,ra,semestre);
            cad[cont] = al;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean deletarAluno(String ra){
        Aluno al;
        for(int i=0; i<=cont ; i++){
            al = cad[i];
            if(al.getRa().contentEquals(ra)){
                cad[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Aluno buscarAluno(String ra){
        Aluno al;
        for(int i=0; i<=max ; i++){
            al = cad[i];
            if(al.getRa() == ra){
                return al;
            }
        }
        return null;
    }
    
    
    public String dadosAluno(String ra){
        Aluno al;
        String retorno ="Aluno nao encontrado";
        for(int i=0; i<=cont ; i++){    
        	al = cad[i];
	        if(al.getRa().equals(ra)){
	            retorno ="Nome:" + al.getNome()+ "\nIdade: "+ al.getIdade()+ "\nRg: "+ al.getRg()+ "\nRa: "+al.getRa()+ "\nSemestres: "+al.getSemestre();
	            break;
	        }
        }
        return retorno;
    }
}
