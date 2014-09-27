import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Aisatu {
	void exe(){
		System.out.println("おはよう。");
		System.out.println("こんにちは。");
		System.out.println("こんばんは。");
	}
}

class Calc1 {
	void exe(){
		System.out.println("加算の結果は" + (3 + 2) + "です。");
		System.out.println("減算の結果は" + (5 - 8) + "です。");
		System.out.println("乗算の結果は" + (3 * 4) + "です。");
		System.out.println("除算の結果は" + (7 / 3) + "です。");
	}
}

class HowOldAreYou {
	void exe(){
		System.out.println("あなたの名前を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			System.out.println(line + "さん、こんにちは。");
			System.out.println("年齢を入力してください。");
			line = reader.readLine();
			int age = Integer.parseInt(line);
			System.out.println("いま " + age + " 歳とすると、10年後は " + (age+10) + " 歳ですね。");
		}catch( IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("年齢が正しくありません");
		}
	}
}

public class Hello {
	public static void main(String[] args){
		System.out.println("Hello");
		Aisatu a = new Aisatu();
		a.exe();
		Calc1 b = new Calc1();
		b.exe();
		HowOldAreYou c = new HowOldAreYou();
		c.exe();
	}
}
