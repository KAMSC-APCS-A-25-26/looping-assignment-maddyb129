import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
        // TODO: Step 1 - Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        // TODO: Step 2 - Generate the number triangle pattern
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j; i++)
            {
                if (i < j)
                {
                    System.out.print(i + " ");
                }
                else
                {
                    System.out.print(i);
                }
            }
            System.out.println();


        }
    }
}
