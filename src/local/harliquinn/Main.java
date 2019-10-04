package local.harliquinn;

public class Main {

    public static void main(String[] args) {
        PiggyBank bank=new PiggyBank();

        bank.addToBank(new Quarter());
        bank.addToBank(new Dime());
        bank.addToBank(new Dollar(5));
        bank.addToBank(new Nickel(3));
        bank.addToBank(new Dime(7));
        bank.addToBank(new Dollar());
        bank.addToBank(new Penny(10));



        System.out.println(bank.getbank());
    }
}
