package a1113;

public class Increase {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++; //x = x+1
        ++x;
        System.out.println("x=" + x);
        System.out.println("-----------------------");
        y--;
        --y;
        System.out.println("y=" + y);
        System.out.println("-----------------------");
        z = x++; //z = x = x+1
        System.out.println("z=" +z);
        System.out.println("x=" +x);
    }
}
