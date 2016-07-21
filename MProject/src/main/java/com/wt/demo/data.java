package com.wt.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class data {
	
	
	
	
	public static void main(String[] args) {
		SimpleDateFormat s =new SimpleDateFormat("yyyy MM dd");
		Date date =new Date();
		System.out.println(s.format(date));
	}
}
