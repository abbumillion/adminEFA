package desktopview.factory;

import desktopview.Tabs.Account.AdminAccountTab;
import desktopview.Tabs.*;
import desktopview.view.SubView;
import desktopview.view.TabType;

public class TabFactory {
    static SubView tab;
    /**
     * Author Million Sharbe
     * SubView Factory Class
     * Date jun 10, 2022
     * @param tabType
     * @return SubView
     */
    public static SubView getTab(TabType tabType) {
        switch (tabType) {
            case DASHBOARD:
                tab = new DashboardTab();
                break;
            case JOBAPPLICATIONTAB:
                tab = new JobApplicationTab();
                break;
            case JOBSTAB:
                tab = new JobsTab();
                break;
            case APPLICANTSTAB:
                tab = new FreelancersTab();
                break;
            case ADMINREGISTRATIONTAB:
                tab = new AdminRegistrationView();
                break;
            case COMPANIESTAB:
                tab = new CustomersTab();
                break;
            case FEEDBACKSTAB:
                tab = new FeedbacksTab();
                break;
            case HELPTAB:
                tab = new HelpTab();
                break;
            case SETTINGSTAB:
                tab = new SettingsTab();
                break;
            case ADMINSTAB:
                tab = new AdminsTab();
                break;
            case MYACCOUNTTAB:
                tab = new AdminAccountTab();
                break;
        }
        tab.getReady();
        return tab;
    }

}
