package local.harliquinn;

public class Quarter extends Coin
{
    public Quarter(int quantity)
    {
        this.quantity=quantity;
        value=.25;
        totalValue = quantity*value;
    }
    public Quarter()
    {
        quantity=1;
        value=.25;
        totalValue = quantity*value;
    }
    @Override
    public String toString()
    {
        return quantity+" Quarter"+((quantity>1)?"s":"");
    }
}

