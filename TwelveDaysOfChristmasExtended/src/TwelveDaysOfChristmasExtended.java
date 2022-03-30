/* SELF ASSESSMENT
 1. Did I use easy-to-understand meaningful, properly formatted, variable names and CONSTANTS?
        Mark out of 10:10 
        Comment:Yes, I used variable names like day, ordinalString, christmasGift and verse which are easy to understand.   
 2. Did I implement the getVerse function correctly and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25:25 
        Comment:Yes, i implemented the getVerse function correctly in a manner which it could be understood  
 3. Did I implement the getChristmasGift function correctly using a switch statement and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25:25 
        Comment:Yes, I implemented the getChristmasiGift function correctly using a switch statement.  
 4. Did I implement the getOrdinalString function correctly using if or conditional operators and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 25
        Comment:Yes, I implemented the getOrdinalString function correctly using if statements.  
 5. Does the program produce the output correctly?
       Mark out of 10:10 
        Comment:Yes, my program produces the output correctly  
 6. How well did I complete this self-assessment?
        Mark out of 5:5 
        Comment:I have completed the self assignment very honestly. 
 Total Mark out of 100 (Add all the previous marks):
 */ 
public class TwelveDaysOfChristmasExtended 
{

	public static final int DAYS_OF_CHRISTMAS=12;

	public static String getOrdinalString ( int day )
	{
		String ordinalString="";

		if(day==1)
		{
			ordinalString="first";
		}
		else if(day==2)
		{
			ordinalString="second";
		}
		else if(day==3)
		{
			ordinalString="third";
		}
		else if(day==4)
		{
			ordinalString="fourth";
		}
		else if(day==5)
		{
			ordinalString="fifth";
		}
		else if(day==6)
		{
			ordinalString="sixth";
		}
		else if(day==7)
		{
			ordinalString="seventh";
		}
		else if(day==8)
		{
			ordinalString="eighth";
		}
		else if(day==9)
		{
			ordinalString="ninth";
		}
		else if(day==10)
		{
			ordinalString="tenth";
		}
		else if(day==11)
		{
			ordinalString="eleventh";
		}
		else if(day==12)
		{
			ordinalString="twelfth";
		}
		return ordinalString;

	}
	public static String getChristmasGift(int day) {
		String christmasGift="";
		switch (day) {
		case 12:
			christmasGift = "12 Drummers Drumming\n";
		case 11:
			christmasGift = christmasGift+"11 Pipers Piping,\n";
		case 10:
			christmasGift = christmasGift+"10 Lords a Leaping,\n";
		case 9:
			christmasGift = christmasGift+"9 Ladies Dancing,\n";
		case 8:
			christmasGift = christmasGift+"8 Maids a Milking,\n";
		case 7:
			christmasGift = christmasGift+"7 Swans a Swimming,\n";
		case 6:
			christmasGift = christmasGift+"6 Geese a Laying,\n";
		case 5:
			christmasGift = christmasGift+"5 Golden Rings,\n";
		case 4:
			christmasGift = christmasGift+"4 Calling Birds,\n";
		case 3:
			christmasGift = christmasGift+"3 French Hens,\n";
		case 2:
			christmasGift = christmasGift+"2 Turtle Doves and\n";
		case 1:
			christmasGift = christmasGift+"A Partridge in a Pear Tree \n";
			break;
		default:
			break;

		}
		return christmasGift;
	}

	public static String getVerse(int day)
	{
		String verse;

		verse = "On the " + getOrdinalString(day) + " day of Christmas \n" + "my true love sent to me:\n" + getChristmasGift(day);

		return verse;

	}
	public static void main (String[]args)
	{
		int day;
		for(day=1;day<=DAYS_OF_CHRISTMAS;day++)
		{
			System.out.println(getVerse(day));
		}
	}


}
