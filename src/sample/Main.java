package sample;

import javafx.animation.FillTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Sphere;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import static javafx.scene.paint.Color.*;

public class Main extends Application {
    Scene scene1, scene2;
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

      Sphere sphere2 = new Sphere();
      sphere2.setRadius(50);
      sphere2.setTranslateX(1000);
      sphere2.setTranslateY(550);
      ScaleTransition scaleTransition = new ScaleTransition();
      scaleTransition.setDuration(Duration.millis(1000));
      scaleTransition.setFromX(2);
      scaleTransition.setAutoReverse(true);
      scaleTransition.setCycleCount(1000);
      scaleTransition.setByX(2);
      scaleTransition.setToX(1);
      scaleTransition.setNode(sphere2);
      scaleTransition.play();

      //setting CullFace for the sphere 3
      sphere2.setCullFace(CullFace.NONE);

      Text text = new Text();
    text.setX(160);
    text.setY(200);
    text.setFont(Font.font("Times Roman",FontWeight.BOLD, FontPosture.ITALIC,80));
    text.setFill(ORANGE);
    text.setText("SCHOOL ---- \n   Six Cruel Hours \n\t\t Of Our Life ");

      TranslateTransition translateTransition = new TranslateTransition();
      translateTransition.setByY(100);
      translateTransition.setDuration(Duration.millis(4000));
      translateTransition.setCycleCount(100);
      translateTransition.setAutoReverse(true);
      translateTransition.setNode(text);
      translateTransition.play();

      FillTransition fillTransition = new FillTransition();
      fillTransition.setAutoReverse(true);
      fillTransition.setCycleCount(100);
      fillTransition.setDuration(Duration.millis(2000));
      fillTransition.setToValue(BLUEVIOLET);
      fillTransition.setShape(rectangle);
      fillTransition.play();

      Button start = new Button("Start");
      start.setOnAction(e -> primaryStage.setScene(scene2));
      Group group = new Group();
      group.getChildren().addAll(rectangle, rectangle1, text, sphere2, start);
      Scene scene = new Scene(group,1400,1200,DARKGRAY);

      Label label2 = new Label("This is the second scene");
     Button end = new Button("Go to scene 1");

      scaleTransition.setNode(sphere2);
      scaleTransition.play();
      end.setOnAction(e -> primaryStage.setScene(scene1));
      VBox layout2 = new VBox(20);
      layout2.getChildren().addAll(label2, end,sphere2);
      scene2 = new Scene(layout2, 1300, 1250);
      primaryStage.setScene(scene);
      primaryStage.setTitle("School");
      primaryStage.show();
  }

    public static void main(String[] args) {
        launch(args);
    }
}
