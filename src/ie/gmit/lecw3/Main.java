package ie.gmit.lecw3;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.value = 10000;
        car2.value = 20000;
        
        System.out.println(car1.value);

        car1.crash();

        System.out.println(car1.value);
        
    }
}