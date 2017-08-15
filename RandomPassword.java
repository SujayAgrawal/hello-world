package com.sujay;

import java.util.Random;

/**
 * PROBLEM STATEMENT : Inside ODC, after every 90 days, we have to change client password,
 * but there is a catch; u can create password that is exactly 8 characters long
 * and it should contain atleast one uppercase, one lowercase, one number and no special characters
 * and also u cannot use last 4 passwords
 * 
 * SOLUTION : create a utility to create password like that and store that SOMEWHERE
 * @author Sujay-PC
 *
 */
public class RandomPassword {
	
	private static final char[] symbols;
	private final Random random = new Random();
	private final char[] buffer;
	
	static {
		StringBuilder stringBuilder = new StringBuilder();
		for(char ch = 'a'; ch <= 'z'; ch++) {
			stringBuilder.append(ch);
		}
		for(char ch = '0';ch <= '9'; ch++) {
			stringBuilder.append(ch);
		}
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			stringBuilder.append(ch);
		}
		symbols = stringBuilder.toString().toCharArray();
	}

	public RandomPassword(int length) {
		buffer = new char[length];
	}

	public String getRandomPassword() {
		for(int i=0;i<buffer.length;i++) {
			buffer[i] = symbols[random.nextInt(symbols.length)];
		}
		return new String(buffer);
	}
}
