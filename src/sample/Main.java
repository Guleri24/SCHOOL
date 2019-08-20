package sample;
import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class Main extends Application {
   static String name;
   static Scanner in = new Scanner(System.in);
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
  /*      GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);

        Label greeting = new Label("welcome to Guleri Enterprise");
        greeting.setTextFill(Color.GREEN);
        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD,50));
        root.getChildren().add(greeting);
        */

        primaryStage.setTitle(name);


        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        System.out.println("enter application name: ");
        name = in.next();
        launch(args);
    }
}
