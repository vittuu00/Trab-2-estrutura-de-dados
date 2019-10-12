import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Bubble {

	public static void main(String[] args) {
		
			int[] vetor10 = new int[10000];
			Random random = new Random();
			int[] vetor10aux= new int[10000];
			for(int i =0;i<vetor10.length;i++) {
				vetor10[i]= random.nextInt();
			}
			
			vetor10aux = vetor10;
			
			long dtinicio = System.currentTimeMillis();
		
			int contadorcomp=0; int contadortrocas=0; 
			
			// Bubble sort
			for(int i=0;i<vetor10.length;i++) {
				for(int j=0;j<vetor10.length -1;j++) {
					if(vetor10[j]>vetor10[j+1]) {  // <----COMPARAÇÃO
						int aux = vetor10[j];
						vetor10[j] = vetor10[j+1]; // <----TROCA
						vetor10[j+1] = aux;
						contadortrocas++; 
						
					}
					contadorcomp++;
				}
			}
			
			long dtfim = System.currentTimeMillis();;
			long tempo = dtfim - dtinicio;
			
			System.out.println("Bubblesort aleatório "+tempo+" " + contadortrocas+" "+ contadorcomp);
			
			//Bubblesort invertido
			
			int ctd= 0;
			for(int k = (vetor10.length-1); k>=0; k--) {
				vetor10aux[ctd] = vetor10[k];
				ctd++;
			}
			
			dtinicio = System.currentTimeMillis();
			contadorcomp=0; contadortrocas=0;
			for(int i=0;i<vetor10aux.length;i++) {
				for(int j=0;j<vetor10aux.length -1;j++) {
					if(vetor10aux[j]>vetor10aux[j+1]) {
						int aux = vetor10aux[j];
						vetor10aux[j] = vetor10aux[j+1]; // <----TROCA
						vetor10aux[j+1] = aux;
						contadortrocas++;
						
					}
					contadorcomp++;
				}
			}
			 dtfim = System.currentTimeMillis();
			 tempo= dtfim - dtinicio;
			System.out.println("Bubblesort invertido "+tempo+" " + contadortrocas+" "+ contadorcomp);
			
			
			// Bubblesort ordenado
			dtinicio = System.currentTimeMillis();
			contadorcomp=0; contadortrocas=0;
			for(int i=0;i<vetor10.length;i++) {
				for(int j=0;j<vetor10.length -1;j++) {
					if(vetor10[j]>vetor10[j+1]) {  // <----COMPARAÇÃO
						int aux = vetor10[j];
						vetor10[j] = vetor10[j+1]; // <----TROCA 
						vetor10[j+1] = aux;
						contadortrocas++;
					}
					contadorcomp++;
				}
			}
			 dtfim = System.currentTimeMillis();;
			 tempo= dtfim - dtinicio;
			System.out.println("Bubble sort já ordenado " +tempo+" " + contadortrocas+" "+ contadorcomp);
			
			
			//Bubblesort com 100mil
			int[] vetor100 = new int[100000];
			int[] vetor100aux= new int[10000];
			for(int i =0;i<vetor100.length;i++) {
				vetor100[i]= random.nextInt();
			}
			vetor100aux= vetor100;
			
			dtinicio = System.currentTimeMillis();
			 contadorcomp=0;  contadortrocas=0;
			for(int i=0;i<vetor100.length;i++) {
				for(int j=0;j<vetor100.length -1;j++) {
					if(vetor100[j]>vetor100[j+1]) {  // <----COMPARAÇÃO
						int aux = vetor100[j];
						vetor100[j] = vetor100[j+1]; // <----TROCA
						vetor100[j+1] = aux;
						contadortrocas++;
						
					}
					contadorcomp++;
				}
			}
				dtfim = System.currentTimeMillis();
				tempo= dtfim - dtinicio;
			 
			System.out.println("Bubblesort 100 aleatório "+tempo+" " + contadortrocas+" "+ contadorcomp);
			//Bubblesort invertido
			
			ctd= 0;
			for(int k = (vetor100.length-1); k>=0; k--) {
				vetor100aux[ctd] = vetor100[k];
				ctd++;
			}
			
			dtinicio = System.currentTimeMillis();
			contadorcomp=0; contadortrocas=0;
			for(int i=0;i<vetor100aux.length;i++) {
				for(int j=0;j<vetor100aux.length -1;j++) {
					if(vetor100[j]>vetor100aux[j+1]) {  // <----COMPARAÇÃO
						int aux = vetor100aux[j];
						vetor100aux[j] = vetor100aux[j+1]; // <----TROCA
						vetor100aux[j+1] = aux;
						contadortrocas++;
						
					}
					contadorcomp++;
				}
			}
			 dtfim = System.currentTimeMillis();
			 tempo= dtfim - dtinicio;
			System.out.println("Bubblesort 100 invertido "+tempo+" " + contadortrocas+" "+ contadorcomp);
			
			
			// Bubblesort ordenado
			dtinicio = System.currentTimeMillis();
			contadorcomp=0; contadortrocas=0;
			for(int i=0;i<vetor100.length;i++) {
				for(int j=0;j<vetor100.length -1;j++) { 
					if(vetor100[j]>vetor100[j+1]) {  // <----COMPARAÇÃO
						int aux = vetor100[j];
						vetor100[j] = vetor100[j+1]; // <----TROCA
						vetor100[j+1] = aux;
						contadortrocas++;
						
					}
					contadorcomp++;
				}
			}
			 dtfim = System.currentTimeMillis();
			 tempo= dtfim - dtinicio;
			System.out.println("Bubble sort 100 já ordenado " +tempo+" " + contadortrocas+" "+ contadorcomp);
// ############################### Fim do Bubblesort ###############################################
			
			
	}

}

