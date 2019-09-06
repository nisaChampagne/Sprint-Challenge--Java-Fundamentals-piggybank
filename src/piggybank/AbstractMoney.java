package piggybank;

public abstract class AbstractMoney
{
    int amountStored;
    String name;
    double value;
    int originalDeposit;


    public AbstractMoney()
    {
        amountStored = 1;
    }

    public AbstractMoney(int amountStored, String name, double value)
    {
        this.name = name;
        this.value = value;
        this.amountStored = amountStored;
    }

    public String getAmountStored()
    {
        return this.amountStored + " " + this.name;
    }

    public double getValue()
    {
        return value;
    }

    public double getBal()
    {
        return value * amountStored;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        if (amountStored > 1)
        {
            return "\n" + amountStored + " " + name + "s";
        } else {
            return "\n" + amountStored + " " + name;
        }
    }
}