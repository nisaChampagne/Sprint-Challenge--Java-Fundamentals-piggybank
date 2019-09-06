package piggybank;

public class Nickel extends AbstractMoney
{
    public Nickel()
    {
        super(1, "Nickel", 0.05);
    }

    public Nickel (int amount)
    {
        super(amount,"Nickel", 0.05);
    }
}