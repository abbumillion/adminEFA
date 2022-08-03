package desktopview.Controller;

import desktopview.helpers.Model;
import desktopview.view.SubView;

public abstract class SubViewController implements Controller {
    protected SubView view;
    protected Model model;

    public SubViewController(SubView v, Model m) {
        view = v;
        model = m;
    }

}
