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
		// 키보드에서 임의 숫자를 입력받고
		// 그 숫자가 intList에 몇번에 포함되어있는지 찾아보기
		System.out.println("숫자 입력(0~49) >");
		String strNum = sc.nextLine();

		int intNum = Integer.valueOf(strNum);
		
		int listSize = intList.size();
		for (int i = 0; i < listSize; i++) {
			if (intList.get(i) == intNum) {
				System.out.println(intNum + "는 " + i + "번째에 있습니다");
			}
		}
		int index = 0;
		listSize = intList.size();
		for(Integer in : intList) {
			if(in == intNum) {
				index++;
				System.out.println(intNum + "는 " + (index) + "번째에 있습니다");
				break; //찾으면 중단
			}
		
		}
		// 못찾으면 index값은 listSize보다 크다.
		if(index > listSize) {
			System.out.println("찾지 못하였습니다");
		}
	}
}
