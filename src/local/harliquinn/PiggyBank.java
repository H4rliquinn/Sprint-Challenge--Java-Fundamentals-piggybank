package local.harliquinn;
import java.util.*;
import java.lang.Math;


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
        double currAmount=amount;
        int coins=0;
        boolean[] typeFlag={true,true,true,true,true};
        if (amount<=this.getBankValue())
        {
            while(currAmount>0)
            {
                coins=0;
                if (currAmount>=1&&typeFlag[0])
                {
                    coins=(int)Math.floor(currAmount/1);
                    currAmount=currAmount-coins*1;
                    coins=this.removeDollar(coins);
                    currAmount=currAmount+coins*1;
                    typeFlag[0]=false;
//                    System.out.println("Curr$: "+currAmount);
                } else if(currAmount>=.25&&typeFlag[1]){
                    coins=(int)Math.floor(currAmount/.25);
                    currAmount=currAmount-coins*.25;
                    coins=this.removeQuarter(coins);
                    currAmount=currAmount+coins*.25;
                    typeFlag[1]=false;
//                    System.out.println("CurrQ: "+currAmount);
                }else if(currAmount>=.1&&typeFlag[2]){
                    coins=(int)Math.floor(currAmount/.1);
//                    currAmount=currAmount-(coins*.1);//Double operation is off
                    currAmount=currAmount-.2;
                    coins=this.removeDime(coins);
                    currAmount=currAmount+coins*.1;
                    typeFlag[2]=false;
//                    System.out.println("CurrD: "+currAmount);
                }else if(currAmount>=.05&&typeFlag[3]){
                    System.out.println("Nickels: "+currAmount);
                    coins=(int)Math.floor(currAmount/.05);
                    System.out.println("coins: "+coins);
//                    currAmount=currAmount-coins*.05;//Double division if off
                    currAmount=currAmount-.05;
                    coins=this.removeNickel(coins);
                    currAmount=currAmount+coins*.05;
                    typeFlag[3]=false;
//                    System.out.println("CurrN: "+currAmount);
                }else if(currAmount>=.01&&typeFlag[4]){
                    coins=(int)Math.floor(currAmount/.01);
                    currAmount=currAmount-coins*.01;
                    coins=this.removePenny(coins);
                    currAmount=currAmount+coins*.01;
                    typeFlag[4]=false;
//                    System.out.println("CurrP: "+currAmount);
                }

                if ((currAmount>0&&!typeFlag[0]&&!typeFlag[1]&&!typeFlag[2]&&!typeFlag[3]&&!typeFlag[4])||(currAmount<.01))
                {
                    currAmount=0;
                    System.out.println("Fail");
                }
            }
        }else
        {
            System.out.printf("Insufficient Funds");
        }
    }
}
