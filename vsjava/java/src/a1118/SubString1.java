package a1118;

public class SubString1 {
    public static void main(String[] args) {
        String ssn = "880815-1234567";
        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);
        String seconNum = ssn.substring(7);
        System.out.println(seconNum);
    }
}
