import java.util.Random;

public class QuickSortMain {
	
	static int ctd1 = 0;
	static int comp = 0;

	public static void main(String[] args) {
		
		long dtinicio, dtfim;
		int[] vetor10 = new int[10000];
		Random random = new Random();
		int[] vetor10aux= new int[10000];
		for(int i =0;i<vetor10.length;i++) {
			vetor10[i]= random.nextInt(); 
			vetor10aux[i] = random.nextInt();
		} 
		
		
		int ctd= 0;
		for(int k = (vetor10.length-1); k>=0; k--) {
			vetor10aux[ctd] = vetor10aux[k];
			ctd++;
		}
		
		
		int[] vetor100 = new int[100000];
		int[] vetor100aux= new int[100000];
		for(int i =0;i<vetor100.length;i++) {
			vetor100[i]= random.nextInt();
			vetor100aux[i] = random.nextInt();
		}
		
		
		ctd= 0;
		for(int k = (vetor100.length-1); k>=0; k--) {
			vetor100aux[ctd] = vetor100aux[k];
			ctd++;
		}
		
		dtinicio = System.currentTimeMillis();
		
		quickSort(vetor10, 0, vetor10.length-1);
		dtfim = System.currentTimeMillis() - dtinicio;
		System.out.println("Quick sort aleatorio com 10mil :\n Tempo:"+ dtfim +" trocas: "+(ctd1)+" Comparações: "+comp);
		ctd1 = 0;
		comp = 0;	
		
		dtinicio = System.currentTimeMillis();
		quickSort(vetor10, 0, vetor10.length-1);
		dtfim = System.currentTimeMillis() - dtinicio;
		System.out.println("Quick sort já ordenado com 10mil :\n Tempo:"+ dtfim +" trocas: "+(ctd1)+" Comparações: "+comp);
		ctd1 = 0;
		comp = 0;	
		
		dtinicio = System.currentTimeMillis();
		quickSort(vetor10aux, 0, vetor10aux.length-1);
		dtfim = System.currentTimeMillis() - dtinicio;
		System.out.println("Quick sort invertido com 10mil :\n Tempo:"+ dtfim +" trocas: "+(ctd1)+" Comparações: "+comp);
		ctd1 = 0;
		comp = 0;	
		

		dtinicio = System.currentTimeMillis();
		quickSort(vetor100, 0, vetor100.length-1);
		dtfim = System.currentTimeMillis() - dtinicio;
		System.out.println("Quick sort alatorio com 100mil :\n Tempo:"+ dtfim +" trocas: "+(ctd1)+" Comparações: "+comp);
		ctd1 = 0;
		comp = 0;	
		
		dtinicio = System.currentTimeMillis();
		quickSort(vetor100, 0, vetor10.length-1);
		dtfim = System.currentTimeMillis() - dtinicio;
		System.out.println("Quick sort já ordenado 100mil :\n Tempo:"+ dtfim +" trocas: "+(ctd1)+" Comparações: "+comp);
		ctd1 = 0;
		comp = 0;	
		
		dtinicio = System.currentTimeMillis();
		quickSort(vetor100aux, 0, vetor100aux.length-1);
		dtfim = System.currentTimeMillis() - dtinicio;
		System.out.println("Quick sort invertido com 100mil :\n Tempo:"+ dtfim +" trocas: "+(ctd1)+" Comparações: "+comp);
		
		
	}
	
	public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
               int posicaoPivo = separar(vetor, inicio, fim); 
               quickSort(vetor, inicio, posicaoPivo - 1);
               quickSort(vetor, posicaoPivo + 1, fim);
        }
  }

  public static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
               if (vetor[i] <= pivo) { // <----COMPARAÇÃO
            	   comp++;
                      i++;
               }else if (pivo < vetor[f]) { // <----COMPARAÇÃO
                      f--;
                      comp++;
               } else {
                      int troca = vetor[i];
                      vetor[i] = vetor[f]; // <----TROCA
                      vetor[f] = troca;
                      i++;
                      f--;
                      ctd1++; 
               }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
  }
}

