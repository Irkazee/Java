class HT10 {
	public static void main (String[]args){
		int number;  
			number = Integer.parseInt(args[0]);
				int First_did = number / 10;
				int Second_did = number % 10;
				int Result = Second_did * 10;
				int Fin_Res = Result + First_did ;
					
					System.out.println(Fin_Res);
	
	
	
	
}
}