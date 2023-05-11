package com.coffeeandsoftware.controller;

import java.time.LocalDateTime;

import com.coffeeandsoftware.model.Publication;

public class PublicationController {
    public void savePublication(String text, LocalDateTime createdAt) {
        Publication newPublication = new Publication();
        newPublication.setText(text);
        newPublication.setCreatedAt(createdAt);
        System.out.println(newPublication.getText());
        System.out.println(newPublication.getCreatedAt());
    }
}
