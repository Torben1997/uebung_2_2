package uebung_2_2;

public class Binomi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x=8;
		double y=3;
		
		double links= ((x+y)*(x+y));
		double rechts= (Math.pow(x, 2)+(2*x*y)+Math.pow(y, 2));
		
		System.out.println("links= "+links+ " und rechts "+rechts);
		
		
		
		
	}

}
