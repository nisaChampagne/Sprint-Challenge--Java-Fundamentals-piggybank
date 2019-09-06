package piggybank;

public class Dollar extends AbstractMoney
{
    public Dollar()
    {
        super(1, "Dollar", 1.00);
    }

    public Dollar (int amount)
    {
        super(amount,"Dollar", 1.00);
    }

    @Override
    public String toString()
    {
        return "$" + amountStored;
    }
}