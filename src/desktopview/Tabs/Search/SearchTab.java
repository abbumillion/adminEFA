package desktopview.Tabs.Search;

import desktopview.view.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SearchTab extends SubView {
    //
    Button searchButton;
    TextField searchTextField;
    Label companyNameLabel;
    HBox h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11;
    VBox v1, v2, v3, v4, v5;

    @Override
    public void init() {
        searchButton = new Button("Search");
        searchTextField = new TextField("Search something in here!!!");
        companyNameLabel = new Label("Consulting System");
        companyNameLabel.setId("font-20");


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
    }

    @Override
    public void addChildren() {
        //
        h1.getChildren().addAll(companyNameLabel);
        h2.getChildren().addAll(searchTextField, searchButton);
        v1.getChildren().addAll(h1, h2);
        getChildren().addAll(v1);
        //
    }

    @Override
    public void bindings() {
        //--------------------------------------------------------------------//
        v1.prefWidthProperty().bind(widthProperty());
        v1.prefHeightProperty().bind(heightProperty());
        //--------------------------------------------------------------------//
        h1.prefWidthProperty().bind(v1.widthProperty());
        h1.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));
        h2.prefWidthProperty().bind(v1.widthProperty());
        h2.prefHeightProperty().bind(v1.heightProperty().multiply(0.4));
        //--------------------------------------------------------------------//
        companyNameLabel.prefWidthProperty().bind(h1.widthProperty());
        companyNameLabel.prefHeightProperty().bind(h1.heightProperty());
        searchTextField.prefWidthProperty().bind(h2.widthProperty().multiply(0.45));
        searchTextField.prefHeightProperty().bind(h2.heightProperty().multiply(0.15));
        searchButton.prefWidthProperty().bind(h2.widthProperty().multiply(0.15));
        //--------------------------------------------------------------------//
    }

    @Override
    public void alignElements() {
        //--------------------------------------------------------------------//
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);
        //--------------------------------------------------------------------//
        titleLabel.setAlignment(Pos.CENTER);
        companyNameLabel.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);
        titleLabel.setId("font-26");
        //--------------------------------------------------------------------//
    }

}
