package local.harliquinn;
import java.util.*;

public class PiggyBank
{
    private ArrayList<Coin> bank = new ArrayList<>();

    public int getbank()
    {
        return bank.size();
    }

    public void addToBank(Coin coin)
    {
        bank.add(coin);
    }
}
