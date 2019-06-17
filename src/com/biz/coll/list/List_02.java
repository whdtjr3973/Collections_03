package com.biz.coll.list;

import java.util.LinkedList;
import java.util.List;

public class List_02 {

	public static void main(String[] args) {
		// �߰��߰��� �߰�,������ ���� �Ͼ�� ����
		// ArrayList ���� LinkedList�� ����ϴ� ���� ����
		
		// ArrayList<String>();
		// List �������̽��� ����ؼ�
		// ��ü�� �������ָ�
		// �ʿ信 ���� Ŭ������ �ٲܶ�
		// �ڵ庯���� ���� �Ͼ�� �ʴ´�.
		List<String> strList = new LinkedList<String>();
		
		// List�� �����͸� �߰�
		strList.add("ȫ�浿"); //0
		strList.add("������"); //1
		strList.add("�̸���"); //2
		strList.add("�Ӳ���"); //3
		strList.add("����"); //4
		
		// List�� Ȯ���ϰ��� �Ҷ�
		
		for(String s : strList) {
			System.out.println(s);
		}
		System.out.println("=========================");
		
		// �߰��� ���Ե� ����Ʈ�� ���� �ϰ��� �Ҷ�
		// 3�� ��ġ�� �ִ� �Ӳ����� �庸��� ����
		strList.set(3,"�庸��" );
		for(String s :strList) {
			System.out.println(s.toString());
		}
		System.out.println("=========================");
		// �߰��� ���Ե� ����Ʈ�� �����ϰ��� �Ҷ�
		strList.remove(2); // 2�� ��ġ�� ����Ʈ�� �����Ҷ�
		for(String s :strList) {
			System.out.println(s.toString());
		}
		// �߰��� ����Ʈ�� �����ϸ�
		// �ڵ����� ��ü ũ�Ⱑ 1��ŭ ����
		System.out.println("=========================");
		// ����Ʈ�߰��� �Ѱ��� ���� �о ������ ���
		String strName = strList.get(2);
		System.out.println(strName);
		
		System.out.println("=========================");

		// Ư���� ��ġ�� ����Ʈ�� �߰��ϰ��� �Ҷ�
		strList.add(2, "�念��");
		for(String s : strList) {
		System.out.println(s);
		}
	}

}
