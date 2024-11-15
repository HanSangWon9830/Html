package a1115;

public class Whilesum {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;

        while (a<=100) {
            
            // sum = sum +a;
            // a++;
            sum = sum + a++;
        }
        System.out.println("합계: "+ sum);
    }
}
