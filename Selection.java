import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Selection {

	public static void main(String[] args) {

		int[] vetor10 = new int[10000];
		int[] vetor100 = new int[100000];
		Random random = new Random();
		int[] vetor10aux = new int[10000];
		int[] vetor100aux = new int[100000];

		for (int i = 0; i < vetor10.length; i++) {
			vetor10[i] = random.nextInt();
		}
		vetor10aux = vetor10;


		for (int i = 0; i < vetor100.length; i++) {
			vetor100[i] = random.nextInt();
		}
		vetor100aux = vetor100;
		
		int contadorcomp = 0;
		int contadortrocas = 0;

		// Selection sort Aleatorio

	
		contadorcomp = 0;
		contadortrocas = 0;

		long tempoInicial = System.currentTimeMillis();

		for (int fixo = 0; fixo < vetor10.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < vetor10.length; i++) {
				if (vetor10[i] < vetor10[menor]) { // <----COMPARAÇÃO
					menor = i;

				}
			}

			if (menor != fixo) {
				int t = vetor10[fixo];
				vetor10[fixo] = vetor10[menor]; // <----TROCA
				vetor10[menor] = t;
				contadortrocas++; 
			}

			contadorcomp++;

		}

		long tempoFinal = System.currentTimeMillis();
		System.out.println("\nSelection Sort Aleatorio: " + (tempoFinal - tempoInicial) + " ms\nNumero de trocas:"+contadortrocas+"\nContador de comparaçoes:"+contadorcomp);

		// Selection Sort invertido

		
		contadorcomp = 0;
		contadortrocas = 0;

		int ctd= 0;
		for(int k = (vetor10.length-1); k>=0; k--) {
			vetor10aux[ctd] = vetor10[k];
			ctd++;
		}
		
		tempoInicial = System.currentTimeMillis();

		for (int fixo = 0; fixo < vetor10aux.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < vetor10aux.length; i++) {
				if (vetor10aux[i] > vetor10aux[menor]) { // <----COMPARAÇÃO
					menor = i;

				}
			}

			if (menor != fixo) {
				int t = vetor10[fixo];
				vetor10[fixo] = vetor10[menor]; // <----TROCA
				vetor10[menor] = t;
				contadortrocas++;
			}

			contadorcomp++;

		}

		tempoFinal = System.currentTimeMillis();
		System.out.println("\nSelection Sort invertido: " + (tempoFinal - tempoInicial) + " ms\nNumero de trocas:"+contadortrocas+"\nContador de comparaçoes:"+contadorcomp);

		// Selection sort

	
		contadorcomp = 0;
		contadortrocas = 0;

		tempoInicial = System.currentTimeMillis();

		for (int fixo = 0; fixo < vetor10.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < vetor10.length; i++) {
				if (vetor10[i] < vetor10[menor]) { // <----COMPARAÇÃO
					menor = i;

				}
			}

			if (menor != fixo) {
				int t = vetor10[fixo];
				vetor10[fixo] = vetor10[menor]; // <----TROCA
				vetor10[menor] = t;
				contadortrocas++;
			}

			contadorcomp++;

		}

		tempoFinal = System.currentTimeMillis();
		System.out.println("\nSelection Sort já ordenado: " + (tempoFinal - tempoInicial) + " ms\nNumero de trocas:"+contadortrocas+"\nContador de comparaçoes:"+contadorcomp);
		
		//#####################################################################################################
		
		
		// Selection sort Aleatorio 100.000

		contadorcomp = 0;
		contadortrocas = 0;

		tempoInicial = System.currentTimeMillis();

		for (int fixo = 0; fixo < vetor100.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < vetor100.length; i++) {
				if (vetor100[i] < vetor100[menor]) { // <----COMPARAÇÃO
					menor = i;

				}
			}

			if (menor != fixo) {
				int t = vetor100[fixo];
				vetor100[fixo] = vetor100[menor]; // <----TROCA
				vetor100[menor] = t;
				contadortrocas++;
			}

			contadorcomp++;

		}

		tempoFinal = System.currentTimeMillis();
		System.out.println("\nSelection Sort Aleatorio: " + (tempoFinal - tempoInicial) + " ms\nNumero de trocas:"+contadortrocas+"\nContador de comparaçoes:"+contadorcomp);

		// Selection Sort invertido


		contadorcomp = 0;
		contadortrocas = 0;

		
		ctd= 0;
		for(int k = (vetor100.length-1); k>=0; k--) {
			vetor100aux[ctd] = vetor100[k];
			ctd++;
		}
		
		tempoInicial = System.currentTimeMillis();

		for (int fixo = 0; fixo < vetor100aux.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < vetor100aux.length; i++) {
				if (vetor100aux[i] > vetor100aux[menor]) { // <----COMPARAÇÃO
					menor = i;

				}
			}

			if (menor != fixo) {
				int t = vetor100[fixo];
				vetor100[fixo] = vetor100[menor]; // <----TROCA
				vetor100[menor] = t;
				contadortrocas++;
			}

			contadorcomp++;

		}

		tempoFinal = System.currentTimeMillis();
		System.out.println("\nSelection Sort invertido: " + (tempoFinal - tempoInicial) + " ms\nNumero de trocas:"+contadortrocas+"\nContador de comparaçoes:"+contadorcomp);

// Selection sort

		contadorcomp = 0;
		contadortrocas = 0;

		tempoInicial = System.currentTimeMillis();

		for (int fixo = 0; fixo < vetor100.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < vetor100.length; i++) {
				if (vetor100[i] < vetor100[menor]) { // <----COMPARAÇÃO
					menor = i;

				}
			}

			if (menor != fixo) {
				int t = vetor100[fixo];
				vetor100[fixo] = vetor100[menor]; // <----TROCA
				vetor100[menor] = t;
				contadortrocas++;
			}

			contadorcomp++;

		}

		tempoFinal = System.currentTimeMillis();
		System.out.println("\nSelection Sort já ordenado: " + (tempoFinal - tempoInicial) + " ms\nNumero de trocas:"+contadortrocas+"\nContador de comparaçoes:"+contadorcomp);
		
		// ############################### Selection sort ###############################################
	}
}