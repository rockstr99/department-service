package com.rockstr99.department_service.model;

public record Employee(Long id, Long departmentId, String name, int age, String position) {
}
