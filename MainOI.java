import java.util.*;
class Outer{
	String pswd;
	Outer(String pswd){
		this.pswd = pswd;
	}
	public void callToInnerMethod(){
		Inner in = new Inner();
		in.markVerify();
	}
	private class Inner{
		String verify;
		public void markVerify(){
			System.out.println("Input the verification code");
			Scanner sc = new Scanner(System.in);	
			verify = sc.next();
			if(verify.equalsIgnoreCase(pswd)){
				System.out.println("Verification passed");
			}else{
				System.out.println("Verification failed");
			}
		}
	}
}
class MainOI{
	public static void main(String... args){
		Outer out = new Outer("m1234");
		out.callToInnerMethod();
	}
}
