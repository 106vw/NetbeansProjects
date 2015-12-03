package felixreyes_4_Methodsmadness;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FelixReyes_4_Methodsmadness extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) { 
        primaryStage.setTitle("Drawing Operations Tests");
        Group root = new Group();
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawbackground(gc);
        drawrectangle(gc); 
        drawwindows(gc);
        drawFelix(gc);
        drawdoor(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    private void drawbackground(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.BLACK);
        gc.fillRect(0, 0, 600, 600);
        
    }

    private void drawrectangle(GraphicsContext gc) {
        gc.setFill(Color.DARKKHAKI);
        gc.setStroke(Color.BROWN);
        gc.fillRect(50, 100 ,300 ,300 );
    
    }
    
    private void drawwindows(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.BLACK);
        gc.fillRect(100, 200, 50, 50);
        gc.fillRect(100,125,50,50);
        gc.fillRect(200,200,50,50);
        gc.fillRect(200, 125, 50,50);
        gc.fillRect(100,275,50,50);
        gc.fillRect(200, 275, 50, 50);
        
    }
    
    private void drawdoor(GraphicsContext gc) {
        gc.setFill(Color.MAROON);
        gc.setStroke(Color.MAROON);
        gc.fillRect(275,300,65,100);
        gc.setFill(Color.WHITE);
        gc.setStroke(Color.WHITE);
        gc.fillOval(305, 320, 2, 2);
        gc.setFill(Color.GOLD);
        gc.setStroke(Color.GOLD);
        gc.fillOval(329, 350, 10, 10);

    }
    
    private void drawFelix(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.fillText("FELIX REYES",100,50);

        
            
        
        
       
        
        
        

        
    }

}
