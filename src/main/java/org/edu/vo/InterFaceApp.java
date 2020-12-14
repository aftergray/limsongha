package org.edu.vo;

public class InterFaceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



interface CalcAddSub{
	void add (double dx, double dy);
	void sub(double dx, double dy);
}

interface CalcMulDiv extends CalcAddSub{
	void mul (double dx, double dy);
	void div (double dx, double dy);
}

class AllCalc implements CalcAddSub, CalcMulDiv{

	@Override
	public void mul(double dx, double dy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(double dx, double dy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(double dx, double dy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(double dx, double dy) {
		// TODO Auto-generated method stub
		
	}
	
}