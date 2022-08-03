package desktopview.Tabs;

import desktopview.dto.SkillDTO;
import desktopview.view.SubView;
import javafx.scene.control.ListView;

/**
 * this class represent the skills list
 * UI for the application
 * Author Million Sharbe
 * Date jul 28,2022
 */
public class SkillsTab extends SubView {

    /**
     * list view container
     */
    private ListView skillsListView;

    /**
     * initializing elements or components
     */
    @Override
    public void init() {
        /**
         * creation of list view object
         */
        skillsListView = new ListView<SkillDTO>();
    }

    /**
     * creating the layout
     */
    @Override
    public void addChildren() {
        /**
         * adding list view to the container
         */
        getChildren().addAll(skillsListView);
    }

    /**
     * binding the ui to each other
     * and container this class
     */
    @Override
    public void bindings() {
        skillsListView.prefHeightProperty().bind(heightProperty());
        skillsListView.prefWidthProperty().bind(widthProperty());
    }

    /**
     * alignments of elements or componenets of this class
     */
    @Override
    public void alignElements() {
    }

    /**
     *
     * @return skills list view
     * to be manipulated later by skills tab
     * controller to display data on it
     * and other operations
     */
    public ListView getSkillsListView() {
        return skillsListView;
    }


}
