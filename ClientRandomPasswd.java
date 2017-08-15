package com.sujay;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;

public class ClientRandomPasswd {

	public static void main(String[] args) {

		RandomPassword password = new RandomPassword(8);
		String passwd = password.getRandomPassword();
		boolean hasUpperCase = passwd.contains(passwd.toUpperCase());
		boolean hasLowerCase = passwd.contains(passwd.toLowerCase());
		while((!passwd.matches(".*\\d+.*")) && (!hasUpperCase) && (!hasLowerCase)) {
			passwd = password.getRandomPassword();
		}
		String name = System.getProperty("user.name");
		try {
			String path = "C:/Users/"+name+"/Documents/Fdx_passwd.txt";
			PrintWriter printWriter = new PrintWriter(path, "UTF-8");
			printWriter.print("Your passwd created @ "+new Date()+"--> "+passwd);
			System.out.println("Please find your password in file located at " + path);
			printWriter.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
