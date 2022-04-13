package com.epam.jwd.chainofresponsibility;

import com.epam.jwd.composite.TextComponent;
import com.epam.jwd.composite.TextComponentType;
import com.epam.jwd.composite.TextComposite;

public class ParagraphParser extends AbstractTextParser {

	private static final String REGEX = "\\t";

	@Override
	public void parse(String text) {
		String[] paragraphs = text.split(REGEX);
		for (String paragraph : paragraphs) {
			TextComponent paragraphComponent = new TextComposite(TextComponentType.PARAGRAPH);
			component.add(paragraphComponent);
			SentenceParser parser = new SentenceParser();
			parser.component = paragraphComponent;
			parser.parse(paragraph);

		}
	}
}
