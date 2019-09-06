package piggybank;

public class Quarter extends AbstractMoney
{
    public Quarter()
    {
        super(1, "Quarter", 0.25);
    }

    public Quarter (int amount)
    {
        super(amount,"Quarter", 0.25);
    }
}