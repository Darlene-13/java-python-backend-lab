import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args){
        
        int a = 0;
        int b = 1;
        int even_sum = 0;


        ArrayList<Integer> fList = new ArrayList<>();

        while (b <= 4000000){
            int next = a + b;
            a = b;
            b= next;

            if (b % 2 == 0){
                even_sum += b;
            }

            fList.add(b);

        }

        System.out.println("Even sum : " + even_sum);
        System.out.println("Fibonacci List : " + fList);

    }

}
