package desktopview.Controller.tabController;

import desktopview.Controller.SubViewController;
import desktopview.Tabs.CustomersTab;
import desktopview.Tabs.Listviews.CustomerCell;
import desktopview.dto.CustomerDTO;
import desktopview.helpers.Model;
import desktopview.view.SubView;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class CustomerController extends SubViewController {
    private CustomersTab customersTab;
    public CustomerController(SubView v, Model m) {
        super(v,m);
    }

    @Override
    public void RegisterEvents() {
        customersTab = (CustomersTab)view;
        customersTab.getCompanyListView().getItems().addAll(model.getCustomers());
        customersTab.getCompanyListView().setCellFactory((Callback<ListView<CustomerDTO>, ListCell<CustomerDTO>>) param -> {
            CustomerCell companyCell = new CustomerCell();
            return companyCell;
        });
    }

    @Override
    public void StartController() {

    }
}
