class HT1 {
	public static void main (String[]args) {
		String a = "Violet";				/// В задании речь идет о простых типах (числах)
		String b = "Purple";
		String c = "";
			c = b ;				
			b = a ; 
			a = c ;
				System.out.println (a + b);
	
	}
}

//Поменять местами содержимое переменных A и B и вывести новые значения A и B




class HT2 {
	public static void main (String[]args) {
		String a = "Chair";						/// В задании речь идет о простых типах (числах)
		String b = "Bad";
		String c = "Table";
		String d = "";
			d = a ;
			a = b ;
			b = c ; 
			c = d ;
				System.out.println (a + b + c);
	
	}
}

//Даны переменные A, B, C. Изменить их значения, переместив содержимое A в B, B — в C, C — в A, и вывести новые значения переменных A, B, C.





class HT3 {
	public static void main (String[]args) {
		String A = "Humster";					/// В задании речь идет о простых типах (числах)
		String B = "Dog";
		String C = "Parrot";		
		String D = "";
			D = A ;
			A = C ;
			C = B ; 
			B = D ;
				System.out.println (A + B + C);
	
	}
}

//Даны переменные A, B, C. Изменить их значения, переместив содержимое A в C, C — в B, B — в A, и вывести новые значения переменных A, B, C.





class HT4 {
	public static void main (String[]args) {
		int a = 10 ;							/// В задании переменные должны вводится как аргументы командной строки.
		int b = 5 ;
			a = (a + b);
			b = (a - b);
			a = (a - b);
				System.out.println (a);
				System.out.println (b);

}

}

//Поменять местами содержимое переменных A и B, используя только эти две переменные, и вывести новые значения A и B.





class HT5 {
	public static void main (String[]args) {
		int a = 2;						/// В задании переменные должны вводится как аргументы командной строки.					
		int b = (a * a) ;
			System.out.println (b);
			System.out.println (b * b);
			System.out.println (b * b * b * b);
		

}

}

//Дано число A. Вычислить A^8, используя вспомогательную переменную и три операции умножения. Для этого последовательно находить A^2, A^4, A^8. Вывести все найденные степени числа A.




class HT6 {
	public static void main (String[]args) {
		float tf = 59.00000f ;					/// В задании переменные должны вводится как аргументы командной строки.
		float tc = ((tf - 32) * 5 / 9) ;
			System.out.println (tc);
	
	
	
	}

}

/*Дано значение температуры T в градусах Фаренгейта. Определить значение этой же температуры в градусах Цельсия. 
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношеним:
TC=(TF–32)·5/9. */





class HT7 {									/// Здесь решена предыдущая задача.
	public static void main (String[]args) {
		float tf ;
		float tc ;
		
			tf = Float.parseFloat (args[0]);
			tc = ((tf - 32) * 5 / 9) ;
				System.out.println (tc);
			
	}

}

/* Дано значение температуры T в градусах Цельсия. Определить значение этой

же температуры в градусах Фаренгейта. Температура по Цельсию TC и

температура по Фаренгейту TF связаны следующим соотношением:

TC=(TF–32)·5/9. Ввод температуры организовать через параметры командной

строки. */






class HT8 {
	public static void main (String []args){
		int number;  
			number = Integer.parseInt(args[0]);
				int First_did = number / 10;
				int Second_did = number % 10;
				
					System.out.println (First_did) ;
					System.out.println (Second_did) ;
					
					
					
	}
}

/* Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем

— его правую цифру (единицы). Для нахождения десятков использовать

операцию деления нацело, для нахождения единиц — операцию взятия остатка

от деления. */





class HT9 {
	public static void main (String[]args){
		int number;  
		number = Integer.parseInt(args[0]);
			int First_did = number / 10;  
			int Second_did = number % 10;  
			int Sum_did = First_did +Second_did;  
				System.out.println(Sum_did); 
					 Sum_did = First_did * Second_did;
						System.out.println(Sum_did);
	
	
	}
}

// Дано двузначное число. Найти сумму и произведение его цифр.




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

// Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.





class HT11 {
	public static void main (String[]args){
		int number;  
			number = Integer.parseInt(args[0]);
				System.out.println ( (number / 10) + ((number % 10) * 10)) ;
	}
}

/* Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.

Решить предыдущую задачу, не использую никаких дополнительных переменных. */





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

// Дано трехзначное число. Найти сумму и произведение его цифр.



class HT13 {									/// Задание выполнено неверно
	public static void main (String []args) {
		int a = 3 ;
			for ( int i = 3 ; i <= 36; i += 3) {
				System.out.println ( a*i ) ;
				
				
			}
	
	
	
	
	}



}

// Write a for loop that will print out all the multiples of 3 from 3 to 36, that is: 3 6 9 12 15 18 21 24 27 30 33 36.




class HT15 {
	public static void main(String[] args) {

		int n = 1 ;
			while (n <= 32 ) {

				n *= 2;

					System.out.println(n);

}

}
}

/* Show the exact output that would be produced by the following main() routine ans

how it can be changed/improved:

public static void main(String[] args) {

int N;

N = 1;

while (N <= 32) {

N = 2 * N;

System.out.println(N);

}

} */




class HT16 {
	public static void main(String[] args) {

		int x = 5;
		int y = 1;

			while (x > 0) {

				x -= 1;
				y *= x;

					System.out.println(y);

		} 

	}
	
	
	
	
}

/* Show the exact output produced by the following main() routine:

public static void main(String[] args) {

int x, y;

x = 5;

y = 1;

while (x > 0) {

x = x - 1;

y = y * x;

System.out.println(y);

} } */



class HT7 {
	public static void main (String[]args) {
		float tf ;
		float tc ;
		
			tf = Float.parseFloat (args[0]);
			tc = ((tf - 32) * 5 / 9) ;
				System.out.println (tc);
			
	}

}

/* Дано значение температуры T в градусах Цельсия. Определить значение этой

же температуры в градусах Фаренгейта. Температура по Цельсию TC и

температура по Фаренгейту TF связаны следующим соотношением:

TC=(TF–32)·5/9. Ввод температуры организовать через параметры командной

строки. */





class HT18 { 

	public static void main(String[] args) { 

		int a = 1;
		int b = 6;
				double r ;
				double n ;
				int s ;
					r = b + (Math.random() * (a - b));	/// здесь будут дробніе числа
					n = b + (Math.random() * (a - b));
					s = (int)(r + n) ;					/// здесь будут потери округления	
                
						System.out.println(r);
						System.out.println(n);
						System.out.println(s);

} 

}








// Write a program that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).





class HT19 {
	public static void main (String[]args){
		int number = Integer.parseInt(args[0]);
			System.out.println ("Enter your number" + (number) );
		if (number % 2 == 0)
			System.out.println ("The number is even");
		else
			System.out.println ("The number is odd");
	
	
	
	
	}




}

/* Fill in the following main() routine so that it will ask the user to enter an integer,

read the user’s response, and tell the user whether the number entered is even or 

odd. (Recall that an integer n is even if n % 2 == 0.) */