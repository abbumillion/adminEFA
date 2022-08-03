package desktopview.Controller.tabController;

import desktopview.Controller.SubViewController;
import desktopview.Tabs.JobApplicationTab;
import desktopview.helpers.Model;
import desktopview.view.SubView;

public class JobApplicationsController extends SubViewController {
    private JobApplicationTab jobApplicationTab;

    public JobApplicationsController(SubView v, Model m) {
        super(v,m);
    }

    @Override
    public void RegisterEvents() {
        jobApplicationTab = (JobApplicationTab) view;
        jobApplicationTab.getJobApplicationsListView().getItems().addAll(model.getJobapplications());
    }

    @Override
    public void StartController() {
    }
}
