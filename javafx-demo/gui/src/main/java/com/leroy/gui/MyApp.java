// The main app.
package com.leroy.gui;

import com.leroy.logic.MyLogic;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * MyApp
 */
public class MyApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX on JDK 11 and Maven");

        Label label = new Label("My logic output is: " +  MyLogic.performLogic());
        Scene scene = new Scene(label, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
}