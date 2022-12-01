package edu.westga.se1.collectiblemanager.view;

import edu.westga.se1.collectiblemanager.model.Group;
import edu.westga.se1.collectiblemanager.viewmodel.GroupViewModel;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class GroupPageCodeBehind {

	@FXML
	private Button addButton;

	@FXML
	private ListView<Group> groupsListView;

	@FXML
	private TextField nameTextField;

	@FXML
	private Button removeButton;

	@FXML
	private Button viewButton;

	private ObjectProperty<Group> selectedProperty;
	private GroupViewModel viewModel;

	public GroupPageCodeBehind() {
		this.viewModel = new GroupViewModel();
		this.selectedProperty = new SimpleObjectProperty<Group>();
	}

	@FXML
	private void initialize() {
		this.bindToViewModel();
	}

	private void bindToViewModel() {

	}
}
