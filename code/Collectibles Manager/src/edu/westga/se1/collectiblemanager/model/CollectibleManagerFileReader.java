package edu.westga.se1.collectiblemanager.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectibleManagerFileReader {
	public static final String FIELD_SEPARATOR = ",";
	private File collectionFile;

	public CollectibleManagerFileReader() {
//		if (collectionFile == null) {
//			throw new IllegalArgumentException("File cannot be null");
//		}
		this.collectionFile = new File("/Collectibles Manager/src/Collectibles.txt");
	}
	
	public List<Collectible> loadCollectionFromFile() throws FileNotFoundException{
		List<Collectible> collection = new ArrayList<Collectible>();
		
		try (Scanner scanner = new Scanner(this.collectionFile)){
			
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] values = line.split(FIELD_SEPARATOR);
				
				Collectible collectible = this.createCollectible(values);
				
				collection.add(collectible);
				
			}
		}
		
		return collection;
	}
	
	private Collectible createCollectible(String[] values) {
		String name = values[0];
		int year = Integer.parseInt(values[1]);
		double price = Double.parseDouble(values[2]);
		String description = values[3];
		Condition condition = Condition.valueOf(values[4]);
		
		Collectible collectible = new Collectible(name, price, year, description, condition);
		
		return collectible;
	}
}
