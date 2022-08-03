package desktopview.Tabs;

import desktopview.helpers.ROLE;
import desktopview.view.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 */
public class AdminsTab extends SubView {

    /**
     *
     */
    TextField fullNameTF, emailTF, phoneNumberTF;
    ComboBox roleCB, isActiveRB;
    ListView adminsListView;
    HBox hBox,hBox1;
    VBox vBox;
    /**
     *
     */
    @Override
    public void init() {
        vBox = new VBox(20);
        hBox = new HBox(0);
        hBox1 = new HBox(20);
        adminsListView = new ListView();
        fullNameTF = new TextField();
        emailTF = new TextField();
        phoneNumberTF = new TextField();
        roleCB = new ComboBox();
        roleCB.getItems().addAll(ROLE.values());
        isActiveRB = new ComboBox();
        isActiveRB.getItems().addAll("True", "False");
    }
    /**
     *
     */
    @Override
    public void addChildren() {
        hBox1.getChildren().addAll(submitButton,resetButton,closeButton);
        vBox.getChildren().addAll(fullNameTF, emailTF, phoneNumberTF, roleCB, isActiveRB,hBox1);
        hBox.getChildren().addAll(adminsListView, vBox);
        getChildren().addAll(hBox);
    }

    /**
     *
     */
    @Override
    public void bindings() {
        adminsListView.prefHeightProperty().bind(hBox.heightProperty());
        adminsListView.prefWidthProperty().bind(hBox.widthProperty().multiply(0.7));
        vBox.prefHeightProperty().bind(hBox.heightProperty());
        vBox.prefWidthProperty().bind(hBox.widthProperty().multiply(0.3));
        hBox.prefHeightProperty().bind(heightProperty());
        hBox.prefWidthProperty().bind(widthProperty());
        hBox1.prefHeightProperty().bind(vBox.heightProperty().multiply(0.2));
        hBox1.prefWidthProperty().bind(vBox.widthProperty());
        roleCB.prefWidthProperty().bind(vBox.widthProperty().multiply(0.5));
        isActiveRB.prefWidthProperty().bind(vBox.widthProperty().multiply(0.5));
    }

    /**
     *
     */
    @Override
    public void alignElements() {

        vBox.setAlignment(Pos.CENTER);
        hBox1.setAlignment(Pos.CENTER);
    }

    /**
     * @return admins list view
     */
    public ListView getAdminsListView() {
        return adminsListView;
    }

    public TextField getFullNameTF() {
        return fullNameTF;
    }

    public TextField getEmailTF() {
        return emailTF;
    }

    public TextField getPhoneNumberTF() {
        return phoneNumberTF;
    }

    public ComboBox getRoleCB() {
        return roleCB;
    }

    public ComboBox getIsActiveRB() {
        return isActiveRB;
    }
}
