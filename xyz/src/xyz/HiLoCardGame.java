package xyz;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
 
public class HiLoCardGame {
 
	public static final int OFFSET_NUMBER = 2;
	public static final int CORRECT_ANSWERS_TO_WIN = 4;
	public static final int WRONG_ANSWERS_TO_LOSE = 1;
	public static void main(String[] args) {
 
		int correctAnswerCount = 0;
	    int wrongAnswerCount = 0;
	    while (correctAnswerCount < CORRECT_ANSWERS_TO_WIN && wrongAnswerCount < WRONG_ANSWERS_TO_LOSE);
 
	    {
	    	Random generator = new Random();
	    	int currentCard = generator.nextInt(13 + OFFSET_NUMBER);
	    	String input = JOptionPane.showInputDialog(null, "The current card is " + currentCard + "\nWill the next card be higher, lower or equal?\nType score for current score.");
	    	Scanner scanner = new Scanner (input);
	    	int nextCard = generator.nextInt(13 + OFFSET_NUMBER);
 
	    	if (nextCard > currentCard && scanner.hasNext("Higher"))
	    	{
 
	          ++correctAnswerCount; 
	          JOptionPane.showMessageDialog(null, "You have guessed correctly,\nYour score is now "  + correctAnswerCount);            
 
	    	}
 
	    	if (nextCard > currentCard && scanner.hasNext("Lower"))
	    	{
	    		++wrongAnswerCount;
	            JOptionPane.showMessageDialog(null, "You have guessed incorrectly,\nPlease restart the game.");
	    	}
 
	    	if (nextCard > currentCard && scanner.hasNext("Equal"))
	    	{
	    		++wrongAnswerCount;
	    		JOptionPane.showMessageDialog(null,  "You have guessed incorrectly,\nPlease restart the game.");
	    	}
 
	    	if (nextCard < currentCard && scanner.hasNext("Higher"))
	    	{
	    		++wrongAnswerCount;
	    		JOptionPane.showMessageDialog(null, "You have guessed incorrectly,\nPlease restart the game.");
	    	}
 
	    	if (nextCard < currentCard && scanner.hasNext("Lower"));
	    	{
	    		++correctAnswerCount;
	    		JOptionPane.showMessageDialog(null, "You have guessed correctly,\nYour score is now " + correctAnswerCount);
	    	}
 
	    	if (nextCard < currentCard && scanner.hasNext("Equal"));
	    	{
	    		++wrongAnswerCount;
	    		JOptionPane.showMessageDialog(null, "You have guessed incorrectly,\nPlease restart the game.");
	    	}
 
	    	if (nextCard == currentCard && scanner.hasNext("Higher"));
	    	{
	    		++wrongAnswerCount;
	    		JOptionPane.showMessageDialog(null, "You have guesseed incorrectly,\nPlease restart the game.");
	    	}
 
	    	if (nextCard == currentCard && scanner.hasNext("Lower"));
	    	{
	    		++wrongAnswerCount;
	    		JOptionPane.showMessageDialog(null, "You have guessed incorrectly,\nPlease restart the game.");
	    	}
 
	    	if  (nextCard == currentCard && scanner.hasNext("Equal"));
	    	{
	    		++correctAnswerCount;
	    		JOptionPane.showMessageDialog(null, "You have guessed correctly,\nYour score is now " + correctAnswerCount);
	    	}
 
	    	if (scanner.hasNext("Score"));
	    	{
	    		JOptionPane.showMessageDialog(null, "Your score is " + correctAnswerCount + "\n You must answer " + (4-correctAnswerCount) + "more correctly to win.");
	    	}
 
	    	if (correctAnswerCount==4);
	    	{
	    		JOptionPane.showMessageDialog(null, "Congratulations, you have won!\nPlease play again sometime.");
	    	}
 
	    }
 
	}
 
}