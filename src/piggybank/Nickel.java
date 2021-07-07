package piggybank;

public class Nickel extends AbstractMoney
{
    public Nickel()
    {
        super(1, "Nickel", 0.05,0);
    }

    public Nickel (int amountStored, int reducedStoredAmount)
    {
        super(amountStored,"Nickel", 0.05,0);
    }
}