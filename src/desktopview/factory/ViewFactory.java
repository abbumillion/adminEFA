package desktopview.factory;


import desktopview.Admin.AdminHomeView;
import desktopview.view.*;

public class ViewFactory {

    static View v;

    public static View getView(ViewType type) {
        if (null != type) {
            switch (type) {
                case SYSTEMLOGINVIEW:
                    v = new LoginView();
                    break;
                case ADMINHOMEVIEW:
                    v = new AdminHomeView();
                    break;
                case FORGETPASSWORDVIEW:
                    v = new ResetPasswordView();
                    break;
                case LOADERVIEW:
                    v = new LoaderView();
                    break;
                default:
                    break;
            }
        }
        v.getReady();
        return v;
    }

}
