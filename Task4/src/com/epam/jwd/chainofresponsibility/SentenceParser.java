package com.epam.jwd.chainofresponsibility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.epam.jwd.composite.TextComponent;
import com.epam.jwd.composite.TextComponentType;
import com.epam.jwd.composite.TextComposite;

public class SentenceParser extends AbstractTextParser {

	private static final String REGEX = ".*?[.!?]\\s*";

	@Override
	public void parse(String text) {
		Pattern pattern = Pattern.compile(REGEX);
		Matcher match = pattern.matcher(text);
		while (match.find()) {
			TextComponent sentenceComponent = new TextComposite(TextComponentType.SENTENCE);
			component.add(sentenceComponent);
			LexemeParser parser = new LexemeParser();
			parser.component = sentenceComponent;
			parser.parse((match.group()).trim());

		}
	}
}
