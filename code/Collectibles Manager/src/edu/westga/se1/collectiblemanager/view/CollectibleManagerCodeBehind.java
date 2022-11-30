package edu.westga.se1.collectiblemanager.view;

import edu.westga.se1.collectiblemanager.model.Collectible;
import edu.westga.se1.collectiblemanager.model.Condition;
import edu.westga.se1.collectiblemanager.viewmodel.CollectibleManagerViewModel;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CollectibleManagerCodeBehind {

	 @FXML
	 private ComboBox<Condition> cmboboxCondition;
	
	@FXML
    private ListView<Collectible> collectibleListView;

    @FXML
    private ChoiceBox<Condition> conditionChoiceBox;

    @FXML
    private TextArea descriptionTxtArea;

    @FXML
    private TextField nameTxtfld;

    @FXML
    private TextField priceTxtfld;

    @FXML
    private TextField yearTxtfld;
    
    @FXML
    private Label lblError;
    
    private CollectibleManagerViewModel viewModel;
    
    public CollectibleManagerCodeBehind() {
    	this.viewModel = new CollectibleManagerViewModel();
    	
    }
    
    @FXML
    private void initialize() {
    	this.bindToViewModel();
    }
    
    private void bindToViewModel() {
    	this.nameTxtfld.textProperty().bindBidirectional(this.viewModel.nameProperty());
    	this.priceTxtfld.textProperty().bindBidirectional(this.viewModel.priceProperty());
    	this.yearTxtfld.textProperty().bindBidirectional(this.viewModel.yearProperty());
    	this.descriptionTxtArea.textProperty().bindBidirectional(this.viewModel.descriptionProperty());
    	this.collectibleListView.itemsProperty().bind(this.viewModel.listProperty());
    	this.viewModel.conditionProperty().bind(cmboboxCondition.getSelectionModel().selectedItemProperty());
    	this.cmboboxCondition.setItems((FXCollections.observableArrayList(Condition.values())));
    }
    
    private void clearForms() {
    	this.cmboboxCondition.getSelectionModel().clearSelection();
    	this.nameTxtfld.setText("");
    	this.yearTxtfld.setText("");
    	this.descriptionTxtArea.setText("");
    	this.priceTxtfld.setText("");
    }
    
    @FXML
    public void handleAddCollectible(ActionEvent event) {
    	this.viewModel.addCollectible();
    }
}
