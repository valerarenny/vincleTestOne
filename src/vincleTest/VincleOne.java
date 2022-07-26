package vincleTest;

public class VincleOne {

	public static void main(String[] args) {
		
		int numbers=0;
		String printer;
		
		do {
			if(numbers % 3 == 0) {
				printer = (numbers % 15 == 0) ? "VINCLE" : "VIN";
			}
			else if(numbers % 5 == 0) {
				printer = (numbers % 15 == 0) ? "VINCLE" : "CLE";
			}
			else {
				printer = Integer.toString(numbers);
			}		
			System.out.println(printer);
			numbers++;
			
		}while(numbers<=100);
	}

}
