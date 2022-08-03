package desktopview.Admin;


import desktopview.Tabs.*;
import desktopview.Tabs.Account.AdminAccountTab;
import desktopview.factory.TabFactory;
import desktopview.view.TabType;
import desktopview.view.View;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class AdminHomeView extends View {
    desktopview.Tabs.DashboardTab dashboardTab;
    AdminsTab adminsTab;
    AdminRegistrationView adminRegistrationView;
    desktopview.Tabs.JobApplicationTab jobApplicationTab;
    desktopview.Tabs.JobsTab jobsTab;
    FreelancersTab freelancersTab;
    FeedbacksTab feedbacksTab;
    AdminAccountTab adminAccountTab;
    desktopview.Tabs.CustomersTab customersTab;
    HelpTab helpTab;
    SettingsTab settingsTab;
    TabPane tabPane;
    Tab ApplicantsTab,AdminTab,AdminRegistrationTab,CompaniesTab,JobsTab,DashboardTab,JobApplicationTab,FeedbacksTab,SettingsTab,HelpTab,myAccountTab;

    @Override
    public void init()
    {
        tabPane = new TabPane();
        DashboardTab = new Tab("Dashboard");
        AdminTab = new Tab("Admins");
        ApplicantsTab = new Tab("Freelancers");
        AdminRegistrationTab = new Tab("Add Admin");
        CompaniesTab = new Tab("Customers");
        JobsTab = new Tab("Jobs");
        JobApplicationTab = new Tab("Job Applications");
        FeedbacksTab = new Tab("Feedbacks");
        SettingsTab = new Tab("Settings");
        HelpTab = new Tab("Help");
        myAccountTab = new Tab("My Account");
        adminsTab = (AdminsTab) TabFactory.getTab(TabType.ADMINSTAB);
        jobsTab = (JobsTab) TabFactory.getTab(TabType.JOBSTAB);
        freelancersTab = (desktopview.Tabs.FreelancersTab) TabFactory.getTab(TabType.APPLICANTSTAB);
        adminRegistrationView = (desktopview.Tabs.AdminRegistrationView)TabFactory.getTab(TabType.ADMINREGISTRATIONTAB);
        customersTab = (CustomersTab) TabFactory.getTab(TabType.COMPANIESTAB);
        feedbacksTab = (FeedbacksTab) TabFactory.getTab(TabType.FEEDBACKSTAB);
        jobApplicationTab = (JobApplicationTab) TabFactory.getTab(TabType.JOBAPPLICATIONTAB);
        dashboardTab = (DashboardTab) TabFactory.getTab(TabType.DASHBOARD);
        adminAccountTab = (AdminAccountTab) TabFactory.getTab(TabType.MYACCOUNTTAB);
        helpTab = (HelpTab) TabFactory.getTab(TabType.HELPTAB);
        settingsTab = (SettingsTab)TabFactory.getTab(TabType.SETTINGSTAB);

    }

    @Override
    public void addChildren()
    {
        AdminTab.setContent(adminsTab);
        AdminRegistrationTab.setContent(adminRegistrationView);
        ApplicantsTab.setContent(freelancersTab);
        CompaniesTab.setContent(customersTab);
        JobsTab.setContent(jobsTab);
        JobApplicationTab.setContent(jobApplicationTab);
        FeedbacksTab.setContent(feedbacksTab);
        DashboardTab.setContent(dashboardTab);
        HelpTab.setContent(helpTab);
        SettingsTab.setContent(settingsTab);
        tabPane.getTabs().addAll(DashboardTab,AdminTab, ApplicantsTab, CompaniesTab, JobsTab,JobApplicationTab,AdminRegistrationTab
                ,FeedbacksTab, SettingsTab, HelpTab, myAccountTab);
        getChildren().add(tabPane);
    }

    @Override
    public void bindings()
    {
    }

    @Override
    public void alignElements()
    {
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
    }

    public desktopview.Tabs.DashboardTab getDashboardTab()
    {
        return dashboardTab;
    }

    public AdminRegistrationView getAdminRegistrationView()
    {
        return adminRegistrationView;
    }

    public desktopview.Tabs.JobApplicationTab getJobApplicationTab()
    {
        return jobApplicationTab;
    }

    public desktopview.Tabs.JobsTab getJobsTab()
    {
        return jobsTab;
    }

    public FreelancersTab getFreelancersTab()
    {
        return freelancersTab;
    }

    public desktopview.Tabs.FeedbacksTab getFeedbacksTab()
    {
        return feedbacksTab;
    }

    public AdminAccountTab getAdminAccountTab()
    {
        return adminAccountTab;
    }

    public CustomersTab getCustomersTab()
    {
        return customersTab;
    }

    public desktopview.Tabs.HelpTab getHelpTab()
    {
        return helpTab;
    }

    public desktopview.Tabs.SettingsTab getSettingsTab() {
        return settingsTab;
    }

    public AdminsTab getAdminsTab() {
        return adminsTab;
    }
}
