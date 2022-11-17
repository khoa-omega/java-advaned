package com.vti.entity;

import com.vti.entity.Student.Gender;

import javax.persistence.AttributeConverter;

public class StudentGenderConverter implements AttributeConverter<Gender, Character> {
    @Override
    public Character convertToDatabaseColumn(Gender gender) {
        return gender.getCode();
    }

    @Override
    public Gender convertToEntityAttribute(Character code) {
        return Gender.fromCode(code);
    }
}