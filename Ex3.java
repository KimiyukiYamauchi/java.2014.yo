import java.util.Scanner;

abstract class Ex {
	abstract void execute();
}

class Ex3_0 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if(n > 0){
			System.out.println("その値は正です。");
		}
	}
}

public class Ex3 {
	public static void main(String[] args){
		Ex a;
		a = new Ex3_0();
		a.execute();
	}
}
