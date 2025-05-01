package com.wigsdev.FocusMate.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PomodoroMiniController {
    @FXML
    private Text miniTimerText;
    @FXML
    private Button miniPlayPauseBtn;
    @FXML
    private Button maximizeBtn;

    public void initialize() {
        miniTimerText.setText("25"); // Valor inicial
    }

    @FXML
    public void onMaximizeBtnClick() {
        System.out.println("Click detectado");
        openPomodoroWindow();
    }

    private void openPomodoroWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/pomodoro.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Temporizador Pomodoro");
            stage.setScene(new Scene(root, 900, 600));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
