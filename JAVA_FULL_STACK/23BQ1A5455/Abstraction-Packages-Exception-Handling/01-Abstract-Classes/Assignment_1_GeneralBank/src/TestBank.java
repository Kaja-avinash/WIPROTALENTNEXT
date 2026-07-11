public class TestBank {

    public static void main(String[] args) {

        ICICIBank i = new ICICIBank();

        System.out.println("ICICI Bank");
        System.out.println("Savings Interest Rate : " + i.getSavingsInterestRate() + "%");
        System.out.println("Fixed Deposit Interest Rate : " + i.getFixedDepositInterestRate() + "%");

        System.out.println();

        KotMBank k = new KotMBank();

        System.out.println("Kotak Mahindra Bank");
        System.out.println("Savings Interest Rate : " + k.getSavingsInterestRate() + "%");
        System.out.println("Fixed Deposit Interest Rate : " + k.getFixedDepositInterestRate() + "%");

        System.out.println();

        GeneralBank g1 = new KotMBank();

        System.out.println("GeneralBank Reference -> KotMBank");
        System.out.println("Savings Interest Rate : " + g1.getSavingsInterestRate() + "%");
        System.out.println("Fixed Deposit Interest Rate : " + g1.getFixedDepositInterestRate() + "%");

        System.out.println();

        GeneralBank g2 = new ICICIBank();

        System.out.println("GeneralBank Reference -> ICICIBank");
        System.out.println("Savings Interest Rate : " + g2.getSavingsInterestRate() + "%");
        System.out.println("Fixed Deposit Interest Rate : " + g2.getFixedDepositInterestRate() + "%");

    }

}