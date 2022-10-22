import java.util.Scanner;
public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double F = CtoF(in, "enter your temp in Celsius");
        System.out.println("your temp in Fahrenheit is " + F);

        System.out.println("C to F");

        for (int x = -100; x <= 100; x++)
        {
            for (int y = 1; y <= 1; y++)
            {
                /*
                System.out.print(x + " in C ");
                int display = x;
                display = display * 9/5 + 32;
                System.out.print("is " + display + " in F");

                 */
                System.out.print(x);
                int display = x;
                display = display * 9/5 + 32;
                System.out.print(" " + display);

            }
            System.out.println();
        }
    }

    public static double CtoF(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                retVal = retVal * 9/5 + 32;
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        } while (!done);
        return retVal;
    }
}
