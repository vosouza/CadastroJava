package cadastro_aluno;

/**
 * Escreva a descrição da interface IEntrada aqui.
 * 
 * @author (seu nome) 
 * @version (número da versão ou data)
 */

public interface IEntrada {
   public String getNome();
   public int getIdade();
   public String getRg();
   public String getRa();
   public int getSemestre();
   public void show(String dado);
}
