package com.biz.coll.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class List_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		List<Integer> intList = new LinkedList<Integer>();

		for (int i = 0; i < 50; i++) {
			int intR = rnd.nextInt(50);
			intList.add(intR);
		}
		// Ű���忡�� ���� ���ڸ� �Է¹ް�
		// �� ���ڰ� intList�� ����� ���ԵǾ��ִ��� ã�ƺ���
		System.out.println("���� �Է�(0~49) >");
		String strNum = sc.nextLine();

		int intNum = Integer.valueOf(strNum);
		
		int listSize = intList.size();
		for (int i = 0; i < listSize; i++) {
			if (intList.get(i) == intNum) {
				System.out.println(intNum + "�� " + i + "��°�� �ֽ��ϴ�");
			}
		}
		int index = 0;
		listSize = intList.size();
		for(Integer in : intList) {
			if(in == intNum) {
				index++;
				System.out.println(intNum + "�� " + (index) + "��°�� �ֽ��ϴ�");
				break; //ã���� �ߴ�
			}
		
		}
		// ��ã���� index���� listSize���� ũ��.
		if(index > listSize) {
			System.out.println("ã�� ���Ͽ����ϴ�");
		}
	}
}
