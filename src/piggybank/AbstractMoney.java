package piggybank;

public abstract class AbstractMoney
{
    int amountStored;
    int reducedAmountStored = -1;
    String name;
    double value;
    int originalDeposit;


    public AbstractMoney()
    {
        amountStored = 1;
    }

    public AbstractMoney(int amountStored, String name, double value, int reducedAmountStored)
    {
        this.name = name;
        this.value = value;
        this.amountStored = amountStored;
        this.reducedAmountStored = reducedAmountStored;
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

    public double getReducedBal()
    {
        return value * reducedAmountStored;
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
            return amountStored + " " + name + "s";
        } else {
            return  amountStored + " " + name;
        }
    }
}