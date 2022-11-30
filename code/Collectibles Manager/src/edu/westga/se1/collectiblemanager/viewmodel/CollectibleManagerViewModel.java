package edu.westga.se1.collectiblemanager.viewmodel;

import edu.westga.se1.collectiblemanager.model.Collectible;
import edu.westga.se1.collectiblemanager.model.CollectibleManager;
import edu.westga.se1.collectiblemanager.model.Collection;
import edu.westga.se1.collectiblemanager.model.Condition;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

public class CollectibleManagerViewModel {
	
	private StringProperty nameProperty;
	private StringProperty yearProperty;
	private StringProperty priceProperty;
	private StringProperty descriptionProperty;
	private ListProperty<Collectible> collectionProperty;
	private ObjectProperty<Collectible> selectedProperty;
	private ObjectProperty<Condition> conditionProperty;
	
	private CollectibleManager collectibleManager;
	private Collection anCollection;
	
	public CollectibleManagerViewModel() {
		this.nameProperty = new SimpleStringProperty();
		this.yearProperty = new SimpleStringProperty();
		this.priceProperty = new SimpleStringProperty();
		this.descriptionProperty = new SimpleStringProperty();
		this.selectedProperty = new SimpleObjectProperty<Collectible>();
		this.conditionProperty = new SimpleObjectProperty<Condition>();
		
		this.collectibleManager = new CollectibleManager();
		this.anCollection = new Collection();
		this.collectionProperty = new SimpleListProperty<Collectible>(FXCollections.observableArrayList(this.anCollection.get()));
		
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
	
	public ObjectProperty<Condition> conditionProperty(){
		return this.conditionProperty;
	}
	
	public CollectibleManager getCollectibleManager() {
		return this.collectibleManager;
	}
	
	public boolean addCollectible() {
		String name = this.nameProperty.get();
		int year = Integer.parseInt(this.yearProperty.get());
		double price = Double.parseDouble(this.priceProperty.get());
		String description = this.descriptionProperty.get();
		Condition condition = this.conditionProperty.get();
		
		var newCollectible = new Collectible(name, year, price, description, condition);
		
		if(this.collectionProperty.add(newCollectible)) {
			//this.anCollection.add(newCollectible);
			return true;
		}
		
		return false;
	}
	
	public boolean removeCollectible() {
		return false;
	}
}
