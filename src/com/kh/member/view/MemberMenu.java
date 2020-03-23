package com.kh.member.view;

import java.util.Scanner;

import com.kh.member.controller.MemberManager;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberManager mm = new MemberManager();

	MemberMenu menu = new MemberMenu();
	public void mainMenu() {
		do {
			System.out.println("=========== ȸ�� ���� �޴� ===========");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("9. ����");
			System.out.println("=================================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : mm.insertMember();break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			}
			
			if(num == 9) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}while(true);
	}
	
	public void searchMemberMenu() {
		do {
			System.out.println("=========== ȸ�� ���� �˻� ===========");
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸����� �˻��ϱ�");
			System.out.println("3. �̸��Ϸ� �˻��ϱ�");
			System.out.println("9. ���θ޴���");
			System.out.println("=================================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			int num = sc.nextInt();
			switch(num) {
			case 1 : break;
			case 2 : break;
			case 3 : break;
			case 9 : System.out.println("���θ޴��� �̵��մϴ�.");menu.mainMenu();return;
			}
			
		}while(true);
	}
	
	
	public void updateMemberMenu() {
		do {
			System.out.println("=========== ȸ�� ���� ���� ===========");
			System.out.println("1. ��й�ȣ �����ϱ�");
			System.out.println("2. �̸� �����ϱ�");
			System.out.println("3. �̸��� �����ϱ�");
			System.out.println("9. ���θ޴���");
			System.out.println("================================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : break;
			case 2 : break;
			case 3 : break;
			case 9 : System.out.println("���θ޴��� �̵��մϴ�.");menu.mainMenu();return;
			}
			
			
		}while(true);
	}
	
	public void deleteMemberMenu() {
		do {
			System.out.println("=========== ȸ�� ���� ���� ===========");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. ��ü ȸ�� ����");
			System.out.println("9. ���θ޴���");
			System.out.println("================================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : break;
			case 2 : break;
			case 9 : System.out.println("���θ޴��� �̵��մϴ�.");menu.mainMenu();return;
			}
		}while(true);
		
	}
}
