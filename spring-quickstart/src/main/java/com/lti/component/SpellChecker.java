package com.lti.component;

import org.springframework.stereotype.Component;

@Component	
public class SpellChecker implements SpellCheck{
	public void checkSpellingMistakes(String document) {
		System.out.println("Spell Checker called for " +document);
	}
}
