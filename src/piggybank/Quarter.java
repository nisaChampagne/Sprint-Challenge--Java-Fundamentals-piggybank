package piggybank;

public class Quarter extends AbstractMoney
{
    public Quarter()
    {
        super(1, "Quarter", 0.25,0);
    }

    public Quarter (int amountStored, int reducedStoredAmount)
    {
        super(amountStored,"Quarter", 0.25,0);
    }
}