package piggybank;

public abstract class AbstractMoney///abstract so I can extend the usage amongst coins
{
///blue print for coins 
    int amountStored;
    int reducedAmountStored;
    String name;
    double value;
    int originalDeposit;

///default constructor/// if i comment this out it doesnt break anything
    public AbstractMoney()
    {
        amountStored = 1;
    }
////constructor/setters technically to get needed variables values  via super
    public AbstractMoney(int amountStored, String name, double value, int reducedAmountStored)
    {
        this.name = name;
        this.value = value;
        this.amountStored = amountStored;
        this.reducedAmountStored = reducedAmountStored;
    }

///getters needed for main
    public String getAmountStored()
    {
        return this.amountStored + " " + this.name;
    }

///getbal for main to get balance after added coins
    public double getBal()
    {
        return value * amountStored;
    }

///getReducedbal for main to get balance after removed coins
    public double getReducedBal()
    {
        return value * reducedAmountStored;
    }

    //string to help with plural
    @Override
    public String toString()
    {
        if (amountStored > 1)
        {
            return "Number of " + name + "- " + amountStored + " " + name + "s";
        } else {
            return  "Number of " + name + "- " + amountStored + " " + name;
        }
    }
}