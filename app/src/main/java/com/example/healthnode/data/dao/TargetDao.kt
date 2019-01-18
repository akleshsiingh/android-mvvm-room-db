package com.example.healthnode.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.example.healthnode.data.entity.Target
import io.reactivex.Single

@Dao
abstract class TargetDao {

    @Query("SELECT * FROM Target")
    abstract fun selectAll(): Single<List<Target>>
}