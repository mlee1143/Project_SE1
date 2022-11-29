package edu.westga.se1.collectiblemanager.view;

import edu.westga.se1.collectiblemanager.model.Collectible;
import edu.westga.se1.collectiblemanager.model.Condition;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CollectibleManagerCodeBehind {

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
    
    public CollectibleManagerCodeBehind() {
    	
    }
}
