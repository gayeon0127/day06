package array;

public class Ex06 {
	
	public static void main(String[] args) {
		int[] arr= new int[5];
		System.out.println(arr[0]);
		
		String[] str = new String[5];
		System.out.println(str[0]);
		
		str[0]="0";
		if(str[0]!=null) {
			System.out.println("값이 있다");
		} else {
			System.out.println("값이 없다");
		}
	}
}
