import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "enter your ssn ###-##-####", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("your ssn is " + ssn);

        String Mnum = SafeInput.getRegExString(in, "enter you UC Student M number ", "(M|m)\\d{5}");
        System.out.println("your M number is " + Mnum);

        String menu = SafeInput.getRegExString(in, "would you like to Open, Save, View, or Quit ", "[OoSsVvQq]");
        if (menu.equalsIgnoreCase("O"))
        {
            System.out.println("You chose to Open");
        }
        else if (menu.equalsIgnoreCase("S"))
        {
            System.out.println("You chose to save");
        }
        else if (menu.equalsIgnoreCase("V"))
        {
            System.out.println("You chose to view");
        }
        else if (menu.equalsIgnoreCase("Q"))
        {
            System.out.println("You chose to quit");
        }
    }
}
