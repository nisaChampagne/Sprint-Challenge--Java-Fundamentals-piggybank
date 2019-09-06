package piggybank;
import java.util.*;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        double bal = 0.0;
        double reducedBal = 0.0;

        ArrayList<AbstractMoney> bank = new ArrayList<>();
        bank.add(new Quarter());
        bank.add(new Dime());
        bank.add(new Dollar(5, 1));
        bank.add(new Nickel(3,0));
        bank.add(new Dime(7, 0));
        bank.add(new Dollar());
        bank.add(new Penny(10, 0));

        System.out.println("*****FIRST*****");
        for (int coin = 0; coin < bank.size(); coin++)
        {
            System.out.println(bank.get(coin).toString());
        }

        System.out.println("*****SECOND-Getting balance of piggy bank*****");
        for (int coin = 0; coin < bank.size(); coin++)
        {
            bal += bank.get(coin).getBal();
        }

        // for (int newC = 0; newC < 1; newC++)
        // {
        //     bank.add(new Dollar(4,0));
        // }

        for (int coin = 0; coin < bank.size(); coin++)
        {
            reducedBal -= bank.get(coin).getBal();
        }

        for (int i = 0; i < 3; i++)
        {
            System.out.println();
        }

        System.out.println("My Piggie has " + fp.format(bal));
        // System.out.println("New bal: " + bank);
        System.out.println("Oh noes my piggy has " + fp.format(reducedBal));

    }
}