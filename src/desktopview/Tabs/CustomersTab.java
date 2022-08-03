package desktopview.Tabs;

import desktopview.view.SubView;
import javafx.scene.control.ListView;

public class CustomersTab extends SubView {

    ListView CompanyListView;

    //
    @Override
    public void init() {
        CompanyListView = new ListView();
        //
    }

    @Override
    public void addChildren() {
        //
        //
        getChildren().addAll(CompanyListView);
        //
    }

    @Override
    public void bindings() {
        CompanyListView.prefHeightProperty().bind(widthProperty());
        CompanyListView.prefWidthProperty().bind(heightProperty());
    }

    @Override
    public void alignElements() {
    }

    public ListView getCompanyListView() {
        return CompanyListView;
    }

}
