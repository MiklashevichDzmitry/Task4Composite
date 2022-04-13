package com.epam.jwd.chainofresponsibility;

import com.epam.jwd.composite.TextComponent;
import com.epam.jwd.composite.TextComponentType;
import com.epam.jwd.composite.TextComposite;

public class TextParser {

	private TextComponent component;

	public TextComponent getComponent() {
		return component;
	}

	public void parse(String text) {
		ParagraphParser parser = new ParagraphParser();
		parser.component = new TextComposite(TextComponentType.TEXT);
		component = parser.component;
		parser.parse(text);
	}
}
