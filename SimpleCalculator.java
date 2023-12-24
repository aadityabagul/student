import java.util.Scanner;

public class SimpleCalculator
 {
    public static void main(String[] args)throws exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("Enter the type of operation you want to perform (+, -, *, /, %): ");
        String operation = sc.nextInt();
        int result = performOperation(firstNumber, secondNumber, operation);
        System.out.println("Your answer is: " + result);
    }

    public static int performOperation(int firstNumber, int secondNumber, String operation)
    {
        int result = 0;
        if (operation.equals("+")) 
        {
            result = firstNumber + secondNumber;
        }
        else if (operation.equals("-")) 
        {
            result = firstNumber - secondNumber;
        }
        else if (operation.equals("*"))
         {
            result = firstNumber * secondNumber;
        }
        else if (operation.equals("%"))
         {
            result = firstNumber % secondNumber;
        }
        else if (operation.equals("/"))
         {
            result = firstNumber / secondNumber;
        }
        else 
        {
            System.out.println("Invalid operation");
        }
        return result;
    }
}