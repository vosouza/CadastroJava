package ledcadastro;
import javax.swing.JOptionPane;

public class LEDCadastro {
   public static void main(String[] args) {
	   
        Cadastro cadastro = new Cadastro();
        IEntrada ent = new EntradaPainel();
        Aluno aluno;
        Disciplina disc;
        boolean ver;
		int continuar,op;
        
        do {
        	op = Integer.parseInt( JOptionPane.showInputDialog("Menu: \n 1-cadastrar\n 2-remover\n 3-Listar \n opcao:"));
        	
            switch(op) {
            case 1:
            	aluno = new Aluno();
                disc = new Disciplina();
                 
             	ent.lerDados(aluno);
                ent.lerDadosDisc(disc);
                 
                 ver = aluno.listaD.addDisciplina(disc);
                 
                 if(ver == true){
                     System.out.println("Foi Disciplina!!");
                 }else{
                     System.out.println("Nao Foi Disciplina!!");
                 }
                 
                 ver = cadastro.addCadastro(aluno);
                 
                 if(ver == true){
                     System.out.println("Foi!!");
                 }else{
                     System.out.println("Nao Foi!!");
                 }
            	break;
            case 2:
            	aluno = new Aluno();
            	ent.lerDados(aluno);
            	if(cadastro.comparar(aluno)) {
            		cadastro.removerCadastro(aluno);
            	}
            	cadastro.removerCadastro(aluno);
            	break;
            case 3:
            	 cadastro.listar();
            	break;
            }
           
            
            continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar");
            
        }while(continuar == 0);
        
       
    }
}
