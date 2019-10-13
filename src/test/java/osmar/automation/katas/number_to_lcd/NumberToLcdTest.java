package osmar.automation.katas.number_to_lcd;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class NumberToLcdTest extends TestCase{
	
	
	public NumberToLcdTest( String testName )
    {
        super( testName );
    }
	
	public static Test suite()
    {
        return new TestSuite( NumberToLcdTest.class );
    }
	
	public void testNumberToLcd() {
		String one = "   \n  |\n  |";
		String two = " _ \n _|\n|_ ";
		String three = " _ \n _|\n _|";
		String four = "   \n|_|\n  |";
		String five = " _ \n|_ \n _|";
		String six = " _ \n|_ \n|_|";
		String seven = " _ \n  |\n  |";
		String eight = " _ \n|_|\n|_|";
		String nine = " _ \n|_|\n _|";
		String zero = " _ \n| |\n|_|";
		String expected = "";
		
		for (int i = 0; i<3; i++) {
			expected = expected + one.split("\n")[i]+
					two.split("\n")[i]+
					three.split("\n")[i]+
					four.split("\n")[i]+
					five.split("\n")[i]+
					six.split("\n")[i]+
					seven.split("\n")[i]+
					eight.split("\n")[i]+
					nine.split("\n")[i]+
					zero.split("\n")[i];
			if (i<2)
				expected = expected+"\n";
		}
		
		System.out.println(expected);
		System.out.println(NumberToLcd.numberToLcd(1234567890));
		Assert.assertEquals(expected, NumberToLcd.numberToLcd(1234567890));
	}

}
