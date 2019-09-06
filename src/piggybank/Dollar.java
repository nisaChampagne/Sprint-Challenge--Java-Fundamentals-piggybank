package piggybank;

public class Dollar extends AbstractMoney
{
    public Dollar()
    {
        super(1, "Dollar", 1.00,0);
    }

    public Dollar(int amountStored, int reducedStoredAmount)
    {
        super(amountStored,"Dollar", 1.00,0);
    }
}