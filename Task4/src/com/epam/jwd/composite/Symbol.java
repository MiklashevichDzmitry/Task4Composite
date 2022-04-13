package com.epam.jwd.composite;

public class Symbol implements TextComponent {

	private char symbol;

	private final TextComponentType componentType;

	public Symbol(char symbol) {

		this.symbol = symbol;
		componentType = TextComponentType.SYMBOL;
	}

	@Override
	public TextComponentType getComponentType() {
		return componentType;
	}

	@Override
	public void add(TextComponent textComponent) {
		throw new UnsupportedOperationException("it's a leaf");
	}

	@Override
	public void remove(TextComponent textComponent) {
		throw new UnsupportedOperationException("it's a leaf");
	}

	@Override
	public TextComponent getChild(int id) {
		throw new UnsupportedOperationException("it's a leaf");
	}

	@Override
	public String toString() {
		return String.valueOf(symbol);
	}

}
