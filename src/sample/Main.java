package sample;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.*;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.*;

public class Main extends Application {

    Bloom bloom = new Bloom();
    Reflection reflection = new Reflection();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Image img = new Image("https://www.javatpoint.com/javafx/images/javafx-imageinput-effect.png");
        Text text = new Text();
        text.setText(" Welcome to Guleri Enterprises");
        text.setFont(Font.font("Times new Roman bold",FontWeight.THIN, FontPosture.ITALIC,30));
        text.setX(50);
        text.setY(200);
        text.setFill(DARKSALMON);
        text.setEffect(bloom);
        text.setEffect(reflection);


        ImageInput imginput = new ImageInput();
        Rectangle rect = new Rectangle();
        imginput.setSource(img);
        imginput.setX(50);
        imginput.setY(100);
        Group root = new Group();
        rect.setEffect(imginput);
        root.getChildren().add(rect);

        root.getChildren().add(text);
        Scene scene = new Scene(root,1030,1500, MEDIUMAQUAMARINE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ImageInput Example");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
