package piggybank;

public class Penny extends AbstractMoney
{
    public Penny()
    {
        super(1, "Penny", 0.01, 0);
    }

    public Penny (int amountStored, int reducedStoredAmount)
    {
        super(amountStored,"Penny", 0.01, 0);
    }

    //string to help with plural
    @Override
    public String toString()
    {
        if (amountStored > 1)
        {
            return "Number of " + name + "- " + amountStored + " " + "Pennies";
        } else {
            return  "Number of " + name + "- " + amountStored + " " + name;
        }
    }
}