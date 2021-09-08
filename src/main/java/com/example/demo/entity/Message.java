package com.example.demo.entity;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Message {
	private String id;
	private String to;
    private String title;
    private String body;
    private String messageType;
    private String status = "READY";
    private String statusMessage;
    private OffsetDateTime createdDateTime = OffsetDateTime.now();
    private OffsetDateTime updatedDateTime = OffsetDateTime.now();
}
