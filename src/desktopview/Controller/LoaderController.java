package desktopview.Controller;
import desktopview.factory.ViewFactory;
import desktopview.helpers.Model;
import desktopview.view.LoaderView;
import desktopview.view.LoginView;
import desktopview.view.View;
import desktopview.view.ViewType;
import javafx.concurrent.Task;

public class LoaderController extends ViewController
{
    LoaderView loaderView;
    LoginController loginController;

    public LoaderController(View v, Model m)
    {
        super(v,m);
        loaderView = (LoaderView) v;
    }
    @Override
    public void RegisterEvents()
    {
        loginController = new LoginController((LoginView) ViewFactory.getView(ViewType.SYSTEMLOGINVIEW),model);
        Task task = new Task()
        {
            @Override
            protected Object call() throws Exception
            {
                int total = 100;
                for (int i = 0; i < total; i += 1)
                {
                    Thread.sleep(10);
                    updateProgress(i, total);
                    updateMessage("Initializing resources please wait for " + (total - i) + " seconds");
                }
                return this;
            }
        };
        new Thread(task).start();
        loaderView.getProgressBar().setVisible(true);
        loaderView.getMessageLabel1().textProperty().bind(task.messageProperty());
        loaderView.getProgressBar().progressProperty().bind(task.progressProperty());
        task.setOnSucceeded(ee ->
        {
            loaderView.close();
            loginController.RegisterEvents();
            loginController.StartController();
        });
    }

    @Override
    public void StartController()
    {
        view.showView();
    }

}
