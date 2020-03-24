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
		System.out.print("���̵� : ");
		String id = sc.next();
		System.out.print("�н����� : ");
		String pwd = sc.next();
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("���� : ");
		char gender = sc.next().charAt(0);
		System.out.print("�̸��� : ");
		String email = sc.next();
		
		m[ctn] = new Member(id,pwd,name,age,gender,email);
		ctn++;
		
		i++;
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���θ޴��� ���ư��ϴ�.");
		break;
		}

	}
	
	public void searchId() {
		System.out.println("�˻��� ���̵� �Է��ϼ���  : ");
		String Id = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(Id)) {
				m[i].printOne(m);
			}else if(i == m.length-1) {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");return;
			}
		}
	}
	
	public void searchName() {
		System.out.println("�˻��� �̸��� �Է��ϼ��� : ");
		String Name = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserName().equals(Name)) {
				System.out.println(m[i]);
			}else if(i == m.length-1) {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");return;
			}
		}
	}
	
	public void searchEmail() {
		System.out.println("�˻��� �̸����� �Է��ϼ���  : ");
		String emil = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getEmail().equals(emil)) {
				System.out.println(m[i]);
			}else if(i == m.length-1) {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");return;
			}
		}
	}
	
	public void updatePwd() {
		System.out.println("������ ȸ���� ���̵� �Է��ϼ���  : ");
		String id = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(id)) {
				System.out.print("������ ��й�ȣ�� �Է� �ϼ��� :");
				String pwd = sc.next();
				m[i].setUserPwd(pwd);
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�.");
				return;
			}else if(i == m.length-1) {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");return;
			}
		}
	}
	
	public void updateName() {
		System.out.println("������ ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId() == id) {
				System.out.print("������ �̸��� �Է� �ϼ���  :");
				String name = sc.next();
				m[i].setUserName(name);
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�.");
				return;
			}else if(i == m.length-1) {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");return;
			}
		}
	}
	
	public void updateEmail() {
		System.out.println("������ ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(id)) {
				System.out.print("������ �̸����� �Է� �ϼ���  :");
				String email = sc.next();
				m[i].setEmail(email);
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�.");
				return;
			}else if(i == m.length-1) {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");return;
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
