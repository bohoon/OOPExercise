package com.kh.member.view;

import java.util.Scanner;

import com.kh.member.controller.MemberManager;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberManager mm = new MemberManager();

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
			System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : 
			case 2 : 
			case 3 : 
			case 4 : 
			case 5 : 
			}
			
			if(num == 9) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			
		}while(true);
	}
}
