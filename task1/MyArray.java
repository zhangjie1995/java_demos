package hello;

public class MyArray {
	public int[] array = new int[10];
	public int index = 0;
	public void add(int a) {
		if(index < array.length ) {
			array[index] = a;
			index++;
		}else {
			System.out.println("out of stack");
		}
	}
	public int max() {
		int result = 0;
		for(int i=0; i < array.length; i++) {
			if(result < array[i]) {
				result = array[i];
			}
		}
		return result;
	}
	public void sort() {
		int N = array.length;
		for(int i=0; i < N; i++) {
			int min = i;
			for(int j = min+1;j < N; j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}	
	}
	public int length() {
		return array.length;
	}
	public int[] output() {
		return array;
	}
}
