package estd;

public class Monkey {

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		
		/*if(aSmile  && bSmile)
			return true;
		
		if(aSmile == false && bSmile == false)
			return true;
		
		if(aSmile && bSmile == false)
			return false;
		
		if(aSmile == false && bSmile)
			return false;*/
		
		if(aSmile && bSmile || !aSmile && !bSmile)
			return true;
		
		
		return false;
	}
}
