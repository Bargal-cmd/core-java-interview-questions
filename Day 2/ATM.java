import java.util.Scanner;

class bank {
    Scanner sc = new Scanner(System.in);
    private String cardno;

    public String getCardno() {
        return cardno;
    }


    void takeCardNo() {
        cardno = sc.nextLine();
        int cardlen = String.valueOf(cardno).length();
        if (cardlen == 16) {
            String lastFive = cardno.substring(11, 16);
            System.out.println("xxxx xxxx xxx" + lastFive);

        }
    }

    void checkPrimaryCard() {
        String primary = cardno.substring(11, 13);
        if (primary.contentEquals("00")) {
            System.out.println("not primary card");
        } else {
            System.out.println("Invalid card..");
        }

    }

}

public class ATM {
    public static void main(String[] args) {
        bank bk = new bank();
        bk.takeCardNo();
        bk.checkPrimaryCard();
        bk.getCardno();
    }

}
