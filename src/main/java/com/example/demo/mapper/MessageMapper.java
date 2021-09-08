package com.example.demo.mapper;

import java.util.Collection;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.MessageResult;
import com.example.demo.entity.Message;

@Mapper
public interface MessageMapper {
	MessageMapper INSTANCE = Mappers.getMapper(MessageMapper.class);
	
	MessageResult toMessageResult(Message message, String sender, int senderReplyCode, Collection<Exception> exceptions);
}
