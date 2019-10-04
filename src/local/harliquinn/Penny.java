package local.harliquinn;

public class Penny extends Coin
{
    public Penny(int quantity)
    {
        this.quantity=quantity;
        value=.01;
        totalValue = quantity*value;
    }
    public Penny()
    {
        quantity=1;
        value=.01;
        totalValue = quantity*value;
    }
}
