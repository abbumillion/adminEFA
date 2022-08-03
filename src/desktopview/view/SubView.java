package desktopview.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public abstract class SubView extends VBox implements Viewable {

    protected Label description, titleLabel;
    protected Button resetButton, submitButton, closeButton;
    protected String title, theme;

    Stage popup;

    public SubView() {
        title = "window title";
        resetButton = new Button("Reset");
        submitButton = new Button("Submit");
        closeButton = new Button("Close");
        titleLabel = new Label(title);
        setAlignment(Pos.CENTER);
        setSpacing(10);
    }

    public void getReady() {
        init();
        addChildren();
        bindings();
        alignElements();
    }

    public void showView() {
        popup = new Stage();
        Scene scene = new Scene(this, W * 0.5, H * 0.8);
        scene.getStylesheets().add(theme);
        popup.setScene(scene);
        popup.initStyle(StageStyle.UNDECORATED);
        popup.setFullScreenExitHint("");
        popup.setTitle(title);
        popup.show();
    }

    public void close() {
        popup.close();
    }

    public Label getDescription() {
        return description;
    }

    public Button getResetButton() {
        return resetButton;
    }

    public Button getSubmitButton() {
        return submitButton;
    }

    public Button getCloseButton() {
        return closeButton;
    }

}
