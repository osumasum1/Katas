package osmar.automation.katas.number_to_lcd;

import java.util.ArrayList;

public class NumberToLcd {

	private static final String one = "   \n  |\n  |";
	private static final String two = " _ \n _|\n|_ ";
	private static final String three = " _ \n _|\n _|";
	private static final String four = "   \n|_|\n  |";
	private static final String five = " _ \n|_ \n _|";
	private static final String six = " _ \n|_ \n|_|";
	private static final String seven = " _ \n  |\n  |";
	private static final String eight = " _ \n|_|\n|_|";
	private static final String nine = " _ \n|_|\n _|";
	private static final String zero = " _ \n| |\n|_|";

	public static String numberToLcd(int value) {
		String cadena = String.valueOf(value);
		ArrayList<String> numbers = new ArrayList<String>();
		for (int i = 0; i < cadena.length(); i++) {
			switch (cadena.charAt(i)) {
			case '0':
				numbers.add(zero);
				break;
			case '1':
				numbers.add(one);
				break;
			case '2':
				numbers.add(two);
				break;
			case '3':
				numbers.add(three);
				break;
			case '4':
				numbers.add(four);
				break;
			case '5':
				numbers.add(five);
				break;
			case '6':
				numbers.add(six);
				break;
			case '7':
				numbers.add(seven);
				break;
			case '8':
				numbers.add(eight);
				break;
			case '9':
				numbers.add(nine);
				break;
			}

		}
		String resp = "";
		for (int i = 0; i<3; i++) {
			for (String number : numbers) {
				resp = resp + number.split("\n")[i];
			}
			if (i<2)
				resp = resp+"\n";
		}
		return resp;

	}
}
