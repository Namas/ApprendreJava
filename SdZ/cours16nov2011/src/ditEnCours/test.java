package ditEnCours;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int minInt = Integer.MIN_VALUE, maxInt = Integer.MAX_VALUE;
		
		System.out.println("minInt: "+minInt+" max Int: "+maxInt);
		short castShort= Short.MIN_VALUE;
		System.out.println(castShort);
		int power = (int)(short)2e23;
		System.out.println(power);
		System.out.println('\f');
		System.out.println('\\');
		
		System.out.println(abs(-23));

	}

	private static int abs(int i) {
		if(i<0)
			i=-i;
		return i;
	}

}