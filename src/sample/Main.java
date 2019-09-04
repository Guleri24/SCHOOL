package sample;

import com.sun.org.apache.bcel.internal.generic.FASTORE;
import javafx.animation.FillTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Effect;
import javafx.scene.layout.Background;
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

import java.util.Scanner;

import static javafx.scene.paint.Color.*;

public class Main extends Application {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        if (in.next().charAt(0) == 'y') {
            Scene1 scene1 = new Scene1();
            scene1.scene1(primaryStage);
        } else {
            Scene2 scene2 = new Scene2();
            scene2.scene2(primaryStage);
        }
        primaryStage.show();
    }
}

class Scene1 {
    Scene scene1;

    public void scene1(Stage primaryStage) throws Exception {

        Rectangle rectangle = new Rectangle(25, 25, 1300, 650);
        rectangle.setFill(DARKTURQUOISE);
        rectangle.setArcHeight(35);
        rectangle.setArcWidth(35);

        Rectangle rectangle1 = new Rectangle(100, 100, 1150, 500);
        rectangle1.setFill(WHITE);
        rectangle1.setArcHeight(35);
        rectangle1.setArcWidth(35);

        Text text = new Text();
        text.setX(160);
        text.setY(200);
        text.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 80));
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

        Group group = new Group();
        group.getChildren().addAll(rectangle, rectangle1, text);
        scene1 = new Scene(group, 1400, 1200, DARKGRAY);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("School");
    }
}

class Scene2 {
    Scene scene1;

    void scene2(Stage primaryStage) {

        Rectangle BackRect, MainRect, rect1, rect2, rect3, rect4 ;
        BackRect = new Rectangle(25, 25, 1300, 650);
        BackRect.setFill(DARKTURQUOISE);
        BackRect.setArcHeight(35);
        BackRect.setArcWidth(35);

        MainRect = new Rectangle(100, 100, 1150, 500);
        MainRect.setFill(WHITE);
        MainRect.setArcHeight(35);
        MainRect.setArcWidth(35);

        rect1 = new Rectangle(120, 215, 210, 230);
        rect1.setFill(BLUEVIOLET);
        rect1.setArcHeight(35);
        rect1.setArcWidth(35);

        rect2 = new Rectangle(420, 215, 210, 230);
        rect2.setFill(BLUEVIOLET);
        rect2.setArcHeight(35);
        rect2.setArcWidth(35);

        rect3 = new Rectangle(720, 215, 210, 230);
        rect3.setFill(BLUEVIOLET);
        rect3.setArcHeight(35);
        rect3.setArcWidth(35);

        rect4 = new Rectangle(1020, 215, 210, 230);
        rect4.setFill(BLUEVIOLET);
        rect4.setArcHeight(35);
        rect4.setArcWidth(35);

        Group group = new Group();
        group.getChildren().addAll(BackRect, MainRect,rect1,rect2,rect3,rect4);
        scene1 = new Scene(group, 1400, 1200, DARKGRAY);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("School");

    }
}
