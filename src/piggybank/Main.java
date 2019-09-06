package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //from instructions
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        ///default values for bal and reducedbal
        double bal = 0.0;
        double reducedBal = 0.0;
        
        //making a new arraylist called bank 
        ArrayList<AbstractMoney> bank = new ArrayList<>();

        ///adding new coins to bank
        bank.add(new Quarter(1, 0));
        bank.add(new Dime(1, 0));
        bank.add(new Dollar(5, 0));
        bank.add(new Nickel(3, 0));
        bank.add(new Dime(7, 0));
        bank.add(new Dollar());
        bank.add(new Penny(10, 0));

        System.out.println();
        System.out.println("*****FIRST getting arrayList into stringified*****");
        for (int coin = 0; coin < bank.size(); coin++) {
            System.out.println(bank.get(coin).toString());
        }

        System.out.println();
        System.out.println("*****SECOND-Getting balance of piggy bank*****");
        for (int coin = 0; coin < bank.size(); coin++) {
            bal += bank.get(coin).getBal();
        }
        System.out.println("My Piggie has " + fp.format(bal));

        /// 2 blank lines
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }

        // reducing bal based on bank.size
        for (int coin = 0; coin < bank.size(); coin++)
         {
            reducedBal += bank.get(coin).getReducedBal();
        }

        // for (AbstractMoney m : bank) {
        //     reducedBal = bal - m.getReducedBal();
        // }

        System.out.println("******trial--REDUCING BAL BY BANK.SIZE*****");
        System.out.println("Oh noes my piggie has " + fp.format(reducedBal));
    }
}