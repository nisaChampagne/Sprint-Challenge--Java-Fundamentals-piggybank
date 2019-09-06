package piggybank;

public class Dime extends AbstractMoney
{
    public Dime()
    {
        super(1, "Dime", 0.10);
    }

    public Dime (int amount)
    {
        super(amount,"Dime", 0.10);
    }
}