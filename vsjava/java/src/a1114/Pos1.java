package a1114;

import java.util.Scanner;

public class Pos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int number = scanner.nextInt();
        if(number > 0){
            System.out.println("양수 입니다.");
        }else if(number < 0){
            System.out.println("음수 입니다.");
        }else{
            System.out.println("0입니다.");
        }
    }
}
