package local.harliquinn;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        PiggyBank bank=new PiggyBank();

        bank.addToBank(new Quarter());
        bank.addToBank(new Dime());
        bank.addToBank(new Dollar(5));
        bank.addToBank(new Nickel(3));
        bank.addToBank(new Dime(7));
        bank.addToBank(new Dollar());
        bank.addToBank(new Penny(10));

        System.out.println(bank.getBank());
        System.out.println("The piggy bank holds "+fp.format(bank.getBankValue()));
    }
}
