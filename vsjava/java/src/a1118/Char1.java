package a1118;

public class Char1 {
    public static void main(String[] args) {
        String ssn = "7310182328213";
        char sex = ssn.charAt(6);
        int len = ssn.length();
        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자");
                break;

            case '2':
            case '4':
                System.out.println("여자");
                break;
            default:
            System.out.println("잘못입력됬습니다.");
                break;
        }
    }
}