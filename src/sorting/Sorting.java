package sorting;
// just a comment

public class Sorting{
	public Sorting(){};
	public boolean isSorted(int[] array){
		boolean sorted = true;
		int index = 0;
		while(index < array.length){
			if(index<array.length-1){
				if(array[index]> array[index+1]){
					sorted = false;
				}
			}
			index++;
		}
		return sorted;
	}
	public int minValue(int[] array){
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i]< min) {
				min = array[i];
			}
		}
		return min;
	}
	public int minValueIndex(int[] array){
		int minIndex = 0;
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i]< min) {
				min = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	public int[] bubbleSorting(int[] array){
		int[] aux = new int[array.length];
		aux = array;
		while(!isSorted(aux)){
			int last = aux.length-1;
			int first = 0;
			while(last > first){
				if(aux[last-1] > aux[last]){
					int bak = aux[last];
					aux[last] = aux[last-1];
					aux[last-1] = bak;
				}
				last--;
			}
			first++;
		}
		return aux;
	}
	public int[] selectionSorting(int[] array){
		int[] aux = new int[array.length];
		aux = array;
		int first = 0;
		for (int i = first; i < aux.length; i++) {
			for (int j = 0; j < aux.length; j++) {
				
			}
		}
		while(!isSorted(aux)){
			System.out.print("1 ");
			int last = aux.length-1;
			while(last > first){
				System.out.println("0");
				int bak = aux[first];
				int minIndex = minValueIndex(aux);
				System.out.println(aux[minIndex]);
				aux[first] = aux[minIndex];
				aux[minIndex] = bak;
				first++;
			}
		}
		return aux;
	}
	
	public static void printArray(int[] array){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			if(i == 0){
				sb.append("[");
				sb.append(array[i]);
				sb.append(",");
			}
			else if(i == array.length-1){
				sb.append(array[i]);
				sb.append("]");
			}
			else{
				sb.append(array[i]);
				sb.append(",");
			}
		}
		System.out.println(sb);
		
	}
	public static void main(String[] args) {
		Sorting sorting = new Sorting();
		int[] numeros = {2,4,6,9,1,5,7,8,3};
//		printArray(sorting.bubbleSorting(numeros));
//		printArray(sorting.selectionSorting(numeros));
//		System.out.println(sorting.minValueIndex(numeros));
		sorting.selectionSorting(numeros);
		
	}
}
