package com.company;

public class CWH_13_Stringmethod {

	public static void main(String[] args) {
		String name="harry";
		
		
		System.out.println(name.substring(1,4));
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim());
		System.out.println(name.substring(4));
		System.out.println(name.replace('r', 'p'));
		System.out.println(name.startsWith("har"));
		System.out.println(name.endsWith("rry"));
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf("r"));
		System.out.println(name.indexOf("r", 3));
		System.out.println(name.lastIndexOf("r"));
		System.out.println(name.lastIndexOf("r",2));
		System.out.println(name.equals("harry"));
		System.out.println(name.equalsIgnoreCase("Harry"));

	}

}
