package edu.westga.se1.collectiblemanager.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class CollectibleManagerFileWriter {
	private static final String FIELD_SEPARATOR = ",";
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

		try (PrintWriter writer = new PrintWriter(this.collectionFile)) {
			for (Collectible currentCollectible : collectibles) {
				String output = currentCollectible.getName() + FIELD_SEPARATOR;
				output += currentCollectible.getPrice() + FIELD_SEPARATOR;
				output += currentCollectible.getYear() + FIELD_SEPARATOR;
				output += currentCollectible.getDescription() + FIELD_SEPARATOR;
				output += currentCollectible.getCondition() + FIELD_SEPARATOR;

				writer.println(output);
			}
		}
	}
}
