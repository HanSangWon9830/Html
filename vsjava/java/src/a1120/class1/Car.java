package a1120.class1;

public class Car {
    //필드선언
    String company;
    String model;
    String color;
    int maxSpeed;
    int speed;
//필드 그래그후 전구표시 누르면 Constr 자동으로만들어줌

    public Car(){};


    public Car(String company, String model, String color, int maxSpeed, int speed) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
    }



   
    // public Car(String company,String model,String color,int maxSpeed,int speed){
    //     this.company = company;
    //     this.model = model;
    //     this.color = color;
    //     this.maxSpeed = maxSpeed;
    //     this.speed = speed;
    // };

    // public Car(String c,String m,String co,int max,int sp){
    //     company = c;
    //     model = m;
    //     color = co;
    //     maxSpeed = max;
    //     speed = sp;
    // };

}
