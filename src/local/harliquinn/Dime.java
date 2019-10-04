package local.harliquinn;

public class Dime extends Coin
{
    public Dime(int quantity)
    {
        this.quantity=quantity;
        value=.1;
        totalValue = quantity*value;
    }
}
