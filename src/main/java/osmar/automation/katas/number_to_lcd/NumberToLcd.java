package osmar.automation.katas.number_to_lcd;

import java.util.ArrayList;

public class NumberToLcd {

	public static String numberToLcd(int value,int width, int height) {
		String cadena = String.valueOf(value);
		ArrayList<String> numbers = new ArrayList<String>();
		for (int i = 0; i < cadena.length(); i++) {
			numbers.add(generateLcd(cadena.charAt(i),width,height));

		}
		String resp = "";
		for (int i = 0; i<height+1; i++) {
			for (String number : numbers) {
				resp = resp + number.split("\n")[i];
			}
			if (i<height)
				resp = resp+"\n";
		}
		return resp;

	}
	
	
	private static String generateLcd(char number,int width, int height) {
		String resp = "";
		String spaceTotal = "";
		int halfHeight = (int)(height/2);
		switch (number) {
		
		case '1':
			
			for (int i = 0; i < width; i++) {
				spaceTotal = spaceTotal + " ";
				
			}
			resp = resp + spaceTotal + "  ";
			resp = resp+"\n";
			for (int i = 0; i < height; i++) {
				resp = resp+spaceTotal+" " + "|";
				if (i<height-1) {
					resp = resp+"\n";
				}
			}
			break;
			
		case '2':
			//private String two = " _ \n _|\n|_ ";
			for (int i = 0; i < width; i++) {
				spaceTotal = spaceTotal + " ";
			}
			resp = resp + " ";
			for (int i = 0; i < width; i++) {
				resp = resp + "_";
				if (i==width-1) {
					resp =resp+ " "+"\n";
				}
			}
			
			for (int i = 0; i < halfHeight; i++) {
				if(i<halfHeight-1)
					resp = resp + spaceTotal+" " + "|"+"\n";
				else {
					resp = resp + " ";
					for (int j = 0; j < width; j++) {
						resp = resp + "_";
					}
					resp = resp + "|"+"\n";
				}
			}
			
			for (int i = 0; i < halfHeight; i++) {
				if(i==halfHeight-1)
					resp = resp + "|";
				else
					resp = resp + "|"+spaceTotal+" "+"\n";
			}
			
			for (int i = 0; i < width; i++) {
				if(i==width-1)
					resp = resp + "_ ";
				else
					resp = resp + "_";
			}
			
			
			break;
			
		case '3':
			for (int i = 0; i < width; i++) {
				spaceTotal = spaceTotal + " ";
			}
			resp = resp + " ";
			for (int i = 0; i < width; i++) {
				
				if (i==width-1) {
					resp =resp+"_ "+ "\n";
				}
				else
					resp = resp + "_";
			}
			for (int i = 0; i < halfHeight; i++) {
				if(i<halfHeight-1)
					resp = resp + spaceTotal+" " + "|"+"\n";
				else {
					resp = resp + " ";
					for (int j = 0; j < width; j++) {
						resp = resp + "_";
					}
					resp = resp + "|"+"\n";
				}
			}
			
			for (int i = 0; i < halfHeight; i++) {
				if(i<halfHeight-1)
					resp = resp + spaceTotal+" " + "|"+"\n";
				else {
					resp = resp + " ";
					for (int j = 0; j < width; j++) {
						resp = resp + "_";
					}
					resp = resp + "|";
				}
			}
			
			break;
			
		case '4':
			//private String four = "   \n|_|\n  |";
			for (int i = 0; i < width; i++) {
				spaceTotal = spaceTotal + " ";
			}
			resp = resp+spaceTotal+"  "+"\n";
			for (int i = 0; i < halfHeight; i++) {
				if (halfHeight-1==i) {
					resp = resp + "|";
					for (int j = 0; j < width; j++) {
						resp = resp + "_";
					}
					resp = resp + "|"+"\n";
				}
				else {
					resp = resp + "|"+spaceTotal+"|"+"\n";
				}
			}
			for (int i = 0; i < halfHeight; i++) {
				if(halfHeight-1==i) {
					resp=resp+spaceTotal+" "+"|";
				}
				else {
					resp=resp+spaceTotal+" "+"|"+"\n";
				}
				
			}
			break;
			
		case '5':
			for (int i = 0; i < width; i++) {
				spaceTotal = spaceTotal + " ";
			}
			resp = resp + " ";
			for (int i = 0; i < width; i++) {
				resp = resp + "_";
				if (i==width-1) {
					resp =resp+ " \n";
				}
			}
			
			for (int i = 0; i < halfHeight; i++) {
				if(halfHeight-1==i) {
					resp =resp + "|";
					for (int j = 0; j < width; j++) {
						resp = resp + "_";
					}
					resp = resp+" "+"\n";
				}
				else {
					resp =resp + "|"+spaceTotal+" "+"\n";
				}
				
			}
			
			for (int i = 0; i < halfHeight; i++) {
				if(halfHeight-1==i) {
					resp = resp + " ";
					for (int j = 0; j < width; j++) {
						resp = resp + "_";
					}
					resp =resp+ "|";
				}
				else {
					resp =resp + spaceTotal+" "+"|"+"\n";
				}
				
			}
			break;
			
		case '6':
			//private String six = " _ \n|_ \n|_|";
			for (int i = 0; i < width; i++) {
				spaceTotal = spaceTotal + " ";
			}
			resp = resp + " ";
			for (int i = 0; i < width; i++) {
				resp = resp + "_";
				if (i==width-1) {
					resp =resp+" "+ "\n";
				}
			}
			
			for (int i = 0; i < halfHeight; i++) {
				if(halfHeight-1==i) {
					resp =resp+ "|";
					for (int j = 0; j < width; j++) {
						resp = resp + "_";
					}
					resp = resp+" ";
				}
				else {
					resp =resp + "|"+spaceTotal+" "+"\n";
				}
				
			}
			resp = resp+"\n";
			for (int i = 0; i < halfHeight; i++) {
				if(halfHeight-1==i) {
					resp = resp + "|";
					for (int j = 0; j < width; j++) {
						resp = resp + "_";
					}
					resp = resp + "|";
				}
				else {
					resp = resp + "|"+spaceTotal+"|"+"\n";
				}
				
			}
			break;
			
		case '7':
			for (int i = 0; i < width; i++) {
				spaceTotal = spaceTotal + " ";
			}
			resp = resp + " ";
			for (int i = 0; i < width; i++) {
				resp = resp + "_";
				if (i==width-1) {
					resp =resp+ " "+ "\n";
				}
			}
			for (int i = 0; i < height; i++) {
				if(i==height-1)
					resp = resp + spaceTotal+" "+"|";
				else
					resp = resp + spaceTotal+" "+"|"+"\n";
			}
			break;
		case '8':
			for (int i = 0; i < width; i++) {
				spaceTotal = spaceTotal + " ";
			}
			resp = resp + " ";
			for (int i = 0; i < width; i++) {
				resp = resp + "_";
				if (i==width-1) {
					resp =resp+ " "+"\n";
				}
			}
			
			for (int i = 0; i < halfHeight; i++) {
				if(halfHeight-1==i) {
					resp = resp + "|";
					for (int j = 0; j < width; j++) {
						resp = resp + "_";
					}
					resp = resp + "|";
				}
				else {
					resp = resp + "|"+spaceTotal+"|"+"\n";
				}
				
			}
			resp = resp + "\n";
			for (int i = 0; i < halfHeight; i++) {
				if(halfHeight-1==i) {
					resp = resp + "|";
					for (int j = 0; j < width; j++) {
						resp = resp + "_";
					}
					resp = resp + "|";
				}
				else {
					resp = resp + "|"+spaceTotal+"|"+"\n";
				}
				
			}
			break;
			
		case '9':
			for (int i = 0; i < width; i++) {
				spaceTotal = spaceTotal + " ";
			}
			resp = resp + " ";
			for (int i = 0; i < width; i++) {
				resp = resp + "_";
				if (i==width-1) {
					resp =resp+ " "+"\n";
				}
			}
			
			for (int i = 0; i < halfHeight; i++) {
				if(halfHeight-1==i) {
					resp = resp + "|";
					for (int j = 0; j < width; j++) {
						resp = resp + "_";
					}
					resp = resp + "|";
				}
				else {
					resp = resp + "|"+spaceTotal+"|"+"\n";
				}
				
			}
			resp = resp + "\n";
			for (int i = 0; i < halfHeight; i++) {
				if(halfHeight-1==i) {
					resp = resp + " ";
					for (int j = 0; j < width; j++) {
						resp = resp + "_";
					}
					resp = resp + "|";
				}
				else {
					resp = resp + spaceTotal+" "+"|"+"\n";
				}
			}
			break;
		case '0':
			for (int i = 0; i < width; i++) {
				spaceTotal = spaceTotal + " ";
			}
			resp = resp + " ";
			for (int i = 0; i < width; i++) {
				resp = resp + "_";
				if (i==width-1) {
					resp =resp+ " "+"\n";
				}
			}
			
			for (int i = 0; i < height; i++) {
				if(i==height-1) {
					resp = resp + "|";
					for (int j = 0; j < width; j++) {
						resp = resp + "_";
					}
					resp = resp + "|";
				}
				else {
					resp = resp + "|"+spaceTotal+"|"+"\n";
				}
			}
			break;
		}
		
		
		
		return resp;
	}
	
	public static void main(String args[]) {
		System.out.println(NumberToLcd.generateLcd("1".charAt(0), 2, 2));
		System.out.println(NumberToLcd.generateLcd("2".charAt(0), 2, 2));
		System.out.println(NumberToLcd.generateLcd("3".charAt(0), 2, 2));
		System.out.println(NumberToLcd.generateLcd("4".charAt(0), 2, 2));
		System.out.println(NumberToLcd.generateLcd("5".charAt(0), 2, 2));
		System.out.println(NumberToLcd.generateLcd("6".charAt(0), 2, 2));
		System.out.println(NumberToLcd.generateLcd("7".charAt(0), 2, 2));
		System.out.println(NumberToLcd.generateLcd("8".charAt(0), 2, 2));
		System.out.println(NumberToLcd.generateLcd("9".charAt(0), 2, 2));
		System.out.println(NumberToLcd.generateLcd("0".charAt(0), 2, 2));
		System.out.println(NumberToLcd.numberToLcd(1234567890, 6, 6));
		
	}
}
