package cadastro_aluno;

import java.util.Scanner;

/**
 * Escreva a descrição da classe EntradaConsole aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class EntradaConsole implements IEntrada
{
	Scanner scan = new Scanner( System.in );
    public String getNome(){
        System.out.println("Digite o nome do Aluno:");
        return scan.nextLine();
    }
    public int getIdade(){
        System.out.println("Digite o idade do Aluno:");
        return scan.nextInt();
    }
    public String getRg(){
        Scanner sc = new Scanner( System.in );
        System.out.println("Digite o RG do Aluno:");
        return sc.nextLine();
    }
    public String getRa(){
        Scanner sc = new Scanner( System.in );
        System.out.println("Digite o RA do Aluno:");
        return sc.nextLine();
    }
    public int getSemestre(){
        System.out.println("Digite o Semestre do Aluno:");
        return scan.nextInt();
    }
    public void show(String dado){
        System.out.println(dado);
    }
    
}
