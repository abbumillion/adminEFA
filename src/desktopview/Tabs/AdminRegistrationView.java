package desktopview.Tabs;

import desktopview.view.SubView;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AdminRegistrationView extends SubView {

    protected Label  fullNameLabel,
            emailLabel,
            cellphoneLabel, passwordLabel, confrimpasswordLabel;
    protected TextField fnTextField, cellphoneTextField,
            emailTextField, passwordTextField, confrimpasswordTextField;
    protected Button submitButton, nextButton, resetButton;
    protected DatePicker dateofbirth;
    //
    protected HBox h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20, h21, genderHBox;
    protected VBox v1, v2, v3, v4, v5;
    private Label TitleLabel;

    @Override
    public void init() {
        title = "Admin Registration";
        TitleLabel = new Label("New Admin");
        //labels
        fullNameLabel = new Label("Full Name:");
        emailLabel = new Label("Email:");
        cellphoneLabel = new Label("Phone Number:");
        passwordLabel = new Label("Password:");
        confrimpasswordLabel = new Label("Confrim Password:");
        //buttons
        submitButton = new Button("Submit");
        resetButton = new Button("reset");
        nextButton = new Button("Next");
        //textfields
        dateofbirth = new DatePicker();
        fnTextField = new TextField();
        //
        emailTextField = new TextField();
        cellphoneTextField = new TextField();
        passwordTextField = new PasswordField();
        confrimpasswordTextField = new PasswordField();
        //
        h1 = new HBox(10);
        h2 = new HBox(10);
        h3 = new HBox(10);
        h4 = new HBox(10);
        h5 = new HBox(10);
        //
        h6 = new HBox(10);
        h7 = new HBox(10);
        h8 = new HBox(10);
        h9 = new HBox(10);
        h10 = new HBox(10);
        h11 = new HBox(10);
        //
        h11 = new HBox(10);
        h12 = new HBox(10);
        h13 = new HBox(10);
        h14 = new HBox(10);
        h15 = new HBox(10);
        //
        h16 = new HBox(10);
        h17 = new HBox(10);
        h18 = new HBox(10);
        h19 = new HBox(10);
        h20 = new HBox(10);
        h21 = new HBox(10);
        //
        v1 = new VBox(10);
        v2 = new VBox(10);
        v3 = new VBox(10);
        v4 = new VBox(10);
        v5 = new VBox(10);
        genderHBox = new HBox(15);
        //
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        h6.setAlignment(Pos.CENTER);
        h7.setAlignment(Pos.CENTER);
        h8.setAlignment(Pos.CENTER);
        h9.setAlignment(Pos.CENTER);
        h10.setAlignment(Pos.CENTER);
        h11.setAlignment(Pos.CENTER);
        h12.setAlignment(Pos.CENTER);
        h13.setAlignment(Pos.CENTER);
        h14.setAlignment(Pos.CENTER);
        h15.setAlignment(Pos.CENTER);
        h16.setAlignment(Pos.CENTER);
        h17.setAlignment(Pos.CENTER);
        h18.setAlignment(Pos.CENTER);
        h19.setAlignment(Pos.CENTER);
        h20.setAlignment(Pos.CENTER);
        h21.setAlignment(Pos.BASELINE_CENTER);
        v1.setAlignment(Pos.CENTER_LEFT);
        v2.setAlignment(Pos.CENTER);
        v3.setAlignment(Pos.CENTER_RIGHT);
    }

    @Override
    public void addChildren() {
        h1.getChildren().addAll(TitleLabel);

        h3.getChildren().addAll(fullNameLabel, fnTextField);
        h7.getChildren().addAll(cellphoneLabel, cellphoneTextField);
        h8.getChildren().addAll(emailLabel, emailTextField);
        h11.getChildren().addAll(resetButton, submitButton, closeButton);
        v1.getChildren().addAll(h2, h3, h4, h5, h6, h7, h8, h9, h10, h11);
        getChildren().addAll(h1, v1);

    }

    @Override
    public void bindings() {
        fullNameLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.2));
        fnTextField.prefWidthProperty().bind(h3.widthProperty().multiply(0.4));
        dateofbirth.prefWidthProperty().bind(h5.widthProperty().multiply(0.4));
        cellphoneLabel.prefWidthProperty().bind(h7.widthProperty().multiply(0.2));
        cellphoneTextField.prefWidthProperty().bind(h7.widthProperty().multiply(0.4));
        emailLabel.prefWidthProperty().bind(h8.widthProperty().multiply(0.2));
        emailTextField.prefWidthProperty().bind(h8.widthProperty().multiply(0.4));
        h1.prefWidthProperty().bind(widthProperty());
        h2.prefWidthProperty().bind(v1.widthProperty());
        h3.prefWidthProperty().bind(v1.widthProperty());
        h4.prefWidthProperty().bind(v1.widthProperty());
        h5.prefWidthProperty().bind(v1.widthProperty());
        h6.prefWidthProperty().bind(v1.widthProperty());
        h7.prefWidthProperty().bind(v1.widthProperty());
        h8.prefWidthProperty().bind(v1.widthProperty());
        h9.prefWidthProperty().bind(v1.widthProperty());
        h10.prefWidthProperty().bind(v1.widthProperty());
        h11.prefWidthProperty().bind(v1.widthProperty());
        v1.prefWidthProperty().bind(h19.widthProperty());
        v1.prefHeightProperty().bind(heightProperty().multiply(0.7));
    }

    @Override
    public void alignElements() {
        fullNameLabel.setAlignment(Pos.CENTER_LEFT);
        emailLabel.setAlignment(Pos.CENTER_LEFT);
        cellphoneLabel.setAlignment(Pos.CENTER_LEFT);
        passwordLabel.setAlignment(Pos.CENTER_LEFT);
        confrimpasswordLabel.setAlignment(Pos.CENTER_LEFT);
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        h6.setAlignment(Pos.CENTER);
        h7.setAlignment(Pos.CENTER);
        h8.setAlignment(Pos.CENTER);
        h9.setAlignment(Pos.CENTER);
        h10.setAlignment(Pos.CENTER);
        h11.setAlignment(Pos.CENTER);
        v1.setSpacing(10);
    }
}
