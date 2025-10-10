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

    // Getter
    public String getSocialid() {
        return socialid;
    }
    // Setter method
    public void setSocialid(String socialid) {
        this.socialid = socialid;
    }
    public String getName() {
        return name;
    }
    public boolean ValidateSocialid(String socialid){
        return this.socialid.equals(socialid);
    }
    public static void main(String[] args) {
    }

}