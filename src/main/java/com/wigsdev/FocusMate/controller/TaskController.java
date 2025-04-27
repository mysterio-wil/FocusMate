package com.wigsdev.FocusMate.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;

public class TaskController {
    @FXML
    private HBox pomodoroMiniContainer;

    public void initialize() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/pomodoro_mini.fxml"));
            HBox miniWidget = loader.load();
            pomodoroMiniContainer.getChildren().add(miniWidget);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
