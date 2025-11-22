package com.bignerdranch.android.hvorenkov_pr33_var8

import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName="menu")
data class food_menu(
    @PrimaryKey val id:Long,
    @ColumnInfo(name="difficulty_name") val difficultyName:String
)
