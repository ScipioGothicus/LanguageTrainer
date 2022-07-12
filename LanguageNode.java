package com.scipiogothicus.LanguageTrainer;

public class LanguageNode {

	private String word;
	private String pronunciation;
	private String definition;
	
	public LanguageNode(String word, String pronunciation, String definition) {
		this.word = word;
		this.pronunciation = pronunciation;
		this.definition = definition;
	}
	
	public LanguageNode(String word, String pronunciation) {
		this.word = word;
		this.pronunciation = pronunciation;
	}
	
	
	public String getWord() {
		return word;
	}
	
	public String getPronunciation() {
		return pronunciation;
	}
	
	public String getDefinition() {
		return definition;
	}
	
	public void setWord(String newWord) {
		this.word = newWord;
	}
	
	public void setPronunciation(String newPronunciation) {
		this.pronunciation = newPronunciation;
	}
	
	public void setDefinition(String newDefinition) {
		this.definition = newDefinition;
	}
	
	public boolean hasDefinition() {
		return definition != null;
	}
	
	@Override
	public String toString() {
	
		return "\nWord: " + this.word + 
				"\nPronunciation in foreign language: " + this.pronunciation +
				"\nDefinition: " + this.definition + "\n";
	
	}
	
}
