package a1125.this1;

public class Myclass1 {
    public static void main(String[] args) {
        Myclass obj1 = new Myclass(10); //생성자
        obj1.myMethod();
        Myclass obj2 = new Myclass(); //다른 생성자 호출
        obj2.myMethod(); //매서드 호출
    }
}

class Myclass{
    int myVariable;

    public Myclass(int myVariable) {
        //여기서 말하는 this는 해당 객체를 가리킵니다.
        this.myVariable = myVariable;
    }
    public Myclass(){
        //여기서 this()는 다른 생성자 호출
        this(0);
    }
    public void myMethod(){
        //여기서 this는 해당 객체를 가르킵니다.
        System.out.println("My variable value is " + this.myVariable);
    }
    
}
//'this' 와 'this()'는 각각 객체의 참조와 생성자 호출로 다르다.
//this.myVariable 객체의 필드를 가리키고 있으며
//this()는 다른 생성자를 호출하는데 사용한다.
