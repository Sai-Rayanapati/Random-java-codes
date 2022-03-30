package del;

public class del 
{
    public static final int TOTAL_CHRISTMAS_DAYS=12;
	public static String getOrdinalString(int number) 
	{
		String ordinalString=null;
		if(number==1)
		{
			ordinalString="first";
		}
		else if(number==2)
		{
			ordinalString="second";
		}
		else if(number==3)
		{
			ordinalString="third";
		}
		else if(number==4)
		{
			ordinalString="fourth";
		}
		else if(number==5)
		{
			ordinalString="fifth";
		}
		else if(number==6)
		{
			ordinalString="sixth";
		}
		else if(number==7)
		{
			ordinalString="seventh";
		}
		else if(number==8)
		{
			ordinalString="eighth";
		}
		else if(number==9)
		{
			ordinalString="ninth";
		}
		else if(number==10)
		{
			ordinalString="tenth";
		}
		else if(number==11)
		{
			ordinalString="eleventh";
		}
		else if(number==12)
		{
			ordinalString="twelfth";
		}
	
		
		return ordinalString;
	}
	
	public static String getChristmasGift(int giftnumber)
	{
		String christmasGift=null;
		switch (giftnumber)
        {
           case 12:
              christmasGift= "Twelve drummers drumming,";
           case 11:
        	  christmasGift= "Eleven pipers piping,";
           case 10:
        	   christmasGift="Ten lords a leaping,";
           case 9:
        	   christmasGift= "Nine ladies dancing,";
           case 8:
        	   christmasGift= "Eight maids a milking,";
           case 7:
        	   christmasGift= "Seven swans a swimming,";
           case 6:
        	   christmasGift= "Six geese a laying,";
           case 5:
        	   christmasGift= "Five golden rings,";
           case 4:
        	   christmasGift= "Four calling birds,";
           case 3:
        	   christmasGift= "Three French hens,";
           case 2:
        	   christmasGift= "Two turtle doves, and";
        	   ;
           default:
        	   christmasGift= "A partridge in a pear tree.";
              break;
        }
		return christmasGift;
	}
	
	public static String getVerse(int verseNumber)
	{
		String verse=null;
		verse="On the "+ getOrdinalString(verseNumber)+"day of Christmas my true love gave to me "+
				getChristmasGift( verseNumber);
		return verse;
		
	}
	public static void main(String args[])
	{
		String sum=null;
		for(int day=1;day<=12;day++)
		{
			
			sum=sum+getVerse(day);
			
		}
		System.out.print(sum);
	}

	

}

