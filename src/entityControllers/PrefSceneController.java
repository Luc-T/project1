package entityControllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import entity.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.util.ArrayList;

public class PrefSceneController {
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
    void openRecipes(ActionEvent event) {
        for (String string:likeList.getItems()) {
            Main.getLikeIngredients().add(string);
        }
        for (String string:dislikeList.getItems()) {
            Main.getDislikeIngredients().add(string);
        }
        System.out.println(Main.getLikeIngredients());
        System.out.println(Main.getDislikeIngredients());
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

}
