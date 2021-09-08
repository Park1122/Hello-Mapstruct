package com.example.demo.dto;

import java.time.OffsetDateTime;
import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class MessageResult {
	private String id;
    private String to;
    private String title;
    private String body;
    private String messageType;
    private String status;
    private String statusMessage;
    private OffsetDateTime createdDateTime;
    private OffsetDateTime updatedDateTime;
    private String sender;
    private int senderReplyCode;
    private Collection<Exception> exceptions;
}
