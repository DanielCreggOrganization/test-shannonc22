package ie.gmit.lecw3;


public class Car {
    int topSpeed;
    int totalSeats;
    int fuelCapaity;
    String manufacturer;
    String colour;
    String owner;
    float engineSize;
    float value;

    void show(){
        System.out.println(manufacturer);
    }

   void crash(){
       value = 0;
   }
    
}