package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        double bal = 0.0;
        double reducedBal = 0.0;

        ArrayList<AbstractMoney> bank = new ArrayList<>();
        bank.add(new Quarter(1, 0));
        bank.add(new Dime(1, 0));
        bank.add(new Dollar(5, 0));
        bank.add(new Nickel(3, 0));
        bank.add(new Dime(7, 0));
        bank.add(new Dollar());
        bank.add(new Penny(10, 0));

        System.out.println("*****FIRST*****");
        for (int coin = 0; coin < bank.size(); coin++) {
            System.out.println(bank.get(coin).toString());
        }

        System.out.println("*****SECOND-Getting balance of piggy bank*****");
        for (int coin = 0; coin < bank.size(); coin++) {
            bal += bank.get(coin).getBal();
        }
        System.out.println("My Piggie has " + fp.format(bal));

        /// 3 blank lines
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }

        // reducing bal based on bank.size
        for (int coin = 0; coin < bank.size(); coin++) {
            reducedBal -= bank.get(coin).getReducedBal();
        }

        // for (AbstractMoney m : bank) {
        //     reducedBal = bal - m.getReducedBal();
        // }

        System.out.println("******trial*****");
        System.out.println("Oh noes my piggie has " + fp.format(reducedBal));

    }
}