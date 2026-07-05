package com.portfolio.attendancemanager.domain.model

data class AttendanceRecord(
    val id: String = "",
    val userId: String,
    val checkInTime: Long,
    val checkOutTime: Long? = null,
    val checkInLocation: LocationPoint,
    val checkOutLocation: LocationPoint? = null,
    val dateString: String // Format: YYYY-MM-DD for easy querying
)
