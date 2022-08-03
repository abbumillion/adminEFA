package desktopview.Controller;


import desktopview.factory.ViewFactory;
import desktopview.helpers.Model;
import desktopview.view.LoginView;
import desktopview.view.ResetPasswordView;
import desktopview.view.View;
import desktopview.view.ViewType;

public class ResetPasswordController extends ViewController {


    public ResetPasswordController(View v, Model m) {
        super(v,m);
    }

    @Override
    public void RegisterEvents() {
        ResetPasswordView v = (ResetPasswordView) view;
        v.getFindmyAccountButton().setOnAction(e -> {
        });
        v.getSaveNewPasswordButton().setOnAction(e -> {
            if (v.getNewPasswordTextField().getText().isEmpty()) {
            } else {
                //new password entered
//                user.setPassword(v.getNewPasswordTextField().getText());
                v.SuccessAlert();
                // v.getBackButton().fire();
            }

        });
        v.getBackButton().setOnAction(e -> {
            StartController(new LoginController((LoginView) ViewFactory.getView(ViewType.SYSTEMLOGINVIEW),model));
            v.close();

        });

    }

    @Override
    public void StartController() {
        view.showView();
    }

    private void FindAccount() {
        /*
          if (!v.getUserNameTextField().getText().isEmpty()) {
               
                for (Object obj : model.getUserModel().getAdmins()) {
                    Authenticable a = (Authenticable) obj;
                    if (a.getUserName().equalsIgnoreCase(v.getUserNameTextField().getText())) {
                        System.out.println("Found");
                        user = a;
                        break;
                    } else {
                        System.out.println("Not Found");
                    }
                }
                

                if (user == null) {
                    view.WarningAlert();
                } else {
                    v.SuccessAlert();
                    v.getHBox().setVisible(true);

                } */
    }
}
