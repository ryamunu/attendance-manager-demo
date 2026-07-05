package com.portfolio.attendancemanager.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "attendance_records")
data class AttendanceEntity(
    @PrimaryKey
    val id: String,
    val userId: String,
    val checkInTime: Long,
    val checkOutTime: Long?,
    val checkInLat: Double,
    val checkInLng: Double,
    val checkOutLat: Double?,
    val checkOutLng: Double?,
    val dateString: String,
    val isSynced: Boolean = false
)
