package desktopview.Controller.tabController;

import desktopview.Controller.SubViewController;
import desktopview.Tabs.FeedbacksTab;
import desktopview.Tabs.Listviews.CustomerCell;
import desktopview.Tabs.Listviews.FeedbackCell;
import desktopview.dto.CustomerDTO;
import desktopview.dto.FeedbackDTO;
import desktopview.helpers.Model;
import desktopview.view.SubView;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class FeedbacksController extends SubViewController {
    FeedbacksTab feedbacksTab;
    public FeedbacksController(SubView v, Model m) {
        super(v,m);
    }

    @Override
    public void RegisterEvents() {
        feedbacksTab = (FeedbacksTab)view;
        feedbacksTab.getJobApplicationsListView().getItems().addAll(model.getFeedbacks());
        feedbacksTab.getJobApplicationsListView().setCellFactory((Callback<ListView<FeedbackDTO>, ListCell<FeedbackDTO>>) param -> {
            FeedbackCell feedbackCell = new FeedbackCell();
            return feedbackCell;
        });
    }

    @Override
    public void StartController() {

    }
}
