package local.harliquinn;

public class Dime extends Coin
{
    public Dime(int quantity)
    {
        this.quantity=quantity;
        value=.1;
        totalValue = quantity*value;
    }
    public Dime()
    {
        quantity=1;
        value=.1;
        totalValue = quantity*value;
    }
    @Override
    public String toString()
    {
        return quantity+" Dime"+((quantity>1)?"s":"");
    }
}
