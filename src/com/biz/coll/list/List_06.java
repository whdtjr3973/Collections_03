package com.biz.coll.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_06 {

	public static void main(String[] args) {

		Random rnd = new Random();
		List<String> strList = new ArrayList<String>();

		String _st = "";

		for (int i = 0; i < 50; i++) {
			// ������ �ҹ��� ASCII �ڵ� �� 1���� �����϶�
			int intNum = rnd.nextInt(26) + 97;
			// �빮�� ����
			intNum = rnd.nextInt(26) +65;
			// ������ ASCII �ڵ带 ���ڷ� �����϶�
			char charNum = (char) intNum;
			// ���ڸ� ���ڿ��� ���� �϶�
			String strAlpha = String.valueOf(charNum);
			// ������ ���ڿ��� ����Ʈ�� �߰��϶�
			// ������ �ܾ�� ����� ����Ʈ�� �߰��϶�
			_st += strAlpha;
			if ((i + 1) % 5 == 0) {
				strList.add(_st);
				_st = "";
			}
		}
		for (String s : strList) {
			System.out.println(s);
		}
	}

}
