package fizzbuzz;
import java.io.PrintStream;
import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FizzBuzz.sumTo(10));
		
		//HelloWorld.fizzbuzz(System.out, 1);
		//HelloWorld.fizzbuzz(System.out, 3);
		FizzBuzz.fizzbuzz(System.out, 5);
		
		StringBuilder actual = new StringBuilder("");
		FizzBuzz.readUntil(new Scanner("Here goes the charm"),"goes", actual);
		System.out.println(actual.toString());
//		
		FizzBuzz.rmvAll(actual, 'e');
		System.out.println(actual.toString());
//		
		return;
		
	}
	/* SUMTO ADDS ALL THE INTEGERS FROM 0 TO N-1
	 * @param n is an  positive integer
	 * @PRE N IS POSITIVE INTEGER
	 * @RETURN SUM FROM 0 TO N-1
	 */
	public static int sumTo(int n) {
		//int sum = 0;
		if (n == 0) {
			return 0;
		}
		else {
			return n + FizzBuzz.sumTo(n-1);
		}
	}
	/*
	 * fizzbuzz determines if the number is fizz/buzz/
	 *  fizzbizz or i 
	 *  @param st prints string
	 *  @param n is a positive integer greater than 0
	 *  @pre n is a positive integer
	 *  @return fizz if n is divisible by 3 but not 5
	 *  return buzz if n is divisible by 5 but not 3
	 *  return fizzbuzz if n is divisible by 3 and 5
	 *  otherwise return i
	 */
	public static void fizzbuzz(PrintStream st, int n) {
			for( int i = 1; i < n+1; i++){
				if (i % 3 == 0 && i % 5 != 0) {
					st.append("Fizz"+",");
				}
				else if ( i % 5 == 0 && i %3 != 0) {
					st.append("Buzz"+",");
					}
				else if (i % 3 ==0 && i % 5 == 0) {
					st.append("FizzBuzz"+",");
				}
				else {
					st.append(i+",");
				}
			}
		}
	
	/*
	 * rmvAll removes all the occurrences of the character of forming the string
	 * @param sb is a string builder
	 * @param c is character to be removed fom sb
	 * @pre none
	 * @return none
	 * @post string without c 
	 */
	public static void rmvAll(StringBuilder sb, char c) {
		for (int i = 0 ; i < sb.length() ; i++) {
			if (sb.charAt(i) == c) {
				sb.deleteCharAt(i);
				i--;
			}
		}
		return; 
	}
	/*
	 * readUntil stops when it reads given str otherwise continue
	 * @param in get input from scanner
	 * @param str is string to stop the program 
	 * @param sb is a StringBuilder
	 * @pre none
	 * @return none
	 * @post none
	 */
	public static void readUntil(Scanner in,String str, StringBuilder sb) {
		while (in.hasNext() ) {
			String nxt_line = in.next();
			if (nxt_line.equals(str) ) {
				return;
			}
			else {
				sb.append(nxt_line);
			}
		}
	}

}
