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
		this.collectionFile = new File("Collectibles.txt");
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
		Condition condition = Condition.BRAND_NEW;
		
		Collectible collectible = new Collectible(name, year, price, description, condition);
		
		return collectible;
	}
}
