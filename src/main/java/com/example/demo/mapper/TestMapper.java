package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.TestDto;
import com.example.demo.entity.Test;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface TestMapper {
	
	TestMapper INSTANCE = Mappers.getMapper(TestMapper.class);
	
	@Mapping(target = "grade", ignore = true)
	@Mapping(target = "teacher", ignore = true)
	@Mapping(target = "problemNums", ignore = true)
	Test toTestEntity(TestDto dto);
}
