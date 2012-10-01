class Homework {
	public static void main(String[] args) {
		if( args.length == 0 ) {
			System.out.println("Please enter an action");
			return;
		}
	
		String action = args[0];
		
		if( action.equals("for-each") ) {
			System.out.println("Testing : " + action);
		}
		else if( action.equals("for") ) {
			System.out.println("Testing: " + action);
		}
		else if( action.equals("while") ) {
			System.out.println("Testing: " + action);
		}
		else {
			System.out.println("No match found for "+action);
		}
	}
}