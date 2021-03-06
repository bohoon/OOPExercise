package com.kh.member.controller;
import java.util.Scanner;

import com.kh.member.model.vo.*;
public class MemberManager {

	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	
	public void insertMember() {
		int i = 0;
		while(i < m.length) {
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("패스워드 : ");
		String pwd = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		System.out.print("이메일 : ");
		String email = sc.next();
		
		m[ctn] = new Member(id,pwd,name,age,gender,email);
		ctn++;
		
		i++;
		System.out.println("입력이 완료되었습니다. 메인메뉴로 돌아갑니다.");
		break;
		}

	}
	
	public void searchId() {
		System.out.println("검색할 아이디를 입력하세요  : ");
		String Id = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(Id)) {
				m[i].printOne(m);
			}else if(i == m.length-1) {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");return;
			}
		}
	}
	
	public void searchName() {
		System.out.println("검색할 이름을 입력하세요 : ");
		String Name = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserName().equals(Name)) {
				System.out.println(m[i]);
			}else if(i == m.length-1) {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");return;
			}
		}
	}
	
	public void searchEmail() {
		System.out.println("검색할 이메일을 입력하세요  : ");
		String emil = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getEmail().equals(emil)) {
				System.out.println(m[i]);
			}else if(i == m.length-1) {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");return;
			}
		}
	}
	
	public void updatePwd() {
		System.out.println("수정할 회원의 아이디를 입력하세요  : ");
		String id = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(id)) {
				System.out.print("변경할 비밀번호를 입력 하세요 :");
				String pwd = sc.next();
				m[i].setUserPwd(pwd);
				System.out.println("패스워드 수정이 완료되었습니다.");
				return;
			}else if(i == m.length-1) {
				System.out.println("수정할 회원이 존재하지 않습니다.");return;
			}
		}
	}
	
	public void updateName() {
		System.out.println("수정할 아이디를 입력하세요 : ");
		String id = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId() == id) {
				System.out.print("변경할 이름을 입력 하세요  :");
				String name = sc.next();
				m[i].setUserName(name);
				System.out.println("패스워드 수정이 완료되었습니다.");
				return;
			}else if(i == m.length-1) {
				System.out.println("수정할 회원이 존재하지 않습니다.");return;
			}
		}
	}
	
	public void updateEmail() {
		System.out.println("수정할 아이디를 입력하세요 : ");
		String id = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(id)) {
				System.out.print("변경할 이메일을 입력 하세요  :");
				String email = sc.next();
				m[i].setEmail(email);
				System.out.println("패스워드 수정이 완료되었습니다.");
				return;
			}else if(i == m.length-1) {
				System.out.println("수정할 회원이 존재하지 않습니다.");return;
			}
		}
	}
	
	public void deleteOne() {
		
	}
	
	public void deleteAll() {
		
	}
	
	public void printAllMember() {
		
	}
	
	public void pringOne(Member m) {
		System.out.println(m.getUserId());
		System.out.println(m.getUserPwd());
		System.out.println(m.getUserName());
		System.out.println(m.getAge());
		System.out.println(m.getGender());
		System.out.println(m.getEmail());
		
	}
}
