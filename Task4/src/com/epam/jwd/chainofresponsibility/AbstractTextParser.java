package com.epam.jwd.chainofresponsibility;

import com.epam.jwd.composite.TextComponent;

public abstract class AbstractTextParser {

	protected TextComponent component;

	public abstract void parse(String text);

	public TextComponent getComponent() {
		return component;
	}
}
