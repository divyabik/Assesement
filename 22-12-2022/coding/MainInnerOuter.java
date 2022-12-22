import java.util.Scanner;
class Outer{
	double bal = 40000.0;
	public void calInterest(double roi){
		String ps;
		System.out.println("Input the password : ");
		Scanner sc = new Scanner(System.in);
		ps = sc.nextLine();
		if(ps.equals("peacefull")){
			Inner in = new Inner();
			in.updateInterest(roi);
		}
                                else{
			System.out.println("UnAuthorized entry");
		}
	}
	private class Inner{
		public void updateInterest(double roi){
			bal+=bal*(roi/100);
			System.out.println("Balance after adding "+roi+" is "+bal);
		}
	}
}
class MainInnerOuter{
	public static void main(String... args){
		Outer out = new Outer();
		out.calInterest(10);
	}
}