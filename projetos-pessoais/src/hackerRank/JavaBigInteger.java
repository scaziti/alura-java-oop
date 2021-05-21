package hackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BigInteger b1 = new BigInteger(scan.next());
		BigInteger b2 = new BigInteger(scan.next());
		
		BigInteger b3, b4;
		b3 = b1.add(b2);
		b4 = b1.multiply(b2);
		
		System.out.println(b3);
		System.out.println(b4);
		scan.close();
	}

}
