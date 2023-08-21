
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.patterns.factory.grafik.LabyrinthFX;

public class LabyrinthApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        LabyrinthFX factoryPatternGridPaneImplementation = new LabyrinthFX("MUSTER_B");

        Scene scene = factoryPatternGridPaneImplementation.createLabyrinthScene();

        primaryStage.setTitle("Labyrinth");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}