package sample;

import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.Reflection;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import static javafx.scene.paint.Color.*;

public class Main extends Application {

    Bloom bloom = new Bloom();
    Reflection reflection = new Reflection();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Rectangle rectangle = new Rectangle(100, 500, 300, 100);
        rectangle.setFill(ANTIQUEWHITE);
        rectangle.setStroke(LAVENDER);
        rectangle.setStrokeWidth(20);
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(2000));
        rotateTransition.setAxis(Rotate.Z_AXIS);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(1000);
        rotateTransition.setNode(rectangle);
        rotateTransition.setAutoReverse(true);

        Ellipse ellipse = new Ellipse(300, 100, 100, 50);
        ellipse.setFill(LAVENDER);
        ellipse.setStroke(RED);
        ellipse.setStrokeWidth(5);

        //Instantiating RotateTransition class   
        RotateTransition rotate = new RotateTransition();

        //Setting Axis of rotation   
        rotate.setAxis(Rotate.Z_AXIS);

        // setting the angle of rotation   
        rotate.setByAngle(600);

        //setting cycle count of the rotation   
        rotate.setCycleCount(1000);

        //Setting duration of the transition   
        rotate.setDuration(Duration.millis(5000));

        //the transition will be auto reversed by setting this to true   
        rotate.setAutoReverse(true);

        //setting Rectangle as the node onto which the   
// transition will be applied  
        rotate.setNode(ellipse);


        //playing the transition


        Circle circle = new Circle(600, 700, 10, RED);
        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setByX(40);
        scaleTransition.setDuration(Duration.millis(2000));
        scaleTransition.setCycleCount(2000);
        scaleTransition.setAutoReverse(true);
        scaleTransition.setNode(circle);
        rotate.play();
        rotateTransition.play();
        scaleTransition.play();
        Group root = new Group();
        root.getChildren().addAll(ellipse, rectangle, circle);
        Scene scene = new Scene(root, 600, 400, CHOCOLATE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ImageInput Example");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
