import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main extends Application {

    private Pane pane;

    private int widthP = 900;
    private int heightP = 600;

    private LinkedList<Circle> circle = new LinkedList<Circle>();


    @Override
    public void start(Stage primaryStage) throws Exception {

        pane = new Pane();
        pane.setPadding(new Insets(20, 10, 20, 50));

        Scene scene = new Scene(pane,widthP,heightP);
       // scene.getStylesheets().add("style.css");

        primaryStage.setTitle("Kalaha");
        primaryStage.setScene(scene);
        primaryStage.show();


        for (int i = 0; i < 6 ; i++) {
            System.out.println("Adding circle at index " + i);
            circle.add(new Circle());
            circle.get(i).setLayoutX(150+i*122);
            circle.get(i).setLayoutY(100);
            circle.get(i).setRadius(25);
            }














        pane.getChildren().addAll(circle);

    }
}
