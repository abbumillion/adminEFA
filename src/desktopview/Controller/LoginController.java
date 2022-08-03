package desktopview.Controller;


import desktopview.Admin.AdminHomeView;
import desktopview.Controller.Admin.AdminHomeController;
import desktopview.factory.ViewFactory;
import desktopview.helpers.Model;
import desktopview.view.LoginView;
import desktopview.view.ViewType;

public class LoginController extends ViewController {

    public LoginController(LoginView v, Model m) {
        super(v,m);

    }

    @Override
    public void StartController() {
        view.showView();
    }

    private void VerifyUser() {
        LoginView v = (LoginView) view;
        if (v.getUserNameTextField().getText().isEmpty() || v.getPasswordField().getText().isEmpty()) {
            v.EmptyFieldAlert();
        } else {
            String userName = v.getUserNameTextField().getText();
            String password = v.getPasswordField().getText();
            if (userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
                AdminHomeView adminHomeView = (AdminHomeView) ViewFactory.getView(ViewType.ADMINHOMEVIEW);
                AdminHomeController adminHomeController = new AdminHomeController(adminHomeView,model);
                adminHomeController.RegisterEvents();
                adminHomeController.StartController();
            } else {
                view.FailedLogin();
            }
        }
    }

    @Override
    public void RegisterEvents() {
        LoginView v = (LoginView) view;
        v.getLoginButton().setOnAction(e -> {
            AdminHomeController ac = new AdminHomeController((AdminHomeView) ViewFactory.getView(ViewType.ADMINHOMEVIEW),model);
            StartController(ac);
        });
        v.getForgetPasswordLabel().setOnAction(e -> {
        StartController(new ResetPasswordController(ViewFactory.getView(ViewType.FORGETPASSWORDVIEW),model));
            v.close();
        });
    }

//    private void EnterUser(Authenticable authenticable) {
//        //Enter user to the system here..
//        view.close();
//        if (authenticable instanceof Admin) {
//            //admin subsystem
//            AdminHomeController ac = new AdminHomeController((AdminHomeView) ViewFactory.getView(ViewType.ADMINHOMEVIEW), model);
//            ac.setUser(authenticable);
//            StartController(ac);
//        } else if (authenticable instanceof Applicant) {
//            //applicant subsystem
//            ApplicantHomeController applicantHomeController = new ApplicantHomeController((ApplicantHomeView) ViewFactory.getView(ViewType.APPLICANTHOMEVIEW), model);
//            applicantHomeController.setUser(authenticable);
//            StartController(applicantHomeController);
//        } else if (authenticable instanceof Company) {
//            //company subsystem
//            CompanyHomeViewController echc = new CompanyHomeViewController((CompanyHomeView) ViewFactory.getView(ViewType.COMPANYHOMEVIEW), model);
//            echc.setUser(authenticable);
//            StartController(echc);
//        }
//    }

}
