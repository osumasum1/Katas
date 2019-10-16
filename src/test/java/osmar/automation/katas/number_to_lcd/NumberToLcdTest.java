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
		String one = "      \n     |\n     |\n     |\n     |";
		String two = " ____ \n     |\n ____|\n|     \n|____ ";
		String three = " ____ \n     |\n ____|\n     |\n ____|";
		String four = "      \n|    |\n|____|\n     |\n     |";
		String five = " ____ \n|     \n|____ \n     |\n ____|";
		String six = " ____ \n|     \n|____ \n|    |\n|____|";
		String seven = " ____ \n     |\n     |\n     |\n     |";
		String eight = " ____ \n|    |\n|____|\n|    |\n|____|";
		String nine = " ____ \n|    |\n|____|\n     |\n ____|";
		String zero = " ____ \n|    |\n|    |\n|    |\n|____|";
		String expected = "";
		
		for (int i = 0; i<5; i++) {
			expected = expected + one.split("\n")[i] +
					two.split("\n")[i]+
					three.split("\n")[i]+
					four.split("\n")[i]+
					five.split("\n")[i]+
					six.split("\n")[i]+
					seven.split("\n")[i]+
					eight.split("\n")[i]+
					nine.split("\n")[i]+
					zero.split("\n")[i];
			if (i<4)
				expected = expected+"\n";
		}
		
		System.out.println(expected);
		System.out.println(NumberToLcd.numberToLcd(1234567890,4,4));
		Assert.assertEquals(expected, NumberToLcd.numberToLcd(1234567890,4,4));
	}

}
