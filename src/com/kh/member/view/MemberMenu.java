package com.kh.member.view;

import java.util.Scanner;

import com.kh.member.controller.MemberManager;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberManager mm = new MemberManager();

	MemberMenu menu = new MemberMenu();
	public void mainMenu() {
		do {
			System.out.println("=========== 회원 관리 메뉴 ===========");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("9. 종료");
			System.out.println("=================================");
			System.out.print("메뉴 번호를 입력하세요 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : mm.insertMember();break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			}
			
			if(num == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}while(true);
	}
	
	public void searchMemberMenu() {
		do {
			System.out.println("=========== 회원 정보 검색 ===========");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인메뉴로");
			System.out.println("=================================");
			System.out.print("메뉴 번호를 입력하세요 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1 : break;
			case 2 : break;
			case 3 : break;
			case 9 : System.out.println("메인메뉴로 이동합니다.");menu.mainMenu();return;
			}
			
		}while(true);
	}
	
	
	public void updateMemberMenu() {
		do {
			System.out.println("=========== 회원 정보 수정 ===========");
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인메뉴로");
			System.out.println("================================");
			System.out.print("메뉴 번호를 입력하세요 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : break;
			case 2 : break;
			case 3 : break;
			case 9 : System.out.println("메인메뉴로 이동합니다.");menu.mainMenu();return;
			}
			
			
		}while(true);
	}
	
	public void deleteMemberMenu() {
		do {
			System.out.println("=========== 회원 정보 삭제 ===========");
			System.out.println("1. 회원 삭제");
			System.out.println("2. 전체 회원 삭제");
			System.out.println("9. 메인메뉴로");
			System.out.println("================================");
			System.out.print("메뉴 번호를 입력하세요 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : break;
			case 2 : break;
			case 9 : System.out.println("메인메뉴로 이동합니다.");menu.mainMenu();return;
			}
		}while(true);
		
	}
}
