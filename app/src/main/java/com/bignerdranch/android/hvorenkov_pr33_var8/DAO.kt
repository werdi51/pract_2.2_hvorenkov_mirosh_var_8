package com.bignerdranch.android.hvorenkov_pr33_var8

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface DAO {
    @Insert
    suspend fun InsertProduct(product:food_menu)

    @Delete
    suspend fun deleteProduct(product: food_menu)

    @Query ("SELECT * FROM menu")
    fun getAllProducts():Flow<List<food_menu>>
}