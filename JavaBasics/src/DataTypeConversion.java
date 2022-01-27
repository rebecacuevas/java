
public class DataTypeConversion {
	
	public static void main(String[] args) {
		
		byte numberByte = 10;
		
		// automatic conversion - we can storage shorter data on bigger data types
		short numberShort = numberByte;
		
		int numberInt = numberShort;
		
		long numberLong = numberInt;
		
		// parsing
		int anotherInt = (int) numberLong;
		
		short anotherShort = (short) anotherInt;
		
		// arithmetic ops are interpreted always as int
		short number01 = 212;
		short number02 = 1234;
		byte number03 = 10;
		byte number04 = 10;
		
		// you need to specify the data type you want
		short sum = (short) (number01 + number02);
		byte sum02 = (byte) (number03 + number04);
		
		// default int method
		int sum03 = (number03 + number04);
		
		
	}
}
