package edu.westga.se1.collectiblemanager.view;

import edu.westga.se1.collectiblemanager.model.Collectible;
import edu.westga.se1.collectiblemanager.model.Group;
import edu.westga.se1.collectiblemanager.viewmodel.GroupViewModel;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
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
    private ListView<Collectible> listviewCollectibles;

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
		this.bindButtonDisableProperty();
	}

	private void bindToViewModel() {
		this.groupsListView.itemsProperty().bind(this.viewModel.groupsListProperty());
		this.selectedProperty.bindBidirectional(this.viewModel.selectedProperty());
		this.nameTextField.textProperty().bindBidirectional(this.viewModel.nameProperty());
		
	}
	
	
	private void bindButtonDisableProperty() {
		this.addButton.disableProperty()
		.bind(this.nameTextField.textProperty().isEmpty());
	}
	
	
	@FXML
    void onClick_AddGroup(ActionEvent event) {
		this.viewModel.addGroup();
    }

    @FXML
    void onClick_RemoveGroup(ActionEvent event) {
    	this.viewModel.removeGroup();
    	this.clearForms();
    }

    @FXML
    void onClick_ViewCollection(ActionEvent event) {

    }
    
    private void clearForms() {
    	this.nameTextField.setText("");
    }
}
