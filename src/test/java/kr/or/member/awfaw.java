package kr.or.member;

public class awfaw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + dice1 + ", " + dice2 + ")");
			if (dice1 + dice2 == 5) {
				break;
			}
		}

	}

}
