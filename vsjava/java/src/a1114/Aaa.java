package a1114;

import java.util.Scanner;

public class Aaa {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        System.out.println("나이를을 입력하세요");
        int nai = scanner.nextInt();
        if(nai >=0 && nai <= 12){
            System.out.println("어린이 입니다");
        }else if(nai >=13 && nai <= 19){
            System.out.println("청소년 입니다");
        }else if(nai <= 20){
            System.out.println("성인 입니다");
        }
    }
}
