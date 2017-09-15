package cast;


public class Primitives {
	
	private static void dumpMaxValues() {
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
	}

	public static void main(String[] args) {
		dumpMaxValues();
		
		// long to int
		long l = Long.MAX_VALUE;
		int i = (int)l;
		System.out.println("long to int: " + l + ", " + i);
		
		// long to int
		l = Long.MAX_VALUE-5;
		i = (int)l;
		System.out.println("long to int: " + l + ", " + i);
		
		// int to long
		i = Integer.MAX_VALUE;
		l = i;
		System.out.println("int to long: " + i + ", " + l);
		
		// byte to double
		byte b = 100;
		double d = b;
		System.out.println("byte to double: " + b + ", " + d);
		
		// double to byte
		d = 45.67;
		b = (byte)d;
		System.out.println("double to byte: " + d + ", " + b);
		
		// double to byte
		d = 456.789;
		b = (byte)d;
		System.out.println("double to byte: " + d + ", " + b);
		
		// float to long
		float f = 12345.6789f;
		l = (long)f;
		System.out.println("float to long: " + f + ", " + l);
		
		// float to long
		f = Float.MAX_VALUE;
		l = (long)f;
		System.out.println("float to long: " + f + ", " + l);
		
		// long to float
		l = Long.MAX_VALUE;
		f = l;
		System.out.println("float to long: " + l + ", " + f);
	}
}
