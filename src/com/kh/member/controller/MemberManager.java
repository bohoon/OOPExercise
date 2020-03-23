package com.kh.member.controller;
import java.util.Scanner;

import com.kh.member.model.vo.*;
public class MemberManager {

	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	
	public void insertMember() {
		for(int i = 0; i < m.length; i++) {
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
		
		m[i] = new Member(id,pwd,name,age,gender,email);
		ctn++;
		}
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���θ޴��� ���ư��ϴ�.");
	}
	
	public void searchId() {
		System.out.println("�˻��� ���̵� �Է��ϼ���  : ");
		String Id = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId()==Id) {
				System.out.println(m[i]);
			}else if(i == m.length-1) {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");return;
			}
		}
	}
	
	public void searchName() {
		System.out.println("�˻��� �̸��� �Է��ϼ��� : ");
		String Name = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserName()==Name) {
				System.out.println(m[i]);
			}else if(i == m.length-1) {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");return;
			}
		}
	}
}
