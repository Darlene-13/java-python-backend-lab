// The switch case statement is a multiway branch statement that provides an easy way to dispatch execution to different parts of the code based on the value of the expression
// It is always like: Switch(Conditional)-Case(Condition1)->Statement1 break; Case2(Condition2)->Statement2 break;....etc

class SwitchCase{
    public static void main(String[] args){
        int num = 20;
        switch(num){
            case 5:
                System.out.println("It is 5");
                break;
            case 10:
                System.out.println("It is 10");
                break;
            case 20:
                System.out.println("It is 20");
                break;
            case 30:
                System.out.println("It is 30");
                break;
            default:
                System.out.println("It is not present");
        }
    }
}