package fizzbuzz;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;


public class Fizzbuzz_Test {
	@Test
	void testSumTo() {
		assertEquals(0,FizzBuzz.sumTo(0));
		assertEquals(1,FizzBuzz.sumTo(1));
		assertEquals(3,FizzBuzz.sumTo(2));
		assertEquals(210,FizzBuzz.sumTo(20));
	}

	@Test
	void testFizzbuzz() {
		ByteArrayOutputStream actual =new ByteArrayOutputStream() ;
		
		FizzBuzz.fizzbuzz(new PrintStream(actual), 1);
		
		assertEquals("1,",actual.toString());
		
		actual = new ByteArrayOutputStream();
		FizzBuzz.fizzbuzz(new PrintStream(actual), 3);
		assertEquals("1,2,Fizz,",actual.toString());
		
		actual = new ByteArrayOutputStream();
		FizzBuzz.fizzbuzz(new PrintStream(actual), 5);
		assertEquals("1,2,Fizz,4,Buzz,",actual.toString());
		
		actual = new ByteArrayOutputStream();
		FizzBuzz.fizzbuzz(new PrintStream(actual), 15);
		assertEquals("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,",
				actual.toString());
		
	}

	@Test
	void testRmvAll() {
		StringBuilder actual;
		
		actual = new StringBuilder("");
		FizzBuzz.rmvAll(actual, 'a');
		assertEquals("",actual.toString());
		
		actual = new StringBuilder("hello");
		FizzBuzz.rmvAll(actual, 'a');
		assertEquals("hello",actual.toString());
		
		actual = new StringBuilder("eclipse");
		FizzBuzz.rmvAll(actual, 'e');
		assertEquals("clips",actual.toString());
		
		actual = new StringBuilder("a");
		FizzBuzz.rmvAll(actual, 'a');
		assertEquals("",actual.toString());
	}

	@Test
	void testReadUntil() {
		StringBuilder actual;
		
		actual = new StringBuilder("");
		FizzBuzz.readUntil(new Scanner(""),"he", actual);
		assertEquals("",actual.toString());
		
		actual = new StringBuilder("");
		FizzBuzz.readUntil(new Scanner("here goes the charm"),"the", actual);
		assertEquals("heregoes",actual.toString());
	}

}
