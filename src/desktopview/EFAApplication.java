package desktopview;

import desktopview.Controller.LoaderController;
import desktopview.factory.ViewFactory;
import desktopview.helpers.Model;
import desktopview.view.LoaderView;
import desktopview.view.ViewType;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * ETHIO-FREELANCING APPLICATION
 * ADMINS DESKTOP APPLICATION FOR
 * CONTROLLING THE SPRING BOOT WEB APPLICATION
 * THIS IS THE STARTING POINT OF THE APPLICATION
 * THIS CLASS STARTS BY INITIALIZING THE MODEL
 * THE LOADER CONTROLLER CLASS
 * AND LOADER VIEW CLASS THE REST IS CONNECTED
 * THROUGH THE APPLICATION LOGIC
 */


public class EFAApplication extends Application {
    /**
     * @param stage
     * @throws Exception RETURNS VOID
     */
    @Override
    public void start(Stage stage) throws Exception {
        /**
         * LOADER VIEW OBJECT CREATION
         */
        LoaderView loaderView = (LoaderView) ViewFactory.getView(ViewType.LOADERVIEW);
        /**
         * MODEL CLASS CREATION
         */
        Model model = new Model();
        /**
         * LOADER CONTROLLER CREATION WITH LOADER VIEW AND MODEL ARGUMENTS
         */
        LoaderController loaderController = new LoaderController(loaderView, model);
        /**
         * REGISTRATION OF THE UI ELEMENTS EVENTS THROUGH THE CONTROLLER CLASS
         */
        loaderController.RegisterEvents();
        /**
         * STARTING THE APPLICATION
         */
        loaderController.StartController();
    }

    /**
     * MAIN METHOD TO START THE APPLICATION
     *
     * @param args RETURNS VOID
     */
    public static void main(String... args) {
        Application.launch(args);
    }
}
