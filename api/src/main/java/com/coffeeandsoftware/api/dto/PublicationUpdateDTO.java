package com.coffeeandsoftware.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublicationUpdateDTO {
    private String title;
    private String subtitle;
    private String continuous_text;
    private String main_img_url;
    private List<TagDTO> tagList;
    private boolean is_private;
    private boolean is_draft;
}
