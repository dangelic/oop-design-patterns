
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.patterns.factory.grafic.MazeFX;

public class MazeApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        MazeFX factoryPatternGridPaneImplementation = new MazeFX("DESIGN_B");

        Scene scene = factoryPatternGridPaneImplementation.createLabyrinthScene();

        primaryStage.setTitle("MAZE FACTORY PATTERN EXAMPLE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}