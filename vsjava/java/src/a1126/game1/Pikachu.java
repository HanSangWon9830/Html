package a1126.game1;
//클래스 (pikachu) 객체를 정의하는 설계도
public class Pikachu {

    //멤버 : 변수 ,메소드
    public int energy; //멤버 변수,인스턴스 변수,필드
    public String type;
    public int level;
    //메서드(생성자) 오버로딩 - "메소드 중복 정의"
    public Pikachu(){
        this(100, "전기");
    }

    public Pikachu(int energy, String type) {
        this(energy, type, 1);
        // this.energy = energy;
        // this.type = type;
    }

    public Pikachu(int energy, String type, int level) {
        this.energy = energy;
        this.type = type;
        this.level = level;
    }

    
    //메소드
    //접근 지정자 반환타입 메소드명(매개변수){}
    public String aAttack() {
      return "십만볼트";
    }
    public String bAttack() {
      return "전광석화";
    }



}
