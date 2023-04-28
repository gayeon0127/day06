package array;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		} 
		System.out.println("===============");
		
		for ( int n : arr) {
			System.out.println(n);
			// for each문 - 각 값이 순차적으로 n에 대입되고 종속문장이 실행됨
		}
		
		System.out.println("===============");
		
		for(int i=0;i<arr.length; i++) {
			arr[i]= arr[i]+100;
			System.out.println(arr[i]);
		}
		System.out.println("===============");
		
		int index=0;
		for ( int n : arr) {
			arr[index] = arr[index]-100;
			System.out.println(arr[index]);
			index++;
		}
		

	}

}
