package com.example.demo.mapper;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.dto.TestDto;

public class TestMapperTest {
	
	@Test
	@DisplayName("property ignore")
	void toTestEntity() {
		//given
		final TestDto dto = TestDto.builder().name("Test").score(80).build();
		
		//when
		final com.example.demo.entity.Test test = TestMapper.INSTANCE.toTestEntity(dto);
		
		//then
		assertNotNull(test);
		assertThat(test.getName()).isEqualTo(dto.getName());
		assertThat(test.getScore()).isEqualTo(dto.getScore());
		assertThat(test.getGrade()).isEqualTo(null);
		assertThat(test.getTeacher()).isEqualTo(null);
		assertThat(test.getProblemNums()).isEqualTo(null);
	}
}
