package local.harliquinn;

public class Quarter extends Coin
{
    public Quarter(int quantity)
    {
        this.quantity=quantity;
        value=.25;
        totalValue = quantity*value;
    }
}

