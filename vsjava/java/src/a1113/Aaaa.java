package a1113;

import java.util.Scanner;

public class Aaaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("첫번째 정수를 입력: ");
		int x = scanner.nextInt();
				
		System.out.print("두번째 정수를 입력: ");
		int y = scanner.nextInt();

        int result1 = x + y;
        System.out.println("x + y : " + result1);
        int result2 = x - y;
        System.out.println("x - y : " + result2);
        int result3 = x * y;
        System.out.println("x * y : " + result3);
        int result4 = x / y;
        System.out.println("x / y : " + result4);
        int result5 = x % y;
        System.out.println("x % y : " + result5);
 
    }
}
