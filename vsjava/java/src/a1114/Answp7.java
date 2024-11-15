package a1114;

public class Answp7 {
    public static void main(String[] args) {
        double x = 5.0;
        double y = 0.0;
        double z = 5 % 7;
        //알맞는코드
        if (Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        }else{
            double reult = z +10;
            System.out.println("결과: "+reult);
        }
    }
    
}
