import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        prettyHeader(in, "Enter your header");
        /*
        Scanner in = new Scanner(System.in);
        String testHead = SafeInput.getNonZeroLenString(in, "Enter your header");
        int fill = testHead.length();
        int blank = 54 - fill;
        int right = blank/2;
        int left = 0;

        if (blank % 2 == 0)
        {
            left = right;
        }
        else
        {
            left = right + 1;
        }

                for (int x = 1; x <= 1; x++)
                {
                    for (int y = 1; y <= 60; y++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                    for (int y = 1; y <= 1; y++)
                    {
                        System.out.print("***");
                        for (int r = 1; r <= right; r++)
                        {
                            System.out.print(" ");
                        }
                        System.out.print(testHead);
                        for (int l = 1; l <= left; l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.print("***");
                    }
                    System.out.println();
                    for (int y = 1; y <= 60; y++)
                    {
                        System.out.print("*");
                    }

                    System.out.println();

         */
    }
    public static void prettyHeader(Scanner pipe, String prompt) {
        Scanner in = new Scanner(System.in);

        String testHead = "";

        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            testHead = pipe.nextLine();
            if (testHead.length() == 0)
            {
                System.out.println("you must have an input");
            }
        }while(testHead.length() == 0);

        int fill = testHead.length();
        int blank = 54 - fill;
        int right = blank / 2;
        int left = 0;

        if (blank % 2 == 0) {
            left = right;
        } else {
            left = right + 1;
        }

        for (int x = 1; x <= 1; x++) {
            for (int y = 1; y <= 60; y++) {
                System.out.print("*");
            }
            System.out.println();
            for (int y = 1; y <= 1; y++) {
                System.out.print("***");
                for (int r = 1; r <= right; r++) {
                    System.out.print(" ");
                }
                System.out.print(testHead);
                for (int l = 1; l <= left; l++) {
                    System.out.print(" ");
                }
                System.out.print("***");
            }
            System.out.println();
            for (int y = 1; y <= 60; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
