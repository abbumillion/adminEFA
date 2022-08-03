package desktopview.Controller;

import desktopview.helpers.Model;
import desktopview.view.View;

interface Controller {
    void RegisterEvents();
    void StartController();
}
public abstract class ViewController implements Controller {

    protected View view;
    protected Model model;

    public ViewController(View v,Model m) {
        view = v;
        model = m;

    }

    public void StartController(Controller controller) {
        controller.RegisterEvents();
        controller.StartController();
    }

}
