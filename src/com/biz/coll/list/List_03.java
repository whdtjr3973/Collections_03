package com.biz.coll.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class List_03 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		List<Integer> intList = new LinkedList<Integer>();
		
		for(int i =0; i <50 ;i++) {
			int intR = rnd.nextInt(50); //0���� 49���� ������ �� ����
			intList.add(intR) ;
		}
		// intList�� 30�� ���ԵǾ� �ִ��� Ȯ��
		int intLen = intList.size();
		for(int i = 0 ; i < intLen; i++) {
			if(intList.get(i) ==30) {
				System.out.println("ã�ҽ��ϴ�.");
			} 
		}
		for(Integer i : intList) {
			if(i ==30) {
				System.out.println("ã�ҽ��ϴ�.");
			}
		}
		
		
	}

}
