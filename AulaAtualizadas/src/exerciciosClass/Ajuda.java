package exerciciosClass;

public class Ajuda {
	
	boolean estaNoVetor(int vetor[], int n) {
		
		for(int i = 0; i < 5; i++) {
			
			if(vetor[i] == n) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	double mediaPonderada(double nota[], int peso[]) {
		
	//	double ponderada;
		double j = 0, k = 0;
		
		for(int i = 0; i < 5; i++) {
			
			j +=  nota[i] * peso[i];
			k+= peso[i];
			
		}
		
		return j/k;
		
	}
	
	 public void cabecalho(String nome) {
		 
		 System.out.printf("============================================================\nIFMS – Instituto Federal de Mato Grosso do Sul\nCampus: Campo Grande\nDisciplina: Linguagem de Programação 1\nNome do Aluno: %s \n============================================================", nome);
		 
	 }
	

	

}
