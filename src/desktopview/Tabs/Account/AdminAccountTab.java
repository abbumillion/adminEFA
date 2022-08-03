package desktopview.Tabs.Account;

import desktopview.view.SubView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AdminAccountTab extends SubView {

    Label firstnameLabel, lastnameLabel,
            emailLabel, dateofbirthLabel,
            genderLabel;
    Label AdminLevelLabel;
    //labels
    Label CellPhoneLabel, UserNameLabel, UserIdLabel, AddressLabel;
    //containers
    ImageView accountImageView;
    //
    Separator separator1, separator2, separator3, separator4, separator5, separator6, separator7;
    Button logoutButton;

    HBox h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11;
    VBox v1, v2, v3, v4, v5;

    @Override
    public void init() {
        AdminLevelLabel = new Label("Admin Level");
        h1 = new HBox(20);
        h2 = new HBox(20);
        h3 = new HBox(20);
        h4 = new HBox(20);
        h5 = new HBox(20);
        h6 = new HBox(20);
        h7 = new HBox(20);
        h8 = new HBox(20);
        h9 = new HBox(20);
        h10 = new HBox(20);
        h11 = new HBox(20);
        //
        v1 = new VBox(20);
        v2 = new VBox(20);
        v3 = new VBox(20);
        v4 = new VBox(20);
        v5 = new VBox(20);
        firstnameLabel = new Label("First Name:");
        lastnameLabel = new Label("Last Name:");
        emailLabel = new Label("Email:");
        dateofbirthLabel = new Label("Date Of Birth:");
        genderLabel = new Label("Gender:");
        //my account tab
        CellPhoneLabel = new Label("Cell Phone Number:");
        UserNameLabel = new Label("UserName:");
        UserIdLabel = new Label("UserName:");
        //image
//        accountImageView = new ImageView("Assets/a.png");
        //
        separator1 = new Separator();
        separator2 = new Separator();
        separator3 = new Separator();
        separator4 = new Separator();
        separator5 = new Separator();
        separator6 = new Separator();
        separator7 = new Separator();

        //
        logoutButton = new Button("Logout");
    }

    @Override
    public void addChildren() {
        h1.getChildren().addAll(titleLabel);
        h2.getChildren().addAll(firstnameLabel, lastnameLabel);
        h3.getChildren().addAll(emailLabel, dateofbirthLabel);
        h4.getChildren().addAll(genderLabel);
        //
        v1.getChildren().addAll(h1, h2, h3, h4);
        //

        getChildren().addAll(v1);
    }

    @Override
    public void bindings() {
    }

    @Override
    public void alignElements() {
    }


}
