package array;

import java.util.Scanner;

public class TestEx02 {
	
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
			System.out.println("3. 특정회원 보기");
			System.out.println("4. 특정회원 비밀번호 수정");
			System.out.println("5. 특정회원 정보 삭제");
			System.out.println("6. 모든 회원 정보 보기");
			System.out.println("7. 종료");
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
				
			case 3 :
				System.out.print("회원 아이디를 입력하세요 : ");
				inputId = scan.next();
				for(index=0; index<id.length; index++) {
					if (inputId.equals(id[index])) {
						System.out.println("회원아이디 : " + id[index] 
								+ ", 회원 비밀번호 : " + id[index]);
						break;
					}
				}
				
			case 4 :
				System.out.print("비밀번호를 입력하세요 : ");
				inputPw = scan.next();
				for(index=0; index<pw.length; index++) {
					if (inputPw.equals(pw[index])) {
						System.out.println("현재비밀번호 : " + id[index]);
					}
					System.out.println("수정할 비밀번호 : ");
					inputPw=scan.next();
					id[index]=inputPw;
					System.out.println("수정되었습니다.");
					System.out.println("수정한 비밀번호 : " + id[index]);
					break;
				}
			
			case 5 :
				System.out.print("회원 아이디를 입력하세요 : ");
				inputId = scan.next();
				for(index=0; index<id.length; index++) {
					if (inputId.equals(id[index])) {
						System.out.println("회원아이디 : " + id[index] 
								+ ", 회원 비밀번호 : " + pw[index]);
					} 
					id[index]=null;
					pw[index]=null;
					System.out.println("회원 정보가 삭제되었습니다.");
					break;
				}
			
			case 6 :
				for(index=0; index<id.length; index++) {
					System.out.println(index+1 + "번째 회원 아이디 : " + id[index]
							+ ", "+ index+1 + "번째 회원 비밀번호 : " + pw[index] );
				}

			case 7 :
				System.out.println("프로그램 종료");
				System.exit(1);
					
			}
		}
	}
		
		
}


