package array;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int arr[] = {10, 54, 13, 17, 25, 30};
		
		Scanner scan = new Scanner(System.in);
		String s1;
		
		System.out.print("짝수 또는 홀수를 입력하세요 : ");
		s1=scan.next();
		
		
		switch(s1) {
		case "짝수" :
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%2==0) {
					System.out.println("짝수 : " + arr[i]);
				}
			}
			break;
		case "홀수" :
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%2!=0) {
					System.out.println("홀수 : " + arr[i]);
				}
			}
			break;
		}
	
	}
}

