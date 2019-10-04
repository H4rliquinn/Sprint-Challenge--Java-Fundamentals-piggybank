package local.harliquinn;

public class Main {

    public static void main(String[] args) {
        PiggyBank bank=new PiggyBank();
        Dollar dollars=new Dollar(3);

        bank.addToBank(dollars);
        System.out.println(bank.getbank());
    }
}
