import java.lang.Math;
public class FizzBuzz {
    public String FizzBuzz(int number) {
    	String result;
    	if (number % 3 == 0){
    		result = "Fizz";
    	}
        else if (number % 5 == 0){
    		 result = "Buzz";
    	}
    	else if (number % 3 == 0 && number % 5 == 0){
    		result = "FizzBuzz";
    	}
    	else {
    		 result = String.valueOf(number);
    	}

    	return result;
    }
}
	


