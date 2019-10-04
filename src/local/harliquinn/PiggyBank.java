package local.harliquinn;
import java.util.*;

public class PiggyBank
{
    private ArrayList<Coin> bank = new ArrayList<>();

    public String getbank()
    {
        String coinList="";
        for(Coin i:bank)
        {
            coinList=coinList+i.toString()+"\n";
        }
        return coinList;
    }

    public void addToBank(Coin coin)
    {
        bank.add(coin);
    }
}
