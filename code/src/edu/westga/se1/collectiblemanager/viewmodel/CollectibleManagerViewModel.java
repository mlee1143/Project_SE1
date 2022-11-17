package edu.westga.se1.collectiblemanager.viewmodel;

import edu.westga.se1.collectiblemanager.model.Collectible;
import edu.westga.se1.collectiblemanager.model.CollectibleManager;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CollectibleManagerViewModel {
	
	private StringProperty nameProperty;
	private StringProperty yearProperty;
	private StringProperty priceProperty;
	private StringProperty descriptionProperty;
	private ListProperty<Collectible> collectionProperty;
	private ObjectProperty<Collectible> selectedProperty;
	
	private CollectibleManager collectibleManager;
	
	public CollectibleManagerViewModel() {
		this.nameProperty = new SimpleStringProperty();
		this.yearProperty = new SimpleStringProperty();
		this.priceProperty = new SimpleStringProperty();
		this.descriptionProperty = new SimpleStringProperty();
		this.selectedProperty = new SimpleObjectProperty<Collectible>();
		
		this.collectibleManager = new CollectibleManager();
		
	}
	
	public StringProperty nameProperty() {
		return this.nameProperty;
	}
	
	public StringProperty yearProperty() {
		return this.yearProperty;
	}
	
	public StringProperty priceProperty() {
		return this.priceProperty;
	}
	
	public StringProperty descriptionProperty() {
		return this.descriptionProperty;
	}
	
	public ListProperty<Collectible> listProperty() {
		return this.collectionProperty;
	}
	
	public ObjectProperty<Collectible> selectedProperty(){
		return this.selectedProperty;
	}
	
	public CollectibleManager getCollectibleManager() {
		return this.collectibleManager;
	}
	
	public boolean addCollectible() {
		String name = this.nameProperty.get();
		int year = Integer.parseInt(this.yearProperty.get());
		int price = Integer.parseInt(this.priceProperty.get());
		String description = this.descriptionProperty.get();
		
		return false;
		
	}
	
	public boolean removeCollectible() {
		return false;
	}
}
