package com.epam.jwd.composite;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {

	private final TextComponentType componentType;

	private List<TextComponent> components;

	public TextComposite(TextComponentType componentType) {
		this.componentType = componentType;
		components = new ArrayList<>();
	}

	@Override
	public TextComponentType getComponentType() {
		return componentType;
	}

	@Override
	public void add(TextComponent textComponent) {
		components.add(textComponent);
	}

	@Override
	public void remove(TextComponent textComponent) {
		components.remove(textComponent);
	}

	@Override
	public TextComponent getChild(int id) {
		return components.get(id);
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (TextComponent component : components) {
			stringBuilder.append(component);
			stringBuilder.append(component.getComponentType().getDelimiter());
		}
		return stringBuilder.toString();
	}

}
