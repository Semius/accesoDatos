package interfaces;

import java.util.ArrayList;
import java.util.Random;

public class azar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//random numbers are 0,1,2,3 
		ArrayList<Integer> numbers = new ArrayList<Integer>();   
		Random randomGenerator = new Random();
		while (numbers.size() < 10) {

		    int random = randomGenerator .nextInt(10);
		    if (!numbers.contains(random)) {
		        numbers.add(random);
		    }
		}
		
		System.out.println(numbers.get(2));
		
        ArrayList<String> arrayFinal = new ArrayList<String>();

        
        arrayFinal.add(numbers.get(4)+ " - " + numbers.get(5) + " - "+numbers.get(6) + " - "+numbers.get(7));
        /*int arrayLength = ((CharSequence) numbers).length();
        System.out.println(arrayLength);*/
	}

}
