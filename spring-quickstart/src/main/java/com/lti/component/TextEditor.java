package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TextEditor implements TextEdit {
	
@Autowired								//Dependency Injection here i.e. declaring the variable, not initializing it.
//@Qualifier("sp")
private SpellCheck spellch;
	
public void loadTextDocument(String document) {
		
		System.out.println("Load text document called for "+document);
		//SpellCheck sc=new SpellChecker();
		spellch.checkSpellingMistakes(document);
		
	}
}
