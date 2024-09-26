package java_homework_1;

public class MathCalc {

	public static void main(String[] args) {
		int sunDiameter = 865000;
		int earthDiameter = 7600;
		int sunRadius = sunDiameter / 2;
		int earthRadius = earthDiameter / 2;
		double sunVolume = 4 * Math.PI * sunRadius * sunRadius * sunRadius / 3;
		double earthVolume = 4 * Math.PI * earthRadius * earthRadius * earthRadius / 3;
		double ratioSunToEarth = sunVolume / earthVolume;
		
		System.out.println("The volume of the Earth is " 
				+ earthVolume + " cubic miles, the volume of the sun is " 
				+ sunVolume + " cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is " 
				+ ratioSunToEarth);
	}
}
