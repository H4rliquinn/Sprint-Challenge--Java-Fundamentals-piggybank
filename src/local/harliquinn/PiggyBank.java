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

    public void removeDollar(int quantity )
    {
        int currQuantity=quantity;
        for(Coin i:bank)
        {
            if (i instanceof Dollar)
            {
                if (i.quantity>currQuantity)
                {
                    i.setQuantity(i.quantity-currQuantity);
                    currQuantity=0;
                    break;
                }else{
                    currQuantity=currQuantity-i.quantity;
                    i.setQuantity(0);
                }
            }
        }
        if (currQuantity>0)
        {
            System.out.println(quantity-currQuantity+" Dollars removed. Unable to remove "+currQuantity);
        } else
        {
            System.out.println(quantity+" Dollars removed");
        }
    }
}
