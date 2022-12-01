package edu.westga.se1.collectiblemanager.view;

import edu.westga.se1.collectiblemanager.model.Collectible;
import edu.westga.se1.collectiblemanager.model.Condition;
import edu.westga.se1.collectiblemanager.viewmodel.CollectibleManagerViewModel;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CollectibleManagerCodeBehind {

	private final ObjectProperty<Collectible> selectedProperty;

	@FXML
	private Button btnAdd;

	@FXML
	private Button btnLoad;

	@FXML
	private Button btnRemove;

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
		this.selectedProperty = new SimpleObjectProperty<Collectible>();
	}

	@FXML
	private void initialize() {
		this.bindToViewModel();
		this.setupListenerToFillOutTextfields();
		this.bindButtonDisableProperty();
		// this.viewModel.loadCollection();
	}

	private void bindToViewModel() {
		this.nameTxtfld.textProperty().bindBidirectional(this.viewModel.nameProperty());
		this.priceTxtfld.textProperty().bindBidirectional(this.viewModel.priceProperty());
		this.yearTxtfld.textProperty().bindBidirectional(this.viewModel.yearProperty());
		this.descriptionTxtArea.textProperty().bindBidirectional(this.viewModel.descriptionProperty());
		this.collectibleListView.itemsProperty().bind(this.viewModel.listProperty());
		this.viewModel.conditionProperty().bind(this.cmboboxCondition.getSelectionModel().selectedItemProperty());
		this.cmboboxCondition.setItems((FXCollections.observableArrayList(Condition.values())));
		this.selectedProperty.bindBidirectional(this.viewModel.selectedProperty());
	}

	private void setupListenerToFillOutTextfields() {
		this.collectibleListView.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldvalue, newvalue) -> {
					if (newvalue != null) {
						this.nameTxtfld.textProperty().set(newvalue.getName());
						this.priceTxtfld.textProperty().set(Double.toString(newvalue.getPrice()));
						this.yearTxtfld.textProperty().set(Integer.toString(newvalue.getYear()));
						this.descriptionTxtArea.textProperty().set(newvalue.getDescritpion());
						this.cmboboxCondition.setValue(newvalue.getCondition());
						this.selectedProperty.set(newvalue);
					}
				});
	}

	private void bindButtonDisableProperty() {
		this.btnAdd.disableProperty()
				.bind(this.nameTxtfld.textProperty().isEmpty()
						.or(this.priceTxtfld.textProperty().isEmpty()
								.or(this.yearTxtfld.textProperty().isEmpty().or(this.descriptionTxtArea.textProperty()
										.isEmpty().or(this.cmboboxCondition.valueProperty().isNull())))));

		this.btnRemove.disableProperty().bind(this.selectedProperty.isNull());
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
		this.clearForms();
	}

	@FXML
	void handleRemoveCollectible(ActionEvent event) {
		this.viewModel.removeCollectible();
		this.clearForms();
	}

	@FXML
	void handleLoadCollection(ActionEvent event) {
		this.viewModel.loadCollection();
	}
}
