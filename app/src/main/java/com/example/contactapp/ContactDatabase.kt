package com.example.contactapp

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ContactEntity::class] , version = 1, exportSchema = false)
abstract class ContactDatabase:RoomDatabase() {
    abstract fun contactDao(): contactDAO
}