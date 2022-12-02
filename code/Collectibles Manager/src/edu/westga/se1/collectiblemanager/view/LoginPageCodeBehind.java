package edu.westga.se1.collectiblemanager.view;

import edu.westga.se1.collectiblemanager.viewmodel.LoginPageViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginPageCodeBehind {

	@FXML
    private Label errorMessageLabel;

    @FXML
    private Button loginBtn;

    @FXML
    private TextField passwordTxtfld;

    @FXML
    private TextField usernameTxtfld;
    
    private LoginPageViewModel viewModel;
    
    public LoginPageCodeBehind() {
    	this.viewModel = new LoginPageViewModel();
    }
    
    @FXML
    private void initialize() {
    	this.bindToViewModel();
    }
    
    private void bindToViewModel() {
    	this.usernameTxtfld.textProperty().bindBidirectional(this.viewModel.usernameProperty());
    	this.passwordTxtfld.textProperty().bindBidirectional(this.viewModel.passwordProperty());
    }
}
