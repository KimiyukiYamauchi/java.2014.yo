import java.util.Scanner;
import java.util.Random;

abstract class Ex {
	abstract void execute();
}

class Ex2_0 extends Ex{
	void execute(){
		int x;
		int y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

class Ex2_2 extends Ex{
	void execute(){
		int x;
		int y;
		int z;

		x = 63;
		y = 18;
		z = 100;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("zの値は" + z + "です。");
		System.out.println("合計は" + (x + y + z) + "です。");
		System.out.println("平均は" + (x + y + z) / 3 + "です。");
	}
}

class Ex2_3 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int a = stdIn.nextInt();

		System.out.println(a + "と入力しましたね。");
	}
}

class Ex2_4 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int a = stdIn.nextInt();

		System.out.println("10を加えた値は" + (a + 10) + "です。");
		System.out.println("10を減じた値は" + (a - 10) + "です。");
	}
}

class Ex2_5 extends Ex{
	void execute(){
		double x;
		double y;

		Scanner stdIn = new Scanner(System.in);

		System.out.print("xの値：");
		x = stdIn.nextDouble();

		System.out.print("yの値：");
		y = stdIn.nextDouble();

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

class Ex2_6 extends Ex{
	void execute(){
		double x;
		double y;

		Scanner stdIn = new Scanner(System.in);

		System.out.print("底辺：");
		x = stdIn.nextDouble();

		System.out.print("高さ：");
		y = stdIn.nextDouble();

		System.out.println("面積は" + (x*y/2) + "です。");
	}
}

class Ex2_7 extends Ex{
	void execute(){
		Random rand = new Random();

		int value = rand.nextInt(9);
		System.out.println("1以上9以下：" + (value + 1));
		

		value = rand.nextInt(9);
		System.out.println("-9以上-1以下：" + (value - 9));

		value = rand.nextInt(90);
		System.out.println("10以上99以下：" + (value + 10));
	}
}

class Ex2_8 extends Ex{
	void execute(){
		int x;

		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		x = stdIn.nextInt();

		Random rand = new Random();

		int value = rand.nextInt(9);
		System.out.println("その値の±5の乱数を生成しました。それは" + (value + x - 5) + "です。");
	}
}

class Ex2_9 extends Ex{
	void execute(){
		Random rand = new Random();

		double value = rand.nextDouble();
		System.out.println("0.0以上1.0未満：" + (value));

		System.out.println("0.0以上10.0未満：" + (value * 10));

		System.out.println("-1.0以上1.0未満：" + (value - 1));
		

	}
}

class Ex2_10 extends Ex{
	void execute(){
		String sei, mei;

		Scanner stdIn = new Scanner(System.in);

		System.out.print("姓：");
		sei = stdIn.next();
		System.out.print("名：");
		mei = stdIn.next();

		System.out.println("こんにちは" + sei + mei + "さん。");
	}
}

public class Ex2 {
	public static void main(String[] args){
		Ex a;
/*
		a = new Ex2_0();
		a.execute();
		a = new Ex2_2();
		a.execute();
		a = new Ex2_3();
		a.execute();
		a = new Ex2_4();
		a.execute();
		a = new Ex2_5();
		a.execute();
		a = new Ex2_6();
		a.execute();
		a = new Ex2_7();
		a.execute();
		a = new Ex2_8();
		a.execute();
		a = new Ex2_9();
		a.execute();
*/
		a = new Ex2_10();
		a.execute();
	}
}
