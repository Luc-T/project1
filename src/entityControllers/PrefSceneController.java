package entityControllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import entity.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PrefSceneController implements Initializable {
    private ObservableList<String> currentLikes = FXCollections.observableArrayList();
    private ObservableList<String> currentDislikes = FXCollections.observableArrayList();

    @FXML
    private JFXListView<String> likeList;

    @FXML
    private JFXButton likeAdd;

    @FXML
    private JFXTextField likeText;

    @FXML
    private JFXButton likeRemove;

    @FXML
    private JFXListView<String> dislikeList;

    @FXML
    private JFXButton dislikeAdd;

    @FXML
    private JFXTextField dislikeText;

    @FXML
    private JFXButton dislikeRemove;

    @FXML
    private JFXButton doneBtn;

    @FXML
    void addDislike(ActionEvent event) {
        currentDislikes.add(dislikeText.getText());
        dislikeList.setItems(currentDislikes);
        dislikeText.setText("");
    }

    @FXML
    void addLike(ActionEvent event) {
        currentLikes.add(likeText.getText());
        likeList.setItems(currentLikes);
        likeText.setText("");
    }

    @FXML
    void openRecipes(ActionEvent event) throws IOException {
        if (!currentDislikes.isEmpty()||!currentLikes.isEmpty()) {
            Main.getDislikeIngredients().clear();
            Main.getLikeIngredients().clear();
            for (String string : likeList.getItems()) {
                Main.getLikeIngredients().add(string);
            }
            for (String string : dislikeList.getItems()) {
                Main.getDislikeIngredients().add(string);
            }
            System.out.println(Main.getLikeIngredients());
            System.out.println(Main.getDislikeIngredients());

            Window currentWindow = doneBtn.getScene().getWindow();
            currentWindow.setHeight(730);
            currentWindow.setWidth(1040);
            Parent newRoot = FXMLLoader.load(getClass().getResource("../fxml/recipesScene.fxml"));
            currentWindow.getScene().setRoot(newRoot);
        }
        else{
            System.out.println("ENTER SOMETHING TO SEARCH FOR");
        }
    }

    @FXML
    void removeDislike(ActionEvent event) {
        //currentSnacks.remove(itemsBuying.getSelectionModel().getSelectedItem());
        currentDislikes.remove(dislikeList.getSelectionModel().getSelectedItem());
        dislikeList.setItems(currentDislikes);
    }

    @FXML
    void removeLike(ActionEvent event) {
        currentLikes.remove(likeList.getSelectionModel().getSelectedItem());
        likeList.setItems(currentLikes);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (Main.getLikeIngredients()!=null || !Main.getLikeIngredients().isEmpty()) {
            for (String string : Main.getLikeIngredients()) {
                currentLikes.add(string);
            }
        }
        if (Main.getDislikeIngredients()!=null || !Main.getDislikeIngredients().isEmpty()) {
            for (String string : Main.getDislikeIngredients()) {
                currentDislikes.add(string);
            }
        }
        likeList.setItems(currentLikes);
        dislikeList.setItems(currentDislikes);
    }
}
