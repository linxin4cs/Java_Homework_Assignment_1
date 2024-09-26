package java_homework_1;

public class StringCharacters {
	public static void main(String[] args)
	{
		String text = "To be or not to be, that is the question;"
				+ "Whether `tis nobler in the mind to suffer" 
				+ " the slings and arrows of outrageous fortune,"
				+ " or to take arms against a sea of troubles,"
				+ " and by opposing end them?";
		int spaces = 0,
			vowels = 0,
			letters = 0;
		
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == ' ') {
				spaces++;
				continue;
			}
			
			int asciiCode = text.substring(i, i + 1).toUpperCase().charAt(0);
			if(asciiCode >= 65 && asciiCode <= 90) {
				letters++;
			}
				
			if("aAeEiIoOuU".contains(text.substring(i, i + 1))) {
				vowels++;
			}
		}
		
		System.out.println("The text contained vowels: " + vowels + "\n"
				+ "consonants " + (letters - vowels) + "\n"+ "spaces: " + spaces);
	}
}
