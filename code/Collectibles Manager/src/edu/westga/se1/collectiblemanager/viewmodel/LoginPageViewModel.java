package edu.westga.se1.collectiblemanager.viewmodel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginPageViewModel {
	
	private StringProperty usernameProperty;
	private StringProperty passwordProperty;
	
	public LoginPageViewModel() {
		this.usernameProperty = new SimpleStringProperty();
		this.passwordProperty = new SimpleStringProperty();
	}
	
	public StringProperty usernameProperty() {
		return this.usernameProperty;
	}
	
	public StringProperty passwordProperty() {
		return this.passwordProperty;
	}

	
}
