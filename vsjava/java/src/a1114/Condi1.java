package a1114;

public class Condi1 {
    public static void main(String[] args) {
        int score = 85;
        int score1 = 90;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade + "등급입니다.");
        char grade1 = (score1 >= 90) ? 'A' : ((score1 > 80) ? 'B' : 'C');
        System.out.println(score1 + "점은" + grade1 + "등급입니다.");
    }    
}
