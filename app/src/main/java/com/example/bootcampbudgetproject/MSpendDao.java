package com.example.bootcampbudgetproject;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.bootcampbudgetproject.models.MSpend;

@Dao
public interface MSpendDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(MSpend mSpend);

    @Update
    void update(MSpend mSpend);

    @Delete
    void delete(MSpend mSpend);

    @Query("DELETE FROM spend_table") // entitty olarak verilen tablo adını girilmiş
    void deleteAll();
}
