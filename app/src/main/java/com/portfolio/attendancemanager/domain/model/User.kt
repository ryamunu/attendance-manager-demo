package com.portfolio.attendancemanager.domain.model

data class User(
    val id: String,
    val email: String,
    val name: String,
    val role: Role = Role.EMPLOYEE
)

enum class Role {
    EMPLOYEE, ADMIN
}
