import java.util.Random;

public class Generator {
	
	public String[] names = {"Adam", "Klausia"};

	public String generateName(){
	    Random rand = new Random();
    	int randomNum = rand.nextInt(names.length);
    	return names[randomNum];		
	}

}
