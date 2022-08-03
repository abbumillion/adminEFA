package desktopview.Controller.tabController;

import desktopview.Controller.SubViewController;
import desktopview.Tabs.JobsTab;
import desktopview.Tabs.Listviews.FeedbackCell;
import desktopview.Tabs.Listviews.JobCell;
import desktopview.dto.FeedbackDTO;
import desktopview.dto.JobDTO;
import desktopview.helpers.Model;
import desktopview.view.SubView;
import desktopview.view.View;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class JobsController extends SubViewController {
    private JobsTab jobsTab;
    public JobsController(SubView v, Model m) {
        super(v,m);
    }

    @Override
    public void RegisterEvents() {

        jobsTab = (JobsTab)view;
        jobsTab.getJobListView().getItems().addAll(model.getJobs());
        jobsTab.getJobListView().setCellFactory((Callback<ListView<JobDTO>, ListCell<FeedbackDTO>>) param -> {
            JobCell jobCell = new JobCell();
            return jobCell;
        });

    }

    @Override
    public void StartController() {

    }
}
