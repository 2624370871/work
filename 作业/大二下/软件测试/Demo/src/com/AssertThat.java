package com;

public class AssertThat {
	private static int result;
	public void add(int m, int n) {
	    result = m + n;
	}
	public void clear() {
	    result = 0;
	}
	public int getResult() {
	    return result;
	}
}  
