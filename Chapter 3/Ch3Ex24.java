public class Ch3Ex24 {
public static void main(String[] args){
        int pickACard = (int)(Math.random() * 52);
        System.out.println(pickACard);
        String[] deck = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        if (pickACard < 13)
            System.out.println("The card you picked is " + deck[pickACard] + " of " + " Clubs");
        else if (13 <= pickACard && pickACard < 26)
            System.out.println("The card you picked is " + deck[pickACard - 13] + " of " + " Diamonds");
        else if (26 <= pickACard && pickACard < 39)
            System.out.println("The card you picked is " + deck[pickACard - 13 * 2] + " of " + " Hearts");
        else
            System.out.println("The card you picked is " + deck[pickACard - 13 * 3] + " of " + " Spades");

    }
}