public class method1{
    public static void D() {
        float d = 40.5f;
        System.out.println("In method D!");
    }
    public static void C(){
        double d = 40.5f;
        System.out.println("In method C!");
    }
    public static void B(){
        double c = 40.5f;
        C(); // calling C
        System.out.println("In method B!");
    }
    public static void A(){
        double d = 40.5f;
        B(); // Calling B
        System.out.println("In method A!");
    }
    public static void main(String[] args){
        A(); // start with function A
        D(); // Then call D
    }
}