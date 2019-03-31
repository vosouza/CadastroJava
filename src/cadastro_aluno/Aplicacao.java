package cadastro_aluno;

import java.util.Scanner;

/**
 * Escreva a descrição da classe Aplicacao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Aplicacao
{

    public static void main(String args[]){
        Cadastro cadAluno = new Cadastro(5);
        IEntrada ent = new EntradaConsole();
        Scanner scan = new Scanner( System.in );
        
        int op= 0;
        while(op != 4){
            System.out.println("Cadastro de Aluno\n\n");
            System.out.println("Menu: \n 1-cadastrar\n 2-remover\n 3-buscar\n 4-sair opcao:");
            op = scan.nextInt();
            switch(op){
                case 1:
                    cadastrar(ent,cadAluno);
                break;
                case 2:
                    deletar(ent,cadAluno);
                break;
                case 3:
                    ent.show(cadAluno.dadosAluno(ent.getRa()));
                break;
            }
        }
        scan.close();
        
        
    }
    
    public static void cadastrar(IEntrada ent, Cadastro cadAluno){
        boolean x;
        x = cadAluno.inserirAluno(ent.getNome(),ent.getIdade(), ent.getRg(), ent.getRa(), ent.getSemestre());
        if(x){
            System.out.println("\n\nCadastrado com sucesso \n\n");
        }else{
            System.out.println("\n\n Falha ao tentar cadastrar\n\n");
        }
    }
    
    public static void deletar(IEntrada ent, Cadastro cadAluno){
        boolean x;
        x = cadAluno.deletarAluno(ent.getRa());
        if(x){
            System.out.println("\n\nDeletado com sucesso \n\n");
        }else{
            System.out.println("\n\n Falha ao tentar deletar\n\n");
        }
    }
    

}
