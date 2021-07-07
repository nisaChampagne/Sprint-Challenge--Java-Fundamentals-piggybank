package piggybank;

public class Dime extends AbstractMoney
{
    public Dime()
    {
        super(1, "Dime", 0.10,0);
    }

    public Dime (int amountStored, int reducedStoredAmount)
    {
        super(amountStored,"Dime", 0.10,0);
    }
}