package aulinhas;

public class Matrizinha {

	public static void main(String[] args) {
		
	//	int m[][] = new int [1][2]; //declarar matriz
		int[][] m1 =  new int [][] { {1, 2}, {3, 3}, {0, 0} }; //matriz com 2 colunas e 3 linnhas
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 2; j++) {
				
				System.out.print(m1[i][j] + " ");
				
			}
			
			System.out.println();
		}
		
		
	}

}
