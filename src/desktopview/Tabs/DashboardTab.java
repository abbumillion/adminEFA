package desktopview.Tabs;

import desktopview.view.SubView;
import javafx.geometry.Pos;
import javafx.scene.chart.*;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.util.Date;

/**
 * THIS CLASS IS A DASHBOARD UI DEFINITION WITH LINE CHART ,BAR GRAPH ,PIE CHART
 * TO SHOW THE APPLICATION STATISTICS FOR THE ADMIN
 * THIS CONCRETE SINGLE TAB CLASS EXTENDS FROM SUBVIEW INTERFACE SINCE IT CANNOT
 * STAND ALONE IT WILL BE EMBEDDED IN TO LARGER VIEW LIKE OTHER TAB CLASSES
 * THIS CLASS'S DIRECT MANIPULATION IS PERFORMED BY THE VIEW CONTROLLER IN
 * CONTROLLER PACKAGE DASHBOARD CONTROLLER TO GET THE DATA TO REGISTER EVENTS
 * EVEN TO GET DISPLAYED TO BE DISPLAYED
 *
 * AUTHOR MILLION SHARBE
 * DATE JUN 4, 2022
 */

public class DashboardTab extends SubView {

    /**
     * NUMBER AXIS FOR THE LINE CHART DEFINITIONS
     */
    private NumberAxis yAxis1;
    private CategoryAxis xAxis1;
    private NumberAxis Axis1;
    private NumberAxis Axis2;
    /**
     * PIE CHART DATA DEFINITION
     */
    private PieChart.Data applicants, jobs, employers , jobapplications;
    /**
     * LINE CHART DEFINITION
     */
    private LineChart lineChart;
    /**
     * PIE CHART DEFINITION
     */
    private PieChart pieChart;
    /**
     * BAR CHART DEFINITION
     */
    private BarChart<String, Number> barChart;
    /**
     * CHART SERIES DEFINITION
     */
    private Series s1, s2, s3,s4;
    private Series applicantsSeries, jobsSeries, clientsSeries ,jobapplicationsSeries;
    /**
     * DESCRIPTION LABEL DEFINITION
     */
    private Label descLabel;
    /**
     * LAYOUT CLASS DEFINITIONS
     */
    /**
     * HORIZONTAL LAYOUTS
     */
    private HBox h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11;
    /**
     * VERTICAL LAYOUT DEFINITIONS
     */
    private VBox v1, v2, v3, v4, v5;
    /**
     * BUTTON DEFINITIONS
     */
    private Button addAdminButton , addSkillButton , refreshDataButton , restartApplicationButton;

    /**
     * INITILIZING ELEMENTS
     */
    @Override
    public void init() {
        /**
         * BUTTON CREATIONS
         */
        addAdminButton = new Button("Add Admin");
        addSkillButton = new Button("Add Skill");
        refreshDataButton = new Button("Refresh Data");
        restartApplicationButton = new Button("Restart");

        /**
         * LAYOUT CREATIONS
         */
        h1 = new HBox(20);
        h2 = new HBox(20);
        h3 = new HBox(20);
        h4 = new HBox(20);
        h5 = new HBox(20);
        h6 = new HBox(20);
        h7 = new HBox(20);
        h8 = new HBox(20);
        h9 = new HBox(20);
        h10 = new HBox(20);
        h11 = new HBox(20);
        v1 = new VBox(20);
        v2 = new VBox(20);
        v3 = new VBox(20);
        v4 = new VBox(20);
        v5 = new VBox(20);
        /**
         * LABEL CREATIONS
         */
        descLabel = new Label("This User interface shows the platform  data simulation\n"
                + "applicant jobs employer companies statistics.it's based on real time data\n"
                + "that is collected during system operation.");
        descLabel.setId("font-16");
        /**
         * NUMBER AXIS CREATIONS
         */
        yAxis1 = new NumberAxis();
        xAxis1 = new CategoryAxis();
        Axis1 = new NumberAxis();
        Axis2 = new NumberAxis();
        /**
         * ADDING NUMBER AXIS TO THE LINE CHART
         */
        lineChart = new LineChart(Axis1, Axis2);
        /**
         * CREATING FREELANCERS PIE CHART DATA
         */
        applicants = new PieChart.Data("Freelancers", 0.63335);
        /**
         * CREATING JOB PIE CHART DATA
         */
        jobs = new PieChart.Data("Jobs", 0.23335);
        /**
         * CREATION OF CUSTOMER PIE CHART DATA
         */
        employers = new PieChart.Data("Customers", 0.22225);
        /**
         * CREATION OF JOB APPLICATIONS DATA
         */
        jobapplications = new PieChart.Data("Job Applications", 0.1225);

        /**
         * CREATION OF PIE CHART OBJECT
         */
        pieChart = new PieChart();
        /**
         * CREATION OF BAR CHART WITH NUMBER AXIS (X,Y)
         */
        barChart = new BarChart<>(xAxis1, yAxis1);
        /**
         * SETTING BAR CHART TITLE
         */
        barChart.setTitle("System Statistics");
        /**
         * CREATION OF FREELANCER DATA SERIES
         */
        applicantsSeries = new Series();
        applicantsSeries.setName("Freelancer Statistics");
        /**
         * CREATION OF JOB DATA SERIES
         */
        jobsSeries = new Series();
        jobsSeries.setName("Job Statistics");
        /**
         * CREATION OF CUSTOMER DATA SERIES
         */
        clientsSeries = new Series();
        clientsSeries.setName("Customer Statistics");
        /**
         * CREATIONS OF JOB APPLICATIONS DATA SERIES
         */
        jobapplicationsSeries = new Series();
        jobapplicationsSeries.setName("Job Application Statistics");
        /**
         * CREATIONS OF APPLICATION DATA SERIES
         */
        s1 = new Series();
        s2 = new Series();
        s3 = new Series();
        s4 = new Series();
    }

