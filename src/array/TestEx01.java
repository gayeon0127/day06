package array;

import java.util.Scanner;

public class TestEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] id  = new String[5];
		String[] pw = new String[5];
		
		
		String inputId = null,inputPw = null;
		int array_idx =0;
		boolean bool = true;
		int index, count=0;
			
		while(true) {
			
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			System.out.print("번호 입력 >>> ");
			int num = scan.nextInt();
		
			switch(num) {
			case 1 :
				System.out.print("아이디를 입력하세요 : ");
				inputId = scan.next();
				System.out.print("비밀번호를 입력하세요 : ");
				inputPw = scan.next();
	
				for(int i=0; i<id.length; i++) {
					if (inputId.equals(id[i])) {
						if (inputPw.equals(pw[i])) {
						System.out.println("인증을 성공했습니다");
						} else {
						System.out.println("비밀번호가 틀렸습니다.");
						} 
						bool = false;
						break;
					}
					if (bool) {
						System.out.println("존재하지 않는 아이디입니다.");
					}
				}
				break;
				
			case 2 :
				
				System.out.print("아이디를 입력하세요 : ");
				inputId = scan.next();
				System.out.print("비밀번호를 입력하세요 : ");
				inputPw = scan.next();
				
				if(count<id.length) {
					for(index=0; index<count; index++) {
						if(inputId.equals(id[index])) {
							System.out.println("중복된 아이디입니다.");
							break;
						} 
					}
					if (index==count) {
						id[count]=inputId;
						pw[count]=inputPw;
						count++;
					}
				}else {
					System.out.println("저장공간이 부족합니다.");
				}
				
				
				/*
				for (index=0; index<id.length; index++) {
					if(inputId.equals(id[index])) {
						System.out.println("중복된 아이디입니다.");
					} 
					if(id[index]==null) {
						id[index]=inputId;
						pw[index]=inputPw;
						System.out.println("인증통과");
						break;
					}
				}
				if (index==id.length) {
					System.out.println("저장공간이 부족합니다.");
				}
				break;
				*/

			case 3 :
				System.out.println("프로그램 종료");
				System.exit(1);
					
			}
		}
	}
}





