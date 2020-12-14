package org.edu.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class step2 {

	static class MemverVO {

		private String name;
		private int age;
		private String phonenum;

		public MemverVO(String name, int age, String phonenum) {
			super();
			this.name = name;
			this.age = age;
			this.phonenum = phonenum;
		}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getPhonenum() {
			return phonenum;
		}

		public void setPhonenum(String phonenum) {
			this.phonenum = phonenum;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, MemverVO> map = new HashMap<>();
	ArrayList<MemverVO> list = new ArrayList<>();
	
		String name = "dd";
/*		memVO.setName(name);
		memVO.setAge(age);
		memVO.setPhonenum(phonenum);*/
		
		list.add(new MemverVO(name,1,"dd"));
		map.put(name,new MemverVO(name,1,"dd"));
		
		System.out.println(map.get(name).getName());
		System.out.println(list.get(0).getAge());
	
		if(list.get(0).getName().contains("ddappe")) {
			System.out.println("찾았따");
		}else {
			System.out.println("없네?");
		}
		
		
		
		
	}

}
