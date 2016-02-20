package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class SampleController implements Initializable
{
    @FXML
    private Button button;


    @FXML
    private Pane canvas;

    private Image image = new Image("file:C:\\Users\\joeku_000\\Documents\\GitHub\\Spring16HackISU\\src\\res\\Candy_Monster-icon.png");

    public Monster monster;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Dungeon d = new Dungeon();
        d.initializeDungeon();

        monster = new Monster(image,50,50);
        monster.tick();
        monster.render(canvas);
    }

    public void clicked(ActionEvent event){
        monster.posY += 10;
        monster.tick();
    }
}
