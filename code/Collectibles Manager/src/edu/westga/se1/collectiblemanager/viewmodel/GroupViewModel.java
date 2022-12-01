package edu.westga.se1.collectiblemanager.viewmodel;

import java.util.ArrayList;
import java.util.List;

import edu.westga.se1.collectiblemanager.model.Group;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;

public class GroupViewModel {

	private ListProperty<Group> groupsListProperty;
	private ObjectProperty<Group> selectedProperty;

	private List<Group> groupsList;

	public GroupViewModel() {
		this.groupsList = new ArrayList<Group>();
		this.groupsListProperty = new SimpleListProperty<Group>(FXCollections.observableArrayList(this.groupsList));
	}

	public ListProperty<Group> groupsListProperty() {
		return this.groupsListProperty;
	}

	public ObjectProperty<Group> selectedProperty() {
		return this.selectedProperty;
	}
}
