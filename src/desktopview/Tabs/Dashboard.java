//package desktopview.Tabs;
//
//import desktopview.view.SubView;
//import javafx.scene.control.Button;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//
//public class Dashboard extends SubView {
//
//    //
//    Button addNewAdminButton, addNewApplicantButton, addNewEmployerButton, addNewInterviewButton, addinterviewScheduleButton, systemSettingsButton;
//    //
//    HBox h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11;
//    VBox v1, v2, v3, v4, v5;
//
//    @Override
//    public void init() {
//
//        h1 = new HBox(20);
//        h2 = new HBox(20);
//        h3 = new HBox(20);
//        h4 = new HBox(20);
//        h5 = new HBox(20);
//        h6 = new HBox(20);
//        h7 = new HBox(20);
//        h8 = new HBox(20);
//        h9 = new HBox(20);
//        h10 = new HBox(20);
//        h11 = new HBox(20);
//        //
//        v1 = new VBox(20);
//        v2 = new VBox(20);
//        v3 = new VBox(20);
//        v4 = new VBox(20);
//        v5 = new VBox(20);
//
//
//        //----------------------------------------------------------------------
//        addinterviewScheduleButton = new Button("Add Interview Schedule");
//        addNewAdminButton = new Button("Add New Admin");
//        addNewApplicantButton = new Button("Add New Applicant");
//        addNewEmployerButton = new Button("Add New Employer");
//        addNewInterviewButton = new Button("Add New Interview");
//        systemSettingsButton = new Button("System Settings");
//        //----------------------------------------------------------------------
//    }
//
//    @Override
//    public void addChildren() {
//        //----------------------------------------------------------------------
//        v1.getChildren().addAll(addNewAdminButton, addNewApplicantButton, addNewEmployerButton,
//                addNewInterviewButton, addinterviewScheduleButton, systemSettingsButton);
////        h1.getChildren().addAll(v1);
////        getChildren().addAll(v1);
//        //----------------------------------------------------------------------
//    }
//
//    @Override
//    public void bindings() {
//        //----------------------------------------------------------------------
//        addNewAdminButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
//        addNewAdminButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
//        addNewApplicantButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
//        addNewApplicantButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
//        addNewEmployerButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
//        addNewEmployerButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
//        addNewInterviewButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
//        addNewInterviewButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
//        addinterviewScheduleButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
//        addinterviewScheduleButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
//        systemSettingsButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
//        systemSettingsButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
//        //----------------------------------------------------------------------
//    }
//
//    @Override
//    public void alignElements() {
//        //----------------------------------------------------------------------
//
//        //----------------------------------------------------------------------
//    }
//
//    public Button getAddNewAdminButton() {
//        return addNewAdminButton;
//    }
//
//    public Button getAddNewApplicantButton() {
//        return addNewApplicantButton;
//    }
//
//    public Button getAddNewEmployerButton() {
//        return addNewEmployerButton;
//    }
//
//    public Button getAddNewInterviewButtonButton() {
//        return addNewInterviewButton;
//    }
//
//    public Button getAddinterviewScheduleButton() {
//        return addinterviewScheduleButton;
//    }
//
//    public Button getSystemSettingsButton() {
//        return systemSettingsButton;
//    }
//}
