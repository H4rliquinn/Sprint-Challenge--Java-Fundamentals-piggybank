package local.harliquinn;
import java.util.*;

public class PiggyBank
{
    private ArrayList<Coin> bank = new ArrayList<>();

    public void addToBank(Coin coin)
    {
        bank.add(coin);
    }

    public String getBank()
    {
        String coinList="";
        for(Coin i:bank)
        {
            coinList=coinList+i.toString()+"\n";
        }
        return coinList;
    }

    public double getBankValue()
    {
        double coinTotal=0;
        for(Coin i:bank)
        {
            coinTotal=coinTotal+i.getTotalValue();
        }
        return coinTotal;
    }
}
