import org.junit.jupiter.api.Test;

import java.util.Stack;

public class Card {
    private int number;
    private String suite;
    private String name = "";
    protected static final String[] names = {"Jack","Queen", "King"}; //Ace is assigned in setNumber
    protected static final String[] suites = {"Hearts", "Spades", "Diamonds", "Clubs"};

    public Card() {
        setNumber((int)(Math.random() * 14));
        setSuite(suites[(int)(Math.random() * 4)]);
    }
    public Card(int number, String suite) {
        setNumber(number);
        setSuite(suite);
    }

    public void setNumber(int number) {
        //validation although unnecessary
        if(number > 13)
                number = 13;
        if(number < 1)
            number = 1;
        this.number = number;
        if(number == 1)
            setName("Ace");
        else if(number > 10)
            setName(names[number - 11]);
    }

    public int getNumber() {
        return this.number;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getSuite() {
        return this.suite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Stack<Card> deck() {
        Stack<Card> result = new Stack<>();
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                result.add(new Card(j + 1, suites[i]));
            }
        }
        return result;
    }

    public static Card randomCard(Stack<Card> deck) {
        return deck.get((int)(Math.random() * 52));
    }

    public String toString() {
        String result = "";
        if(!this.name.isBlank())
            result += getName();
        else
            result += getNumber();
        result += " of " + getSuite();
        return result;
    }

}
