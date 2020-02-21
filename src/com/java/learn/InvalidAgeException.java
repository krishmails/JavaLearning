package com.java.learn;

public class InvalidAgeException extends Exception {

	
	String errorMsg;
	
public InvalidAgeException(String ErrorMsg) {
	this.errorMsg=ErrorMsg;


	}
public String toString() {
	return errorMsg;
}

}
