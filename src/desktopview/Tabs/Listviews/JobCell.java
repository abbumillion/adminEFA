package desktopview.Tabs.Listviews;

import desktopview.dto.JobDTO;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class JobCell extends ListCell {


    @Override
    protected void updateItem(Object item, boolean empty) {
        super.updateItem(item, empty);

        Label employerCompanyLabel, postedOnLabel, jobTitleLabel, skillRequiredLabel, experianceRequiredLabel, sexLabel,
                salaryLabel, numberOfVacanciesLabel, tipLabel;
        HBox h1, h2, h3, h4, h5;
        VBox v1, v2, v3, v4, v5;

        employerCompanyLabel = new Label("Employer");
        jobTitleLabel = new Label("EmployerCompany");
        experianceRequiredLabel = new Label("EmployerCompany");
        numberOfVacanciesLabel = new Label("EmployerCompany");
        skillRequiredLabel = new Label("Skill Required");
        postedOnLabel = new Label("Post 24 minutes ago");
        salaryLabel = new Label("Hourly $300");
        sexLabel = new Label("Both");
        tipLabel = new Label("java ee experts appriciated");
        h1 = new HBox(10);
        h2 = new HBox(70);
        h3 = new HBox(10);
        h4 = new HBox(10);
        h5 = new HBox(10);

        v1 = new VBox(10);
        v2 = new VBox(10);
        v3 = new VBox(10);
        v4 = new VBox(10);
        v5 = new VBox(10);
        h1.getChildren().addAll(jobTitleLabel);
        h2.getChildren().addAll(postedOnLabel, employerCompanyLabel, experianceRequiredLabel, sexLabel, salaryLabel, numberOfVacanciesLabel);
        h3.getChildren().addAll(skillRequiredLabel);
        v1.getChildren().addAll(h1, h2, h3);


//        postedOnLabel.prefHeightProperty().bind(heightProperty());
//        postedOnLabel.prefWidthProperty().bind(widthProperty().multiply(0.3));
//
//        employerCompanyLabel.prefHeightProperty().bind(heightProperty());
//        employerCompanyLabel.prefWidthProperty().bind(widthProperty().multiply(0.3));
//
//        sexLabel.prefHeightProperty().bind(heightProperty());
//        sexLabel.prefWidthProperty().bind(widthProperty().multiply(0.1));
//
//        salaryLabel.prefHeightProperty().bind(heightProperty());
//        salaryLabel.prefWidthProperty().bind(widthProperty().multiply(0.1));
//
//        numberOfVacanciesLabel.prefHeightProperty().bind(heightProperty());
//        numberOfVacanciesLabel.prefWidthProperty().bind(widthProperty().multiply(0.2));
//
//        h1.prefHeightProperty().bind(heightProperty().multiply(0.2));
//        h1.prefWidthProperty().bind(widthProperty());
//
//        h2.prefHeightProperty().bind(heightProperty().multiply(0.4));
//        h2.prefWidthProperty().bind(widthProperty());
//
//        h3.prefHeightProperty().bind(heightProperty().multiply(0.2));
//        h3.prefWidthProperty().bind(widthProperty());
//
//        h4.prefHeightProperty().bind(heightProperty().multiply(0.2));
//        h4.prefWidthProperty().bind(widthProperty());
//
//        v1.prefHeightProperty().bind(heightProperty().multiply(0.3));
//        v1.prefWidthProperty().bind(widthProperty());

        jobTitleLabel.setId("title");
        postedOnLabel.setAlignment(Pos.CENTER);
        employerCompanyLabel.setAlignment(Pos.CENTER);
        sexLabel.setAlignment(Pos.CENTER);
        salaryLabel.setAlignment(Pos.CENTER);
        numberOfVacanciesLabel.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.TOP_RIGHT);


        if (item != null) {
            JobDTO job = (JobDTO) item;
            employerCompanyLabel.setText(job.getTitle());
            postedOnLabel.setText("posted on " + job.getPosted());
            numberOfVacanciesLabel.setText("Vacancies " + job.getVacancy());
            jobTitleLabel.setText("Job Title "+job.getCategory());
            skillRequiredLabel.setText("Skill "+job.getDescription());
            experianceRequiredLabel.setText("Job Type "+job.getType());
            salaryLabel.setText("Salary "+"Hourly $"+job.getBudget());
            tipLabel.setText("posted on " + job.getEndDate());
        }
        setGraphic(v1);
    }
}
