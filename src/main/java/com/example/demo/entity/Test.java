package com.example.demo.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Test {
	private String name;
	private int score;
	private String grade;
	private String teacher;
	private List<Integer> problemNums;
}
