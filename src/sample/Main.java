package sample;

import com.sun.xml.internal.bind.WhiteSpaceProcessor;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.DepthTest;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import static javafx.scene.paint.Color.*;

public class Main extends Application {

  @Override
    public void start(Stage primaryStage) throws Exception{
      Rectangle rectangle = new Rectangle(25,25,1300,650);
    rectangle.setFill(DARKTURQUOISE);
rectangle.setArcHeight(35);
rectangle.setArcWidth(35);
    Rectangle rectangle1 = new Rectangle(100,100,1150,500);
      rectangle1.setFill(WHITE);
    rectangle1.setArcHeight(35);
    rectangle1.setArcWidth(35);

    Text text = new Text();
    text.setX(160);
    text.setY(200);
    text.setFont(Font.font("Times Roman",FontWeight.BOLD, FontPosture.ITALIC,80));
    text.setFill(ORANGE);
    text.setText("SCHOOL ----" +
            "\n   Six Cruel Hours \n\t\t Of Our Life ");


      Group group = new Group();
      group.getChildren().addAll(rectangle,rectangle1,text);
      Scene scene = new Scene(group,1400,1200,DARKGRAY);
      primaryStage.setScene(scene);
      primaryStage.setTitle("School");
      primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
