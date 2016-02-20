package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import javax.swing.text.Element;


/**
 * Created by joeku_000 on 2/20/2016.
 */
public class Monster extends ImageView
{
    public double posX, posY;

    public Monster(Image image, double posX, double posY){
        super(image);
        this.posX = posX;
        this.posY = posY;
    }

    public void tick(){
        if(posX < 600 && posY < 250)
        {
            this.setFitHeight(50);
            this.setFitWidth(50);
            this.relocate(posX,posY);

        }
    }

    public void render(Pane canvas){
        canvas.getChildren().addAll(this);
    }
}
