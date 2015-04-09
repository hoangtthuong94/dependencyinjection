
package com.hoanghuong.springdependencyinjection;


public class TextEditor {
    private SpellChecker spellChecker;
    
    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside spellchecker");
        this.spellChecker = spellChecker;
    }
    
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
