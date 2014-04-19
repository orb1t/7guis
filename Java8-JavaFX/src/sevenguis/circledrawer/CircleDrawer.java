package sevenguis.circledrawer;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CircleDrawer extends Application {

    public void start(Stage stage) throws Exception {
        Button undo = new Button("Undo");
        Button redo = new Button("Redo");
        CircleDrawerCanvas canvas = new CircleDrawerCanvas();

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));
        HBox top = new HBox(10, undo, redo);
        top.setPadding(new Insets(0, 0, 10, 0));
        root.setTop(top);
        root.setCenter(canvas);

        undo.setOnAction(e -> canvas.undo());
        redo.setOnAction(e -> canvas.redo());

        stage.setScene(new Scene(root));
        stage.setTitle("Counter");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
