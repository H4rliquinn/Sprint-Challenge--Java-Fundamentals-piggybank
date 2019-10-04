package local.harliquinn;

public class Nickel extends Coin
{
    public Nickel(int quantity)
    {
        this.quantity=quantity;
        value=.05;
        totalValue = quantity*value;
    }
    public Nickel()
    {
        quantity=1;
        value=.05;
        totalValue = quantity*value;
    }
    @Override
    public String toString()
    {
        return quantity+" Nickel"+((quantity>1)?"s":"");
    }
}
