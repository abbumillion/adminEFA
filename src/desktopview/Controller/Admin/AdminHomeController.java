package desktopview.Controller.Admin;

import desktopview.Admin.AdminHomeView;
import desktopview.Controller.ViewController;
import desktopview.Controller.tabController.*;
import desktopview.helpers.Model;
import desktopview.view.View;

public class AdminHomeController extends ViewController {

    AdminHomeView v;

    public AdminHomeController(View view, Model m) {
        super(view,m);
    }

    @Override
    public void RegisterEvents() {
        v = (AdminHomeView) view;

    }

    @Override
    public void StartController() {
        v = (AdminHomeView) view;
        DashboardController statisticsController = new DashboardController(v.getDashboardTab());
        statisticsController.StartController();
        FreelancersController freelancersController = new FreelancersController(v.getFreelancersTab(),model);
        freelancersController.RegisterEvents();
        freelancersController.StartController();
        CustomerController customerController = new CustomerController(v.getCustomersTab(),model);
        customerController.RegisterEvents();
        customerController.StartController();
        JobsController jobsController = new JobsController(v.getJobsTab(),model);
        jobsController.RegisterEvents();
        jobsController.StartController();
        JobApplicationsController jobApplicationsController = new JobApplicationsController(v.getJobApplicationTab(),model);
        jobApplicationsController.RegisterEvents();
        jobApplicationsController.StartController();
        FeedbacksController feedbacksController = new FeedbacksController(v.getFeedbacksTab(),model);
        feedbacksController.RegisterEvents();
        feedbacksController.StartController();
        SettingsController settingsController = new SettingsController(v.getSettingsTab(),model);
        settingsController.RegisterEvents();
        settingsController.StartController();
        AdminsController adminsController = new AdminsController(v.getAdminsTab(),model);
        adminsController.RegisterEvents();
        adminsController.StartController();
        v.showView();

    }

}
