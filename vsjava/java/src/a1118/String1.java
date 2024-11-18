package a1118;


public class String1 {
    public static void main(String[] args) {
        //String은 참조 타입
        String a = "Hello";
        String b = "Java";
        String c = "Hello";

        String d = new String("Hello");
        String e = new String("Java");
        String f = new String("Java");

        System.out.println(a == c); //true
        System.out.println(a == d); //false
        System.out.println(a.equals(d)); // equlas는 문자자체를 비교해서 true로 나옴.
        
        System.out.println(e == f); //false
        System.out.println(e.equals(f)); //true
        System.out.println(b.equals(e)); //true

        // == : 해당 변수의 레퍼런스 (참조 정보를 비교.)
        // == : 이기호는 문자가 같은게 아니라 주소가 같다는걸표시함
        // equals() : 해당변수의 문자열 자체(내용)를 비교해 같은지 다른지비교.

    }    
}
