package local.harliquinn;

public class Dollar extends Coin
{
    public Dollar(int quantity)
    {
        this.quantity=quantity;
        value=1;
        totalValue = quantity*value;
    }

    public Dollar()
    {
        quantity=1;
        value=1;
        totalValue = quantity*value;
    }

    @Override
    public String toString()
    {
        return "Dollar{" +
                "value=" + value +
                ", quantity=" + quantity +
                ", totalValue=" + totalValue +
                '}';
    }
}
