package edu.westga.se1.collectiblemanager.viewmodel;

import java.util.ArrayList;
import java.util.List;

import edu.westga.se1.collectiblemanager.model.Group;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

public class GroupViewModel {

	private ListProperty<Group> groupsListProperty;
	private ObjectProperty<Group> selectedProperty;
	private StringProperty nameProperty;

	private List<Group> groupsList;

	public GroupViewModel() {
		this.groupsList = new ArrayList<Group>();
		this.groupsListProperty = new SimpleListProperty<Group>(FXCollections.observableArrayList(this.groupsList));
		this.nameProperty = new SimpleStringProperty();
		this.selectedProperty = new SimpleObjectProperty<Group>();
	}

	public ListProperty<Group> groupsListProperty() {
		return this.groupsListProperty;
	}

	public ObjectProperty<Group> selectedProperty() {
		return this.selectedProperty;
	}

	public StringProperty nameProperty() {
		return this.nameProperty;
	}

	public boolean addGroup() {
		String name = this.nameProperty.get();

		var newGroup = new Group(name);

		if (this.groupsListProperty.add(newGroup)) {
			this.groupsList.add(newGroup);
			return true;
		}
		return false;
	}

	public boolean removeGroup() {
		Group group = this.selectedProperty.get();

		if (this.groupsListProperty.remove(group)) {
			this.groupsList.remove(group);
			this.reset();
			return true;
		}
		return false;
	}
	
	private void reset() {
		this.groupsListProperty.set(FXCollections.observableArrayList(this.groupsList));
		this.selectedProperty.set(null);
	}
}

