package com.epam.jwd.composite;

public enum TextComponentType {
	TEXT(""), PARAGRAPH("\n\t"), SENTENCE(""), LEXEME(" "), SYMBOL("");

	private final String delimiter;

	TextComponentType(String s) {
		delimiter = s;
	}

	public String getDelimiter() {
		return delimiter;
	}
}
