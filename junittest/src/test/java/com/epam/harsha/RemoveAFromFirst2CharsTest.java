package com.epam.harsha;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class RemoveAFromFirst2CharsTest {

	/*
	 *  1. A in first position: ABCD => BCD
	 *  2. A in second position: BACD => BCD
	 *  3. A in both first two positions: AACD => CD
	 *  4. A not present in first two positions: BBAA => BBAA
	 *  5. A present in multiple positions: AABAA => BAA
	 */ 
	
	@Test
	void test1() {
		
		RemoveAFromFirst2Chars removeAFromFirst2Chars=new RemoveAFromFirst2Chars();
		assertEquals("BCD",RemoveAFromFirst2Chars.removeA("ABCD"));
	}
	
	@Test
	void test2() {
		RemoveAFromFirst2Chars removeAFromFirst2Chars=new RemoveAFromFirst2Chars();
		assertEquals("BCD",RemoveAFromFirst2Chars.removeA("BACD"));
	}
	
	@Test
	void test3() {
		RemoveAFromFirst2Chars removeAFromFirst2Chars=new RemoveAFromFirst2Chars();
		assertEquals("CD",RemoveAFromFirst2Chars.removeA("AACD"));
	}
	
	@Test
	void test4() {
		RemoveAFromFirst2Chars removeAFromFirst2Chars=new RemoveAFromFirst2Chars();
		assertEquals("BBAA",RemoveAFromFirst2Chars.removeA("BBAA"));
	}
	 
	@Test
	void test5() {
		RemoveAFromFirst2Chars removeAFromFirst2Chars=new RemoveAFromFirst2Chars();
		assertEquals("BAA",RemoveAFromFirst2Chars.removeA("AABAA"));
	}
}
