package com.scipiogothicus.LanguageTrainer;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DataParser parser = new DataParser("kanji.txt");
		boolean running = true;
		Random rand = new Random();
		
		ArrayList<LanguageNode> languageList = parser.convertDataToNodes();
		
	    Scanner scan = new Scanner(System.in);  // Create a Scanner object
	    int seed;
	    
	    while(running) {
	    	
		    seed = rand.nextInt(0, languageList.size());
		    System.out.println("What is this word?: " + languageList.get(seed).getWord());
		    String userInput = scan.nextLine();
		    System.out.println(userInput);
		
	    }
		
		scan.close();
	}
}
