class HT12 {
	public static void main (String []args){
		int number;  
			number = Integer.parseInt(args[0]);
				int s = 0, m = 1;
					for (int i = 0; i < 3; i++) {
						m *= number % 10;
						s += number % 10;
						number /= 10;

		
	}
							System.out.println(s);
							System.out.println(m);
}
}