package piggybank;

public class Penny extends AbstractMoney
{
    public Penny()
    {
        super(1, "Penny", 0.01);
    }

    public Penny (int amount)
    {
        super(amount,"Penny", 0.01);
    }
}