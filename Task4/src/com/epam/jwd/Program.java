package com.epam.jwd;

import com.epam.jwd.chainofresponsibility.TextParser;

public class Program {

	public static void main(String[] args) {

		TextParser textParser = new TextParser();
		textParser.parse("\tzz, rr! qq; vv? uu; ii?\taa, bb. cc: dd.\tzz, rr! qq; vv? uu; ii?\tzz, rr! qq; vv? uu; ii?"
				+ "\tzz, rr! qq; vv? uu; ii?\tzzzzz, rr! qq; vv? uu; ii?\tzz, rr! qq; vv? uu; ii? zz, rr! zz, rr!");

		System.out.println(textParser.getComponent().toString());
	}

}
