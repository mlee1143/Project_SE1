package edu.westga.se1.collectiblemanager.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class CollectibleManagerFileWriter {
	public final String FIELD_SEPARATOR = ",";
	private File collectionFile;
	
	/**
	 * Collectible Manager File Writer
	 */
	public CollectibleManagerFileWriter() {
		this.collectionFile = new File("Collectibles.txt");
	}
	
	/**
	 * Writes to the file
	 * 
	 * @param collectibles
	 * @throws FileNotFoundException
	 */
	public void write(List<Collectible> collectibles) throws FileNotFoundException {
		if (collectibles == null) {
			throw new IllegalArgumentException("List cannot be null");
		}
		
		try (PrintWriter writer = new PrintWriter(this.collectionFile)){
			for (Collectible currentCollectible : collectibles) {
				String output = currentCollectible.getName() + this.FIELD_SEPARATOR;
				output += currentCollectible.getPrice() + this.FIELD_SEPARATOR;
				output += currentCollectible.getYear() + this.FIELD_SEPARATOR;
				output += currentCollectible.getDescritpion() + this.FIELD_SEPARATOR;
				output += currentCollectible.getCondition() + this.FIELD_SEPARATOR;
				
				writer.println(output);
			}
		}
	}
}
