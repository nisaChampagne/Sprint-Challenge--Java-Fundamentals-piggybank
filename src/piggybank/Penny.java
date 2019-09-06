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
}