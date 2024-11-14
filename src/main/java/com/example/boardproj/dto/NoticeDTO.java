package com.example.boardproj.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoticeDTO {

    private Long nno;

    @NotBlank
    @Size(min = 2, max = 50)
    private String title;

    @NotBlank
    @Size(min = 2, max = 255)
    private String content;

    @NotBlank
    @Size(min = 2, max = 50)
    private String writer;
}
