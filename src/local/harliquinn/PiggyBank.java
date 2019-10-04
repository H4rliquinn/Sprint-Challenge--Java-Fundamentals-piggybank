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
            if (i.quantity>0)
            {
                coinList=coinList+i.toString()+"\n";
            }
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

    public int removeDollar(int quantity )
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
        return currQuantity;
    }

    public int removeQuarter(int quantity )
    {
        int currQuantity=quantity;
        for(Coin i:bank)
        {
            if (i instanceof Quarter)
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
        return currQuantity;
    }

    public int removeDime(int quantity )
    {
        int currQuantity=quantity;
        for(Coin i:bank)
        {
            if (i instanceof Dime)
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
        return currQuantity;
    }

    public int removeNickel(int quantity )
    {
        int currQuantity=quantity;
        for(Coin i:bank)
        {
            if (i instanceof Nickel)
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
        return currQuantity;
    }

    public int removePenny(int quantity )
    {
        int currQuantity=quantity;
        for(Coin i:bank)
        {
            if (i instanceof Penny)
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
        return currQuantity;
    }

    public void removeValue(double amount)
    {
        if (amount<=this.getBankValue())
        {

        }else
        {
            System.out.printf("Insufficient Funds");
        }
    }
}
