// Encapsulation in java is a method of basically combining data and the functions that work on the data into a single unit like a class. It is meant to keep things organized and secure in OOP.
// While a class can hide  the implementation part and only disclose the functionalities required by other classes by making the class data and methods private, representations or implementations can be later chnaged without impacting the codes that uses the class.
// THis type helps in better maintainability, reusability and code readabilty. It also helps maintain data integrity by allwiing validation and control over the that have been assigned to the variables.

public class Person{
    private String socialid;
    private String name;

    Person(String socialid,String name){
        this.socialid=socialid;
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean ValidateID(){
        return socialID >= 0 && socialID <=1001;
    }
    public static void main(String[] args) {
        person p1 = new Person ("Darlene", 1000);
        if(!p1.validateID()){
            System.out.println("Invalid Social ID");
        }
        System.out.println("Name: " + p1.getName())
    }

}

// IMPLEMENTATION OF ENCAPSULATTION IN JAVA



class Programmer{
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class Geeks {
    public static void main(String[] args){
        Programmer p = new Programmer();
        p.setName("Darlene");
        System.out.println("Name: " + p.getName())
    }
}