abstract class Car{
	int regNo;
	Car(int regNo){
		this.regNo=regNo;
	}
	void openTank(){
		System.out.println("Fill the tank");
	}
	abstract void braking();
}
class Maruti extends Car{
	Maruti(int regNo){
		super(regNo);
	}
	void braking(){
		System.out.println("Hydraulic braking");
	}
}
class Santro extends Car{
	Santro(int regNo){
		super(regNo);
	}
	void braking(){
		System.out.println("Gas braking");
	}
}
class MainCarClass{
	public static void main(String... args){
		Car c;
		Maruti m = new Maruti(2345);
		Santro s = new Santro(5687);
		c=m;
		c.openTank();
		c.braking();
		c=s;
		c.openTank();
		c.braking();
	}
}		
	

