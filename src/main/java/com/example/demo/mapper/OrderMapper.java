package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.OrderDto;
import com.example.demo.entity.Order;

@Mapper
public interface OrderMapper {
	OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
	
	@Mapping(target = "id", constant = "0L")
	Order toOrder(OrderDto dto);
	
	@Mapping(target = "img", expression = "java(order.getProduct() + \".jpg\")")
	OrderDto toOrderDto(Order order);
}
