package ledcadastro;

public class Cadastro{
    private Aluno cad[];
    private int total;

    public Cadastro(){
        this.cad = new Aluno[1];
        this.total = 0;
    }
    
    public boolean addCadastro(Aluno aluno){
        if(this.getTotal() == 0){
            this.cad[0] = aluno;
            this.setTotal(this.getTotal() + 1);
            return true;
        }else{
            if(this.getTotal() > 0){
                Aluno cadAux[] = new Aluno[this.getTotal()];
                this.copiar(this.cad, cadAux);
                this.cad = new Aluno[this.getTotal() + 1];
                this.copiar(cadAux, this.cad);
                this.cad[this.getTotal()] = aluno;
                this.setTotal(this.getTotal() + 1);
                return true;
            }
        }
            return false;
    }

    public void setTotal(int total){
        this.total = total;
    }

    public int getTotal(){
        return this.total;
    }


    public boolean removerCadastro(Aluno aluno){
        int aux = 0;
        while(aux < this.getTotal() && !cad[aux].equals(aluno)){
            if(cad[aux] != null && !cad[aux].equals(aluno)){
                aux++;
            }
        }
        
        for(int j = aux; j < this.getTotal() - 1; j++){
            cad[j] = cad[j + 1];
        }
        
        cad[this.getTotal() - 1] = null;
        Aluno cadAux[] = new Aluno[this.getTotal()];
        copiar(cadAux, this.cad);
        this.setTotal(this.getTotal() - 1);
        
        return true;        
    }

    private void copiar(Aluno origem[], Aluno destino[]) {
        for(int i = 0; i < this.getTotal(); i++){
            if(origem[i] != null)
                destino[i] = origem[i];
        }
    }
    
    public void listar(){
        for(int i = 0 ; i < this.getTotal(); i++){
            if(cad[i] != null){
                System.out.println("Nome: " + cad[i].getNome());
                System.out.println("Idade: " + cad[i].getIdade());
                System.out.println("Rg: " + cad[i].getRg());
                System.out.println("RA: " + cad[i].getRa());
                System.out.println("Semestre: " + cad[i].getSemestre());

                System.out.println("==========================");
            }
        }
    }
    public boolean comparar(Aluno al) {
    	for(int i = 0; i < this.getTotal(); i++) {
    		if(al.equals(cad[i])) {
    			return true;
    		}
    	}
    	return false;
    }
}