package a1127.animal2;

abstract class Animal {
     String name;
     int age;
   
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //추상메서드
    abstract void sound();
    abstract void move();

    //공통정보 출력 
    // 클래스명을 가져오는 명령어 this.getClass().getSimpleName()
    public void info(){
        System.out.println(this.getClass().getSimpleName() + " : " + name + "나이: " + age);
    }

}
