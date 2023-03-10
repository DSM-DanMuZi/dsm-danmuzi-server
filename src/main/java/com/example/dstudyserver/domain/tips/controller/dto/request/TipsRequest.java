package com.example.dstudyserver.domain.tips.controller.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TipsRequest {
    @NotBlank
    private String title;
    @NotBlank
    private String content;
}
