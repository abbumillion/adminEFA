package desktopview.Tabs;

import desktopview.view.SubView;
import javafx.scene.control.ListView;

public class FeedbacksTab extends SubView {
    //
    ListView feedbacksListView;

    //
    @Override
    public void init() {
        //
        feedbacksListView = new ListView();
        //
    }

    @Override
    public void addChildren() {
        //
        //
        getChildren().addAll(feedbacksListView);
        //
    }

    @Override
    public void bindings() {
        feedbacksListView.prefHeightProperty().bind(widthProperty());
        feedbacksListView.prefWidthProperty().bind(heightProperty());
    }

    @Override
    public void alignElements() {
    }

    public ListView getJobApplicationsListView() {
        //
        return feedbacksListView;
        //
    }
}
