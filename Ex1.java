class Ex1_0 {
	void execute(){
		System.out.println("Hello World!");
	}
}

class Ex1_2 {
	void execute(){
		System.out.println("山\n内\n公\n之");
	}
}

class Ex1_3 {
	void execute(){
		System.out.println("山\n内\n\n公\n之");
	}
}

public class Ex1 {
	public static void main(String[] args){
		Ex1_0 a = new Ex1_0();
		a.execute();
		Ex1_2 b = new Ex1_2();
		b.execute();
		Ex1_3 c = new Ex1_3();
		c.execute();
	}
}
