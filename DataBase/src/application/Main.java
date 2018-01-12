package application;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.util.Optional;

import front.MyScene;

public class Main extends Application {

    //public static Group root = new Group();

    public static Stage window;
    public static MyScene mainContainer;
    public static String StartingSceneID = "start";
    public static String StartingSceneFile = "/front/fxml/StartingScene.fxml";
    public static String LoginSceneID = "login";
    public static String LoginSceneFile = "/front/fxml/LoginScene.fxml";
    public static String AdminSceneID = "admin";
    public static String AdminSceneFile = "/front/fxml/AdminPanelScene.fxml";
    public static String ClientSceneID = "client";
    public static String ClientSceneFile = "/front/fxml/ClientPanelScene.fxml";
    public static String WorkerSceneID = "worker";
    public static String WorkerSceneFile = "/front/fxml/WorkerPanelScene.fxml";

    public static void main(String[] args) {
        //new Menu();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        mainContainer = new MyScene();
        //Image icon = new Image(getClass().getResourceAsStream("/assets/icon.png"));
        //window.getIcons().add(icon);
        //window.getStylesheets().add("Sample/test.css");
        window.setResizable(false);
        window.setTitle("Chinese-checkers");
//        window.setOnCloseRequest(e -> {
//            e.consume();
//            closeProgram();
//        });

        mainContainer.loadScreen(Main.StartingSceneID, Main.StartingSceneFile);
        mainContainer.loadScreen(Main.LoginSceneID, Main.LoginSceneFile);
        mainContainer.loadScreen(Main.WorkerSceneID, Main.WorkerSceneFile);
        mainContainer.loadScreen(Main.ClientSceneID, Main.ClientSceneFile);
        mainContainer.loadScreen(Main.AdminSceneID, Main.AdminSceneFile);



        mainContainer.setScene(Main.LoginSceneID, window);

    }

    public static void closeProgram(){
        //TODO: save data to enable coming back to the game
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Look, a Confirmation Dialog");
        alert.setContentText("Do you really want to exit?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            window.close();
        }

    }

}