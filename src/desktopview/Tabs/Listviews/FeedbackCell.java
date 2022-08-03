package desktopview.Tabs.Listviews;

import desktopview.dto.FeedbackDTO;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

public class FeedbackCell extends ListCell {
    @Override
    protected void updateItem(Object item, boolean empty) {
        super.updateItem(item, empty);
        Label feedbackIdLabel, feedbackDateLabel, feedbackContentLabel;
        feedbackIdLabel = new Label("Skill Name");
        feedbackDateLabel = new Label("Skill Category");
        feedbackContentLabel = new Label("Skill Information");
        HBox h = new HBox(10);
        h.prefWidthProperty().bind(widthProperty());
        feedbackIdLabel.prefWidthProperty().bind(widthProperty().multiply(0.2));
        feedbackDateLabel.prefWidthProperty().bind(widthProperty().multiply(0.2));
        feedbackContentLabel.prefWidthProperty().bind(widthProperty().multiply(0.55));
        feedbackIdLabel.setAlignment(Pos.CENTER_LEFT);
        feedbackDateLabel.setAlignment(Pos.CENTER_LEFT);
        feedbackContentLabel.setAlignment(Pos.CENTER_LEFT);
        h.getChildren().addAll(feedbackIdLabel, feedbackDateLabel, feedbackContentLabel);
        if (item != null) {
            FeedbackDTO feedbackDTO = (FeedbackDTO) item;
            feedbackIdLabel.setText(feedbackDTO.getDate().toString());
            feedbackContentLabel.setText(feedbackDTO.getComments());
            feedbackDateLabel.setText(feedbackDTO.getDate().toString());
        }
        setGraphic(h);
    }

}
