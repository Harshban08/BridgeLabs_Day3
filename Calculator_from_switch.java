import java.util.Scanner;

public class Calculator_from_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your Operator");
        char operator = sc.next().charAt(0);
        System.out.println("Enter first number");
        double num1 = sc.nextInt();
        System.out.println("Enter second number");
        double num2 = sc.nextInt();
        double result;
        switch(operator){
            case '+':
                result = num1+num2;
                System.out.println(result);
                break;
            case '-':
                result = num1-num2;
                System.out.println(result);
                break;
            case '*':
                result = num1*num2;
                System.out.println(result);
                break;
            case '/':
                result = num1/num2;
                System.out.println(result);
                break;

            default:
                System.out.println("Wrong Operator");
        }
    }
}
