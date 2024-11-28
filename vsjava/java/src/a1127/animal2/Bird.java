package a1127.animal2;

public class Bird extends Animal{
    public Bird(String name, int age){
        super(name,age);
    }

    @Override
    void move() {
        System.out.println("날개로 날아간다.");
    }

    @Override
    void sound() {
        System.out.println("짹짹");
    }
    
}
