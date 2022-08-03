package desktopview.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;


public class LoginView extends View {

    Label loginLabel, userNameLabel, PasswordLabel;
    Hyperlink forgetPassword;
    TextField userNameTextField, PasswordField;
    Button loginButton;
    HBox h1, h2, h3, h4, h5, h6, h7;

    /**
     * initializing layout elements
     */
    @Override
    public void init() {
        title = "Sign In";
        loginLabel = new Label(title);
        loginLabel.setId("titleLabel");
        userNameLabel = new Label("Email");
        userNameLabel.setId("titleLabel");
        PasswordLabel = new Label("Password");
        PasswordLabel.setId("titleLabel");
        forgetPassword = new Hyperlink("forget  password?");
        forgetPassword.setId("forgetPasswordLabel");
        userNameTextField = new TextField();
        PasswordField = new PasswordField();
        loginButton = new Button("Sign In");
        h1 = new HBox(5);
        h2 = new HBox(5);
        h3 = new HBox(5);
        h4 = new HBox(0);
        h5 = new HBox(0);
        h6 = new HBox(0);
        h7 = new HBox(0);
        setSpacing(20);
    }

    /**
     * creating layout
     */
    @Override
    public void addChildren() {
        h1.getChildren().addAll(loginLabel);
        h2.getChildren().addAll(userNameLabel);
        h3.getChildren().addAll(userNameTextField);
        h4.getChildren().addAll(PasswordLabel);
        h5.getChildren().addAll(PasswordField);
        h6.getChildren().addAll(loginButton);
        h7.getChildren().addAll(forgetPassword);
        getChildren().addAll(h1, h2, h3, h4, h5, h6, h7);
    }

    /**
     * binding operations
     */
    @Override
    public void bindings() {
        userNameTextField.prefWidthProperty().bind(h3.widthProperty().multiply(0.3));
        userNameTextField.prefHeightProperty().bind(h3.heightProperty());

        PasswordField.prefWidthProperty().bind(h5.widthProperty().multiply(0.3));
        PasswordField.prefHeightProperty().bind(h5.heightProperty());

        userNameLabel.prefWidthProperty().bind(h2.widthProperty().multiply(0.15));
        userNameLabel.prefHeightProperty().bind(h2.heightProperty());
        PasswordLabel.prefWidthProperty().bind(h4.widthProperty().multiply(0.15));
        PasswordLabel.prefHeightProperty().bind(h4.heightProperty());
        loginButton.prefWidthProperty().bind(h6.widthProperty().multiply(0.3));
        loginButton.prefHeightProperty().bind(h6.heightProperty());
        forgetPassword.prefWidthProperty().bind(h7.widthProperty().multiply(0.3));
        forgetPassword.prefHeightProperty().bind(h7.heightProperty());


        loginLabel.prefHeightProperty().bind(h1.heightProperty());
        loginLabel.prefWidthProperty().bind(h1.widthProperty());


        h1.prefHeightProperty().bind(heightProperty().multiply(0.1));
        h1.prefWidthProperty().bind(widthProperty());

        h2.prefHeightProperty().bind(heightProperty().multiply(0.1));
        h2.prefWidthProperty().bind(widthProperty());

        h3.prefHeightProperty().bind(heightProperty().multiply(0.1));
        h3.prefWidthProperty().bind(widthProperty());

        h4.prefHeightProperty().bind(heightProperty().multiply(0.1));
        h4.prefWidthProperty().bind(widthProperty());

        h5.prefHeightProperty().bind(heightProperty().multiply(0.1));
        h5.prefWidthProperty().bind(widthProperty());

        h6.prefHeightProperty().bind(heightProperty().multiply(0.1));
        h6.prefWidthProperty().bind(widthProperty());

        h7.prefHeightProperty().bind(heightProperty().multiply(0.1));
        h7.prefWidthProperty().bind(widthProperty());


    }

    /**
     * displaying the window
     */
    @Override
    public void showView() {
        scene = new Scene(this, W * 0.6, H * 0.4);
        scene.getStylesheets().add(theme);
        STAGE.setScene(scene);
        STAGE.setFullScreenExitHint("press enter to use full screen");
        STAGE.setTitle(title);
        STAGE.show();
//        STAGE.setResizable(false);
    }

    /**
     * alignment of elements
     */
    @Override
    public void alignElements() {
        userNameTextField.setTooltip(new Tooltip("Email"));
        PasswordField.setTooltip(new Tooltip("Password"));
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        h6.setAlignment(Pos.CENTER);
        h7.setAlignment(Pos.CENTER);
        loginLabel.setAlignment(Pos.CENTER);
        userNameLabel.setAlignment(Pos.CENTER);
        PasswordLabel.setAlignment(Pos.CENTER);
        forgetPassword.setAlignment(Pos.CENTER);
        setAlignment(Pos.CENTER);
        loginButton.setAlignment(Pos.CENTER);
    }

    /**
     * @return forget password hyper link
     */
    public Hyperlink getForgetPasswordLabel() {
        return forgetPassword;
    }

    /**
     * @return user name field
     */
    public TextField getUserNameTextField() {
        return userNameTextField;
    }

    /**
     * @return password field
     */
    public TextField getPasswordField() {
        return PasswordField;
    }

    /**
     * @return login button
     */
    public Button getLoginButton() {
        return loginButton;
    }

}
