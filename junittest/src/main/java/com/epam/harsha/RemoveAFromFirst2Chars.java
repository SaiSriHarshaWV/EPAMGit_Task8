package com.epam.harsha;

public class RemoveAFromFirst2Chars {
	public static Object removeA(String string) {
		String Substr=string.substring(0,2);
		Substr=Substr.replaceAll("A","");
		String g=string.substring(2);
		return Substr+g;
	}

}
