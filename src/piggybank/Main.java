package piggybank;
import java.util.*;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        double bal = 0;
        ArrayList<AbstractMoney> bank = new ArrayList<>();
        bank.add(new Quarter());
        bank.add(new Dime());
        bank.add(new Dollar(5));
        bank.add(new Nickel(3));
        bank.add(new Dime(7));
        bank.add(new Dollar());
        bank.add(new Penny(10));


        for (int coin = 0; coin < bank.size(); coin++)
        {
            System.out.println(bank.get(coin).toString());
        }

        for (int coin = 0; coin < bank.size(); coin++)
        {
            bal += bank.get(coin).getBal();
        }

        for (int i = 0; i < 3; i++)
        {
            System.out.println();
        }

        System.out.println("The Piggy Bank Holds " + fp.format(bal));
    }
}