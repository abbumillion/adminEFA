package desktopview.Controller.tabController;

import desktopview.Controller.SubViewController;
import desktopview.Tabs.FreelancersTab;
import desktopview.helpers.Model;
import desktopview.view.SubView;

public class FreelancersController extends SubViewController {
    private FreelancersTab freelancersTab;

    public FreelancersController(SubView v, Model m) {
        super(v,m);
    }

    @Override
    public void RegisterEvents() {
        freelancersTab = (FreelancersTab) view;
        freelancersTab.getApplicantListView().getItems().addAll(model.getFreelancers());
    }

    @Override
    public void StartController() {
    }
}