    /**
     *
     */
    @Override
    public void addChildren() {
        /**
         * ADDING PIE CHART DATA TO THE PIE CHART UI OBJECT
         */
        pieChart.getData().addAll(applicants, jobs, employers,jobapplications);
        /**
         * ADDING BAR CHART DATA SERIES TO THE BAR CHART UI OBJECT
         */
        barChart.getData().addAll(applicantsSeries, jobsSeries, clientsSeries,jobapplicationsSeries);
        /**
         * ADDING DATA LINE SERIES TO THE LINE CHART UI OBJECT
         */
        lineChart.getData().addAll(s1, s2, s3,s4);
        /**
         * ADDING THE PIE CHART AND LINE CHART
         * IN VERTICAL LAYOUT V1
         */
        v1.getChildren().addAll(pieChart, lineChart);
        /**
         * ADDING THE BUTTON TO HORIZONTAL LAYOUT H3
         */
        h3.getChildren().addAll(addAdminButton,addSkillButton,refreshDataButton,restartApplicationButton);
        /**
         * ADDING DESC LABEL AND H3 OR BUTTONS LAYOUT TO
         * ANOTHER HORIZONTAL LAYOUT H1
         */
        h1.getChildren().addAll(descLabel,h3);
        /**
         * ADDING V1 AND BAR CHART TO H2
         */
        h2.getChildren().addAll(barChart, v1);
        /**
         * ADDING H1 AND H2 TO V2
         */
        v2.getChildren().addAll(h1, h2);
        /**
         * FINAL ADDING THE WHOLE LAYOUT H2
         * TO THE FINAL CONTAINER THIS
         * CLASS
         */
        getChildren().addAll(v2);

    }

    /**
     * binding the components to each other
     * to set up layout width and height
     */
    @Override
    public void bindings() {
        barChart.prefHeightProperty().bind(h1.heightProperty().multiply(0.9));
        barChart.prefWidthProperty().bind(h1.widthProperty().multiply(0.65));

        pieChart.prefHeightProperty().bind(v1.heightProperty().multiply(0.5));
        pieChart.prefWidthProperty().bind(v1.widthProperty());

        lineChart.prefHeightProperty().bind(v1.heightProperty().multiply(0.5));
        lineChart.prefWidthProperty().bind(v1.widthProperty());

        v1.prefHeightProperty().bind(h1.heightProperty());
        v1.prefWidthProperty().bind(h1.widthProperty().multiply(0.35));

        h2.prefHeightProperty().bind(v2.heightProperty().multiply(0.9));
        h2.prefWidthProperty().bind(v2.widthProperty());

        h1.prefHeightProperty().bind(v2.heightProperty().multiply(0.1));
        h1.prefWidthProperty().bind(v2.widthProperty());

        descLabel.prefWidthProperty().bind(h2.widthProperty().multiply(0.6));

        v2.prefHeightProperty().bind(heightProperty());
        v2.prefWidthProperty().bind(widthProperty());

    }

    /**
     * alignment of elements
     */
    @Override
    public void alignElements() {

        pieChart.setAnimated(true);
        pieChart.setLabelsVisible(true);
        applicantsSeries.setName("Applicants");
        jobsSeries.setName("Jobs");
        clientsSeries.setName("Clients");
        xAxis1.setLabel(new Date().getYear() + "");
        yAxis1.setLabel("Number in Millions ");
        barChart.setAnimated(true);
        descLabel.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        v2.setAlignment(Pos.CENTER);
        h1.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);

        descLabel.setId("font-11");

    }

    /**
     *
     * @return
     */
    public Series getApplicantsSeries() {
        return applicantsSeries;
    }

    /**
     *
     * @return
     */
    public Series getJobsSeries() {
        return jobsSeries;
    }

    /**
     *
     * @return
     */
    public Series getClientsSeries() {
        return clientsSeries;
    }

    /**
     *
     * @return
     */
    public PieChart.Data getApplicants() {
        return applicants;
    }

    /**
     *
     * @return
     */
    public PieChart.Data getJobs() {
        return jobs;
    }

    /**
     *
     * @return
     */
    public PieChart.Data getEmployers() {
        return employers;
    }

    /**
     *
     * @return freelancer series ui
     */
    public Series getS1() {
        return s1;
    }

    /**
     *
     * @return jobs chart ui
     */
    public Series getS2() {
        return s2;
    }

    /**
     *
     * @return customer chart ui
     */
    public Series getS3() {
        return s3;
    }

    /**
     *
     * @return job application data for pie chart
     */
    public PieChart.Data getJobapplications() {
        return jobapplications;
    }

    /**
     *
     * @return job applications series
     */
    public Series getS4() {
        return s4;
    }

    /**
     *
     * @return job applications series
     */
    public Series getJobapplicationsSeries() {
        return jobapplicationsSeries;
    }

    /**
     *
     * @return add admin button
     */
    public Button getAddAdminButton() {
        return addAdminButton;
    }

    /**
     *
     * @return add skill button
     */
    public Button getAddSkillButton() {
        return addSkillButton;
    }

    /**
     *
     * @return refresh data button
     */
    public Button getRefreshDataButton() {
        return refreshDataButton;
    }

    /**
     *
     * @return restart app button
     */
    public Button getRestartApplicationButton() {
        return restartApplicationButton;
    }
}
