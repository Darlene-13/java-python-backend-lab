// Object oriented programming concepts in Java
public class Car{
    // Properties, what a car has
    String brand;
    int speed;
    boolean isRunning;

    // Methods (what the car can do)
    public void start() {
        isRunning = true;
        System.out.println("Car Started!");
    }

    public void accelerate(){
        if (isRunning) {
            speed+= 10;
            System.out.println("Speed:" + speed + " mph");
        }
    }

    public void brake(){
        if (isRunning) {
            speed -=10;
            System.out.println("Speed:" + speed + " mph");
        }
    }

}

    