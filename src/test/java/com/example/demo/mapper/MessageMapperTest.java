package com.example.demo.mapper;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.OffsetDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.dto.MessageResult;
import com.example.demo.entity.Message;

public class MessageMapperTest {

	@Test
	@DisplayName("Object + Object")
	void toMessageResult() {
		//given
		final Message message = 
				new Message("Test", "Google", "plus test", "hello", "type", "Ready", "Ready"
						, OffsetDateTime.now(), OffsetDateTime.now());
		
		//when
		final MessageResult result = MessageMapper.INSTANCE.toMessageResult(message, "Park", 200, null);
		
		//then
		assertNotNull(result);
		assertThat(result.getId()).isEqualTo(message.getId());
		assertThat(result.getTo()).isEqualTo(message.getTo());
		assertThat(result.getTitle()).isEqualTo(message.getTitle());
		assertThat(result.getBody()).isEqualTo(message.getBody());
		assertThat(result.getMessageType()).isEqualTo(message.getMessageType());
		assertThat(result.getStatus()).isEqualTo(message.getStatus());
		assertThat(result.getStatusMessage()).isEqualTo(message.getStatusMessage());
		assertThat(result.getCreatedDateTime()).isEqualTo(message.getCreatedDateTime());
		assertThat(result.getUpdatedDateTime()).isEqualTo(message.getUpdatedDateTime());
		assertThat(result.getSender()).isEqualTo("Park");
		assertThat(result.getSenderReplyCode()).isEqualTo(200);
		assertThat(result.getExceptions()).isEqualTo(null);
	}
}
