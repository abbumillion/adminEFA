package desktopview.Controller.tabController;

import desktopview.Controller.SubViewController;
import desktopview.Tabs.AdminsTab;
import desktopview.Tabs.Listviews.AdminCell;
import desktopview.dto.AdminDTO;
import desktopview.helpers.Model;
import desktopview.view.SubView;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class AdminsController extends SubViewController {
    AdminsTab adminsTab;

    public AdminsController(SubView v, Model m) {
        super(v, m);
    }

    @Override
    public void RegisterEvents() {
        adminsTab = (AdminsTab) view;
        adminsTab.getAdminsListView().getItems().addAll(model.getAdmins());
        adminsTab.getAdminsListView().setCellFactory((Callback<ListView<AdminDTO>, ListCell<AdminDTO>>) param -> {
            AdminCell jobCell = new AdminCell();
            return jobCell;
        });
        adminsTab.getAdminsListView().getSelectionModel().selectedItemProperty().addListener((obs, old, nvl) -> {
            if(nvl != null)
            {
                AdminDTO adminDTO = (AdminDTO) nvl;
                adminsTab.getFullNameTF().setText(adminDTO.getSignUpDTO().getFullName());
                adminsTab.getEmailTF().setText(adminDTO.getSignUpDTO().getEmail());
                adminsTab.getIsActiveRB().setValue(adminDTO.getSignUpDTO().isActive());
                adminsTab.getRoleCB().setValue(adminDTO.getSignUpDTO().getRole());
                adminsTab.getPhoneNumberTF().setText(adminDTO.getSignUpDTO().getPhoneNumber());
//                adminsTab.get().setValue(adminDTO.getSignUpDTO().getRole());
            }
        });
        adminsTab.getResetButton().setOnAction(e->
        {
            adminsTab.getFullNameTF().setText("");
            adminsTab.getEmailTF().setText("");
            adminsTab.getIsActiveRB().setValue("");
            adminsTab.getRoleCB().setValue("");
            adminsTab.getPhoneNumberTF().setText("");
        });
    }

    @Override
    public void StartController() {

    }
}
