import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by sam on 4/24/16.
 */
public class Main extends Application {

    public void start(Stage primaryStage){
        CartesianPlot plot=new CartesianPlot(x->Math.pow(x,2),400,400);
        Scene scene=new Scene(plot);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }

}