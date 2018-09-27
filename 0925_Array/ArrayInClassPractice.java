package Array;

public class ArrayInClassPractice {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		//Create an array of size 10 
		
		for(int i= 0 ; i<array.length; i++) {
			array[i]= i * i;
		}
		//Using a loop assign the first 5 elements in the array, its index value squared. Eg. array[1] = 1, array[2] = 4
		
		
		int[]arrayCopy = new int[array.length];
		arrayCopy = array;
		//Copy that array into another array.(So change the original array will change the copied one at the same time)
		
//		int[] arrayCopy =new int[10];
//		for(int i=0 ; i<arrayCopy.length ; i++) {
//			arrayCopy[i]= array[i];
//		}
		//In this way, change the value of the original one won't change the copied one
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.print("\n");
		//Using a for loop print out the entire original array
		
		arrayCopy[3]=900;
		
		int i =0;
		while(i< array.length) {
			System.out.print(array[i]+" ");
			i++;
		}
		//Print the original array using a while loop.

	}

}

