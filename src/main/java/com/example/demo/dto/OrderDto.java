package com.example.demo.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class OrderDto {
	private String name;
	private String product;
	private Integer price;
	private String address;
	private String img;
	private LocalDateTime orderedTime;
}
