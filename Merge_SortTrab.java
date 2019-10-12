import java.util.Arrays;
import java.util.Random;

public class Merge_SortTrab {
	
	private static int contadorcomp;
	private static int contadortrocas;

	public static void main(String[] args) {

		Random random = new Random();
		
		int[] input = new int[10000];
		int[] input2 = new int[10000];

		for (int i = 0; i < input.length; i++) {
			input[i] = random.nextInt();
		}
		int ctd= 0;
		for(int k = (input.length-1); k>=0; k--) {
			input2[ctd] = input[k];
			ctd++;
		}
		
		long tempoInicial = System.currentTimeMillis();
		mergesort(input);
		long tempoFinal = System.currentTimeMillis();
		
		System.out.println("\nMerge Sort 10k Aleatorio: " + (tempoFinal - tempoInicial)
				+ " ms\nNumero de trocas:" + contadortrocas + "\nContador de comparaçoes:" + contadorcomp);
		
		
		tempoInicial = System.currentTimeMillis();
		mergesort(input);
		tempoFinal = System.currentTimeMillis();
		
		System.out.println("\nMerge Sort 10k já ordenado: " + (tempoFinal - tempoInicial)
				+ " ms\nNumero de trocas:" + contadortrocas + "\nContador de comparaçoes:" + contadorcomp);
	
		
		tempoInicial = System.currentTimeMillis();
		mergesort(input2);
		tempoFinal = System.currentTimeMillis();
		
		System.out.println("\nMerge Sort 10k invertido: " + (tempoFinal - tempoInicial)
				+ " ms\nNumero de trocas:" + contadortrocas + "\nContador de comparaçoes:" + contadorcomp);
		
		
// ######################################################################################################################
		
		int[] input100000 = new int[100000];
		int[] input1000002 = new int[100000];
		
		for (int i = 0; i < input100000.length; i++) {
			input100000[i] = random.nextInt();
		}

		ctd= 0;
		for(int k = (input100000.length-1); k>=0; k--) {
			input1000002[ctd] = input100000[k];
			ctd++;
		}

	
		
		tempoInicial = System.currentTimeMillis();
		mergesort(input100000);
		tempoFinal = System.currentTimeMillis();
		
		System.out.println("\nMerge Sort 100k Aleatorio: " + (tempoFinal - tempoInicial)
				+ " ms\nNumero de trocas:" + contadortrocas + "\nContador de comparaçoes:" + contadorcomp);
		
	
		
		tempoInicial = System.currentTimeMillis();
		mergesort(input100000);
		tempoFinal = System.currentTimeMillis();
		
		System.out.println("\nMerge Sort 100k já ordenado: " + (tempoFinal - tempoInicial)
				+ " ms\nNumero de trocas:" + contadortrocas + "\nContador de comparaçoes:" + contadorcomp);
		
		
		tempoInicial = System.currentTimeMillis();
		mergesort(input1000002);
		tempoFinal = System.currentTimeMillis();
		
		System.out.println("\nMerge Sort 10k invertido: " + (tempoFinal - tempoInicial)
				+ " ms\nNumero de trocas:" + contadortrocas + "\nContador de comparaçoes:" + contadorcomp);

		
	}

	public static void mergesort(int[] input) {
		mergesort(input, 0, input.length - 1);
	}

	private static void mergesort(int[] input, int start, int end) { 

		contadorcomp = 0;
		contadortrocas = 0;
		
		int mid = (start + end) / 2;
		if (start < end) { 
			mergesort(input, start, mid);
			mergesort(input, mid + 1, end);
			
		}
		
		int i = 0, first = start, last = mid + 1;
		int[] tmp = new int[end - start + 1]; 

		while (first <= mid && last <= end) {
			tmp[i++] = input[first] < input[last] ? input[first++] : input[last++]; // <----COMPARAÇÃO
			contadorcomp++;
		
		}
		while (first <= mid) {
			tmp[i++] = input[first++]; // <----TROCA
			contadortrocas++;
		}
		while (last <= end) {
			tmp[i++] = input[last++]; // <----TROCA
			contadortrocas++;
		}
		i = 0;
		while (start <= end) {
			input[start++] = tmp[i++]; // <----TROCA
			contadortrocas++;
		}
	}
	
// ######################################################################################################################
	
	

	public static void mergesort100000(int[] input100000) {
		mergesort100000(input100000, 0, input100000.length - 1);
	}

	private static void mergesort100000(int[] input100000, int start, int end) {

		contadorcomp = 0;
		contadortrocas = 0;
		
		int mid = (start + end) / 2;
		if (start < end) { 
			mergesort100000(input100000, start, mid);
			mergesort100000(input100000, mid + 1, end);
			
		}
		
		int i = 0, first = start, last = mid + 1;
		int[] tmp = new int[end - start + 1];

		while (first <= mid && last <= end) { 
			tmp[i++] = input100000[first] < input100000[last] ? input100000[first++] : input100000[last++]; // <----COMPARAÇÃO
			contadorcomp++;
		
		}
		while (first <= mid) {
			tmp[i++] = input100000[first++];  // <----TROCA
			contadortrocas++;
		}
		while (last <= end) {
			tmp[i++] = input100000[last++];  // <----TROCA
			contadortrocas++;
		}
		i = 0;
		while (start <= end) {
			input100000[start++] = tmp[i++];  // <----TROCA
			contadortrocas++;
		}
	}
	
}




