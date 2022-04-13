package com.epam.jwd.chainofresponsibility;

import com.epam.jwd.composite.TextComponent;
import com.epam.jwd.composite.TextComponentType;
import com.epam.jwd.composite.TextComposite;

public class LexemeParser extends AbstractTextParser {

	private static final String REGEX = "\\s";

	@Override
	public void parse(String text) {
		String[] lexemes = text.split(REGEX);
		for (String lexeme : lexemes) {
			TextComponent lexemeComponent = new TextComposite(TextComponentType.LEXEME);
			component.add(lexemeComponent);
			SymbolParser parser = new SymbolParser();
			parser.component = lexemeComponent;
			parser.parse(lexeme);

		}
	}
}
