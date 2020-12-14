package kr.or.test;

public class HelloWorldApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("헬로월드다");
			a++;
			if (a >= 2) {
				break;
			}
		}
	}
}
