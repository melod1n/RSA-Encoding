import java.security.*;
import javax.crypto.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите два простых числа: ");
		int p = scanner.nextInt();
		int q = scanner.nextInt();
		int n = p * q;
		
		System.out.print("Произведение чисел = " + n);
		int f = (p - 1) * (q - 1);
		
		System.out.println();
		System.out.println("Результат функции Эйлера = " + f);
		//System.out.print("Введите взаимно обратное число: ");
		
		Random r = new Random();
		
		
		int e;
		
		while(true) {
			e = r.nextInt(f) + 1;
			if (gcd(e, f) == 1) break;
			else
				e = r.nextInt(f) + 1;
		}
		
		System.out.print("Открытая экспонента: " + e);
		System.out.println();
		
		int d = 1;
		
		while (true) {
			//d = r.nextInt(f) + 1;
			if ((e * d) % f == 1) break;
			else d++;// d = r.nextInt(f) + 1;
		}
			
		System.out.print("Закрытая экспонента: " + d);
	}
	
	private static int gcd (int a, int b) {
		return b != 0 ? gcd (b, a % b) : a;
	}
}
