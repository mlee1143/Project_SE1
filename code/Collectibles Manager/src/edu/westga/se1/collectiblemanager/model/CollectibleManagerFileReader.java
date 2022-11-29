package edu.westga.se1.collectiblemanager.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectibleManagerFileReader {
	private File collectionFile;

	public CollectibleManagerFileReader() {
		this.collectionFile = new File("INSERT FILE PATH HERE");//TODO Insert the file path
	}
	
	public List<Collectible> loadCollectionFromFile() throws FileNotFoundException{
		List<Collectible> collection = new ArrayList<Collectible>();
		
		try (Scanner scanner = new Scanner(this.collectionFile)){
			String data = "";
			int lineNumber = 0;
			while (scanner.hasNextLine()) {
				lineNumber++;
				
				String nextLine = scanner.nextLine();
			}
		}
		
		return collection;
	}
}
