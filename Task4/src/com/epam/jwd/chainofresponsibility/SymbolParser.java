package com.epam.jwd.chainofresponsibility;

import com.epam.jwd.composite.Symbol;

public class SymbolParser extends AbstractTextParser {

	@Override
	public void parse(String text) {
		for (char a : text.toCharArray()) {
			Symbol symbol = new Symbol(a);
			component.add(symbol);
		}
	}

}
