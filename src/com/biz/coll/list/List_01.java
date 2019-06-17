package com.biz.coll.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_01 {
	
	public static void main(String[] args) {
		
		/*
		 * List
		 * Java���� ���Ǵ� Ȯ��� �迭�ڷᱸ��
		 * Java���� �����ͿͰ����ؼ� ���� ���� ���Ǵ� ����
		 * Java.util ��Ű���� ���Ե� �������̽�
		 * 
		 * List�� ���õ� Ŭ����
		 * ArrayList , LinkedList, Vector
		 * 
		 *  List<Ŭ����> ������ ����
		 *  Ŭ������ ��� ������ �����Ҽ��ִ�.
		 */
		List<String> strList ;
		List<Integer> intList ;
		List<Float> flList;
		List<Boolean> blList;
		List<Long> longList;
		List<Double> dbList;
		
		// int, char, float, long, double ������
		// �⺻�ڷ����� ������ �� ����.
		// List<int> int
		
		strList = new ArrayList<String>();
		intList = new ArrayList<Integer>();
		flList = new ArrayList<Float>();
		
		// Java1.8 �̻󿡼��� ArrayList�� Ŭ������
		// ������� �ʾƵ� ������ ������ �߻����� ������
		// ȭȯ���� ���Ͽ� Ŭ������ ����ϴ� ���� ����.
		blList = new ArrayList();
		longList = new LinkedList<Long>();
		dbList = new Vector<Double>();
		/*
		 * ArrayList �� List �ڷᱸ�� �߿��� ���� ���� ���ǰ�
		 * ���������� ���� �ܼ��� �����̸�
		 * �⺻ �迭������ �ſ� �����ϰ� �۵��ȴ�.
		 *
		 * LinkedList�� List �ڷᱸ�� �߿��� ���� ������ �����̰�
		 * ����Ʈ �߰��߰��� �߰�, ������ ���� �Ͼ�� ���
		 * �ſ� ȿ�������� �۵��Ǵ� �����̴�.
		 * 
		 * Vector�� ������������Ʈ���� �׻�
		 * ���������� ����Ǿ� �������� ����ȴ�.
		 */
		
	}
}
