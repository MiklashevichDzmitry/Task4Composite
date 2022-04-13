package com.epam.jwd.composite;

public interface TextComponent {

	public TextComponentType getComponentType();

	void add(TextComponent textComponent);

	void remove(TextComponent textComponent);

	TextComponent getChild(int id);

}
