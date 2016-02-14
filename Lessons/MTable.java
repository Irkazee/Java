class MTable {
	public static void main (String[]args){
		int first_mult;
		int second_mult;
		int result;

			first_mult = Integer.parseInt (args[0]);
			second_mult = Integer.parseInt (args[1]);
			result =  first_mult * second_mult;

				if (result == Integer.parseInt (args[2])){
				System.out.println ("Correct");
				}
					else {
					System.out.println ("Incorrect");
}

}
}
