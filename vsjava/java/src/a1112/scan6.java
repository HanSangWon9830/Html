package a1112;

import java.util.Scanner;

public class scan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("x 값 입력: ");
		String a = scanner.nextLine();
				//nextLine은 문장 가능 
		System.out.print("y 값 입력: ");
		String b = scanner.next();
                // next는 문장 불가능 단어만 가능
        System.out.println(a);
        System.out.println(b);
 
    }   
}
