package local.harliquinn;

public class Penny extends Coin
{
    public Penny(int quantity)
    {
        this.quantity=quantity;
        value=1;
        totalValue = quantity*value;
    }
}
