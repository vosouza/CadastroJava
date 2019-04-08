package ledcadastro;

public class Diciplinas {
    public Disciplina dics[];
    public final int max;
    public int tam;
    
    public Diciplinas(int max){
        this.max = max;
        this.dics = new Disciplina[this.getMax()];
        tam = 0;
    }
    
    public int getMax(){
        return this.max;
    }
}
