package com.unipi.clips;

public class LexemeValue extends PrimitiveValue {
	protected LexemeValue(String value) {
		super(value);
	}
	
	public String lexemeValue() {
		return (String) getValue();
	}
}
