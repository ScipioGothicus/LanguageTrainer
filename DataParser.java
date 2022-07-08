package com.scipiogothicus.LanguageTrainer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataParser {
	
	File file;
	
	ArrayList<String> dataLines = new ArrayList<String >();
	ArrayList<LanguageNode> languageNodes = new ArrayList<LanguageNode>();
		
	public DataParser(String fileName) {
		this.file = new File(fileName);
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNext()) {
				dataLines.add(scan.nextLine());
			}
			scan.close();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printContents() {
		System.out.println(languageNodes.toString());
	}
	
	public ArrayList<LanguageNode> convertDataToNodes() {
		for(String str: dataLines) {
			
			String[] splitStr;
			
			String word;
			String pronun;
			String def;
			
			splitStr = str.split("\\s+");
			
			word = splitStr[0];
			pronun = splitStr[1];
			def = splitStr[2];

			languageNodes.add(new LanguageNode(word, pronun, def));
		}
		
		return languageNodes;
	}
	
}
