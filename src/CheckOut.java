import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean done2 = false;
        double itemPrice = 0;
        double totalPrices = 0;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "What is the price of your item ", 0.50,9.99);
            //add the price to the total
            totalPrices += itemPrice; //totalPrice = totalPrice + itemPrice


            done2 = SafeInput.getYNConfirm(in, "do you have an item to enter ");

        }while (done2 == true);

        System.out.printf("total price is: " + "%.2f", totalPrices);

    }
}
