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
	    int correct = 0;
	    int total = 0;
	    
	    while(running) {
		    seed = rand.nextInt(0, languageList.size());
		    LanguageNode currentNode = languageList.get(seed);
		    
		    System.out.println("What is this word?: " + currentNode.getWord());
		    String inputPronun = scan.nextLine();
		    
		    
		    if(inputPronun.equals(currentNode.getPronunciation())) {
		    	System.out.println("Correct!");
		    	correct++;
		    }
		    else {
		    	System.out.println("Incorrect.\nThe correct Japanese word is " + currentNode.getPronunciation());
		    	
		    }
		    total++;
		    System.out.println("Current grade: " + (correct*100)/total + "%");
		    
		
	    }
		
		scan.close();
	}
}
