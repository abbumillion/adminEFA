package desktopview.Tabs.Listviews;

import desktopview.dto.AdminDTO;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

public class AdminCell extends ListCell {

    @Override
    protected void updateItem(Object item, boolean empty) {
        super.updateItem(item, empty);
        Label fullNameLabel, phoneNumberLabel, emailLabel, roleLabel, isActive;
        HBox h1;
        //--------------------------------------------------------------------//
        fullNameLabel = new Label("full name");
        phoneNumberLabel = new Label("Cell Phone");
        emailLabel = new Label("Email");
        roleLabel = new Label("role");
        isActive = new Label("is active");
        h1 = new HBox(10);
        h1.getChildren().addAll(fullNameLabel, phoneNumberLabel, emailLabel, roleLabel, isActive);
        fullNameLabel.setAlignment(Pos.CENTER_LEFT);
        phoneNumberLabel.setAlignment(Pos.CENTER_LEFT);
        emailLabel.setAlignment(Pos.CENTER_LEFT);
        roleLabel.setAlignment(Pos.CENTER_LEFT);
        isActive.setAlignment(Pos.CENTER_LEFT);
        h1.prefWidthProperty().bind(widthProperty());
        fullNameLabel.prefWidthProperty().bind(h1.widthProperty().multiply(0.1));
        phoneNumberLabel.prefWidthProperty().bind(h1.widthProperty().multiply(0.05));
        emailLabel.prefWidthProperty().bind(h1.widthProperty().multiply(0.1));
        roleLabel.prefWidthProperty().bind(h1.widthProperty().multiply(0.05));
        isActive.prefWidthProperty().bind(h1.widthProperty().multiply(0.05));
        if (item != null) {
           AdminDTO ap = (AdminDTO) item;
           fullNameLabel.setText(ap.getSignUpDTO().getFullName() );
           phoneNumberLabel.setText(ap.getSignUpDTO().getPhoneNumber());
           emailLabel.setText(ap.getSignUpDTO().getEmail());
           roleLabel.setText(ap.getSignUpDTO().getRole());
            isActive.setText(ap.getSignUpDTO().isActive()+"");
        }
        setGraphic(h1);
    }

}
