public class negativeChecker {
	
	/*
	*	PURPOSE: determine if the imported value is a negative number
	*
	*	IMPORT: integer value to be checked
	*
	*	RETURN: if the import value is negative it will return true, 
	*	otherwise it will return false
	*/
	public boolean isNegative (int var) {

		if (var * 2 < var) {
			return true;
		}
		return false;
	}

}
