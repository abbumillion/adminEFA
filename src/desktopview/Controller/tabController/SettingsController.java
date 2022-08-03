package desktopview.Controller.tabController;

import desktopview.Controller.SubViewController;
import desktopview.Tabs.SettingsTab;
import desktopview.helpers.Model;
import desktopview.view.SubView;

public class SettingsController extends SubViewController {
    SettingsTab settingsTab;
    public SettingsController(SubView v, Model m) {
        super(v,m);
    }

    @Override
    public void RegisterEvents() {
        settingsTab = (SettingsTab)view;
    }

    @Override
    public void StartController() {

    }
}
