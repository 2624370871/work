package com;

public class Calculator {
	private static int result;
	public void add(int n) {
		result=result+n;
	}
	public void substract(int n) {
		result=n-result;
	}
	public void multiply(int n) {
		result=result*n;
	}
	public void divide(int n) {
		result=n/result;
	}
	public void clear() {
		result=1;
	}
	public int getResult() {
		return result;
	}
}
