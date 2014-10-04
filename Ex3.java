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

class Ex3_1 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if(n < 0){
			n = -n;	
		}

		System.out.println("その絶対値は" + n + "です。");
	}
}

class Ex3_2 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数A ：");
		int a = stdIn.nextInt();
		System.out.print("整数B ：");
		int b = stdIn.nextInt();

		if(a%b == 0){
			System.out.println("BはAの約数です。");
		}else{
			System.out.println("BはAの約数ではありません。");
		}

	}
}

class Ex3_4 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a ：");
		int a = stdIn.nextInt();
		System.out.print("整数b ：");
		int b = stdIn.nextInt();

		if (a > b){
			System.out.println("aのほうが大きいです。");
		} else if (a < b){
			System.out.println("bのほうが大きいです。");
		} else {
			System.out.println("aとbは同じ値です。");
		}

	}
}

public class Ex3 {
	public static void main(String[] args){
		Ex a;
/*
		a = new Ex3_0();
		a = new Ex3_1();
		a = new Ex3_2();
*/
		a = new Ex3_4();
		a.execute();
	}
}
