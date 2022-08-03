package desktopview.Controller.tabController;
import desktopview.Controller.SubViewController;
import desktopview.Tabs.Account.AdminAccountTab;
import desktopview.helpers.Model;
import desktopview.view.SubView;

public class MyAccountController extends SubViewController {
    private AdminAccountTab adminAccountTab;
    public MyAccountController(SubView v, Model m) {
        super(v,m);
    }

    @Override
    public void RegisterEvents() {
        adminAccountTab = (AdminAccountTab)adminAccountTab;
    }

    @Override
    public void StartController() {

    }
}
