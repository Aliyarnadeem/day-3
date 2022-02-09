package day;

public class program4 {


 
	
	
	void addition(int a, int b, int c) {//m1
		System.out.println("Result: "+ (a+b));
	}
	void addition(int a, int b, double c) {//m2
	}
	void addition(int a, int b, int c,int d) {//m3
		System.out.println("Result: "+ (a+b+c+d));
	}
	/*void addition(int a, int b) {//m4
		System.out.println("Result: "+ (a+b));
	}*/
	void addition(int a, int b) {//m5
		System.out.println("Result: "+ (a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program4 olpd =new program4();
		olpd.addition(2, 5);//m5
		//olpd.addition(2, 5, 5,5,5);//m4
		olpd.addition(2, 5,5,6);//m3
	}

}
