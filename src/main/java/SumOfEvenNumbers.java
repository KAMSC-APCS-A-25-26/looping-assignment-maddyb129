import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // TODO: Step 1 - Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int n = sc.nextInt();
        // TODO: Step 2 - Validate input
        int add = 0;
        if (n < 2)
        {
            System.out.print("Error: Input must be 2 or greater.");
            return;
        }
        // TODO: Step 3 - Calculate sum of even numbers
        else
        {
            for (int i = 2; i <= n; i= i + 2)
            {
                add += i;

            }
        }
        // TODO: Step 4 - Display the result
        System.out.println("The sum of even numbers between 2 and " + n + " is " + add);

    }
}