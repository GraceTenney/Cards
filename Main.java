
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<Card> deck = Card.deck();
        Stack<Card> stack = new Stack<>();
        for(int i = 0; i < 5; i++) {
            stack.add(Card.randomCard(deck));
        }
        for(int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }
}