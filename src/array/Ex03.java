package array;

public class Ex03 {

	public static void main(String[] args) {
		String[] str = {"a", "b", "c"};
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("==================");
		
		// 각 수를 짝수 홀수로 구분하기
		
		int arr[] = {10, 54, 13, 17, 25, 30};
		for(int i=0; i<arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.println("짝수 : " + arr[i]);
			} else {
				System.out.println("홀수 : " + arr[i]);
			}
		}
		System.out.println("==================");
		
		for(int n : arr) {
		    if(n%2 == 0 ) {
		       System.out.println("짝수 : " + n);
		    }else {
		    	System.out.println("홀수 : " + n);
		  	}
		}
		   

	}
}
	
	