package desktopview.Controller.tabController;

import desktopview.Controller.SubViewController;
import desktopview.Tabs.SkillsTab;
import desktopview.helpers.Model;
import desktopview.view.SubView;

public class SkillsController extends SubViewController {
    private SkillsTab skillsTab;
    public SkillsController(SubView v, Model m) {
        super(v,m);
    }

    @Override
    public void RegisterEvents() {
        skillsTab = (SkillsTab) view;
        skillsTab.getSkillsListView().getItems().addAll(model.getSkills());
    }

    @Override
    public void StartController() {

    }
}
