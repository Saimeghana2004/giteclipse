package module1;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // Widening conversion (implicit)
		        int intValue = 100;
		        long longValue = intValue; // int is widened to long
		        float floatValue = longValue; // long is widened to float
		        double doubleValue = floatValue; // float is widened to double

		        System.out.println("Widening Conversion:");
		        System.out.println("int value: " + intValue);
		        System.out.println("long value: " + longValue);
		        System.out.println("float value: " + floatValue);
		        System.out.println("double value: " + doubleValue);

		        // Narrowing conversion (explicit)
		        double anotherDoubleValue = 123.456;
		        float anotherFloatValue = (float) anotherDoubleValue; // double is narrowed to float
		        long anotherLongValue = (long) anotherFloatValue; // float is narrowed to long
		        int anotherIntValue = (int) anotherLongValue; // long is narrowed to int
		        short shortValue = (short) anotherIntValue; // int is narrowed to short
		        byte byteValue = (byte) anotherIntValue; // int is narrowed to byte

		        System.out.println("\nNarrowing Conversion:");
		        System.out.println("double value: " + anotherDoubleValue);
		        System.out.println("float value: " + anotherFloatValue);
		        System.out.println("long value: " + anotherLongValue);
		        System.out.println("int value: " + anotherIntValue);
		        System.out.println("short value: " + shortValue);
		        System.out.println("byte value: " + byteValue);
		    }
		

	}


