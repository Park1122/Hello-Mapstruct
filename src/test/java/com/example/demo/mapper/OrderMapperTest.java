package com.example.demo.mapper;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.dto.OrderDto;
import com.example.demo.entity.Order;

public class OrderMapperTest {

	@Test
	@DisplayName("DTO to Entity")
	void toOrder() {
		//given
		final OrderDto dto = OrderDto.builder()
				.name("Test")
				.product("Candy")
				.price(200)
				.address("Seoul")
				.orderedTime(LocalDateTime.now())
				.build();
		
		//when
		final Order order = OrderMapper.INSTANCE.toOrder(dto);
		
		//then
		assertNotNull(order);
		assertThat(order.getName()).isEqualTo("Test");
		assertThat(order.getProduct()).isEqualTo("Candy");
		assertThat(order.getPrice()).isEqualTo(200);
		assertThat(order.getAddress()).isEqualTo("Seoul");
		assertThat(order.getOrderedTime()).isEqualTo(dto.getOrderedTime());
		assertThat(order.getId()).isEqualTo(0L);
	}
	
	@Test
	@DisplayName("Entity to DTO")
	void toOrderDto() {
		//given
		final Order order = new Order(1L, "Test", "Candy", 1000, "Seoul", LocalDateTime.now());
		
		//when
		final OrderDto orderDto = OrderMapper.INSTANCE.toOrderDto(order);
		
		//then
		assertNotNull(orderDto);
        assertThat(orderDto.getName()).isEqualTo("Test");
        assertThat(orderDto.getProduct()).isEqualTo("Candy");
        assertThat(orderDto.getPrice()).isEqualTo(1000);
        assertThat(orderDto.getAddress()).isEqualTo("Seoul");
        assertThat(orderDto.getOrderedTime()).isEqualTo(order.getOrderedTime());
        assertThat(orderDto.getImg()).isEqualTo("Candy.jpg");
	}
}
