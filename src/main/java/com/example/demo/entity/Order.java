package com.example.demo.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Order {
	private Long id;
	private String name;
	private String product;
	private Integer price;
	private String address;
	private LocalDateTime orderedTime;
}
