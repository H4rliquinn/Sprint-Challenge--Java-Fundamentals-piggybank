package local.harliquinn;

public abstract class Coin
{
    protected double value;
    protected int quantity;
    protected double totalValue;

    public double getValue()
    {
        return value;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getTotalValue()
    {
        return totalValue;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
        totalValue=quantity*value;
    }
}
