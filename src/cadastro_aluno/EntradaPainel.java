package ledcadastro;

import javax.swing.JOptionPane;

public class EntradaPainel implements IEntrada{
	public void lerDados(Aluno aluno){
			boolean b=true;
			do {
				try {
		            aluno.setNomeP(JOptionPane.showInputDialog("Digite o nome:"));
		
		            aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade:")));
		
		            aluno.setRg(JOptionPane.showInputDialog("Digite o RG:"));
		
		            aluno.setRa(JOptionPane.showInputDialog("Digite o RA:"));
		
		            aluno.setSemestre(Integer.parseInt(JOptionPane.showInputDialog("Digite o Semestres:")));
		            b = false;
		            
				}catch(NumberFormatException  e) {
					JOptionPane.showMessageDialog(null, "Voce digitou um valor invalido!"); 
					b=true;
					
				}
			}while(b);
	}
        
        
        public void lerDadosDisc(Disciplina disc){
        	boolean b=true;
			do {
				try {
		            disc.setDisciplina(JOptionPane.showInputDialog("Digite o nome da disciplina: "));
		
		            disc.setProf(JOptionPane.showInputDialog("Digite o nome do professor: "));
		
		            disc.setNota(Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: ")));
		            b=false;
				}catch(NumberFormatException  e) {
					JOptionPane.showMessageDialog(null, "Voce digitou um valor invalido!"); 
					b=true;
					
				}
			}while(b);
        }
}
