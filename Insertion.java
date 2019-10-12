
import java.util.Random;

public class Insertion {

	public static void main(String[] args) {
	
		int[] vetor10 = new int[10000];
		Random random = new Random();
		int[] vetor10aux= new int[10000];
		for(int i =0;i<vetor10.length;i++) {
			vetor10[i]= random.nextInt();
		}
		
		vetor10aux= vetor10;
		int contadorcomp=0; int contadortrocas=0;
		
		for (int i = 0; i < vetor10.length; i++) {
			vetor10[i] = vetor10aux[i];
		}
		
		long dtinicio = System.currentTimeMillis();
		
		for (int i = 1; i < vetor10.length; ++i) {
			int aux = vetor10[i];
			int j = i - 1;
			while (j >= 0 && vetor10[j] > aux) { // <----COMPARAÇÃO
				vetor10[j + 1] = vetor10[j];
				j = j - 1;
				contadortrocas++;
			}
			contadorcomp++;
			vetor10[j + 1] = aux;
		}

		long dtfim = System.currentTimeMillis();
		
		long tempo = dtfim - dtinicio;

		System.out.println("Insertion sort vetor de 10mil :" + tempo + " " + contadortrocas + " " + contadorcomp);


		contadorcomp = 0;
		contadortrocas = 0;
		
		int ctd= 0;
		for(int k = (vetor10.length-1); k>=0; k--) {
			vetor10aux[ctd] = vetor10[k];
			ctd++;
		}
		
		dtinicio = System.currentTimeMillis();
		
		for (int i = 1; i < vetor10aux.length; ++i) {
			int aux = vetor10aux[i];
			int j = i - 1;
			while (j >= 0 && vetor10aux[j] > aux) { // <----COMPARAÇÃO
				vetor10aux[j + 1] = vetor10aux[j];
				j = j - 1;
				contadortrocas++;
			}
			contadorcomp++;
			vetor10[j + 1] = aux;
		}
		dtfim = System.currentTimeMillis();

		tempo = dtfim - dtinicio;
		System.out.println("Insertion sort vetor de 10mil invertido:" + tempo + " " + contadortrocas + " " + contadorcomp);
		int[] vetor10invertido = vetor10;
		
		//já ordenado
		
				dtinicio = System.currentTimeMillis();
				contadorcomp = 0;
				contadortrocas = 0;
				for (int i = 1; i < vetor10.length; ++i) {
					int aux = vetor10[i];
					int j = i - 1;
					while (j >= 0 && vetor10[j] > aux) { // <----COMPARAÇÃO
						vetor10[j + 1] = vetor10[j];
						j = j - 1;
						contadortrocas++;
					}
					contadorcomp++;
					vetor10[j + 1] = aux;
				}

				dtfim = System.currentTimeMillis();
				tempo = dtfim - dtinicio;
				System.out.println("Insertionsort 10mil já ordenado:" + tempo + " " + contadortrocas + " " + contadorcomp);
		

		
				//com 100mil
				int[] vetor100 = new int[100000];
				int[] vetor100aux= new int[10000];
				for(int i =0;i<vetor100.length;i++) {
					vetor100[i]= random.nextInt();
				}
				vetor100aux= vetor100;
				
				
				for (int i = 0; i < vetor10.length; i++) {
					vetor100[i] = vetor100aux[i];
				}

				dtinicio = System.currentTimeMillis();
				contadorcomp = 0;
				contadortrocas = 0;
				for (int i = 1; i < vetor100.length; ++i) {
					int aux = vetor100[i];
					int j = i - 1;
					while (j >= 0 && vetor100[j] > aux) { // <----COMPARAÇÃO
						vetor100[j + 1] = vetor100[j];
						j = j - 1;
						contadortrocas++;
					}
					contadorcomp++;
					vetor100[j + 1] = aux;
				}

				dtfim = System.currentTimeMillis();;
				tempo = dtfim - dtinicio;
				System.out.println("Insertion sort vetor de 100mil :" + tempo + " " + (contadortrocas*(-1)) + " " + contadorcomp);

				
				ctd= 0;
				for(int k = (vetor100.length-1); k>=0; k--) {
					vetor100aux[ctd] = vetor100[k];
					ctd++;
				}
				
				dtinicio = System.currentTimeMillis();
				contadorcomp = 0;
				contadortrocas = 0;
				for (int i = 1; i < vetor100aux.length; ++i) {
					int aux = vetor100[i];
					int j = i - 1;
					while (j >= 0 && vetor100aux[j] > aux) { // <----COMPARAÇÃO
						vetor100aux[j + 1] = vetor100aux[j];
						j = j - 1;
						contadortrocas++;
					}
					contadorcomp++;
					vetor100[j + 1] = aux;
				}

				dtfim = System.currentTimeMillis();
				tempo = dtfim - dtinicio;
				System.out.println("Insertion sort vetor de 100mil invertido:" + tempo + " " + contadortrocas + " " + contadorcomp);
				
				
				//já ordenado
				vetor100=vetor100aux;
				dtinicio = System.currentTimeMillis();
				contadorcomp = 0;
				contadortrocas = 0;
				for (int i = 1; i < vetor100.length; ++i) {
					int aux = vetor100[i];
					int j = i - 1;
					while (j >= 0 && vetor100[j] > aux) { // <----COMPARAÇÃO
						vetor100[j + 1] = vetor100[j]; // <----TROCA
						j = j - 1;
						contadortrocas++;
					}
					contadorcomp++;
					vetor100[j + 1] = aux;
				} 

				dtfim = System.currentTimeMillis();
				tempo = dtfim - dtinicio;
				System.out.println("Insertionsort 100mil já ordenado:" + tempo + " " + contadortrocas + " " + contadorcomp);
				
			}

		}

