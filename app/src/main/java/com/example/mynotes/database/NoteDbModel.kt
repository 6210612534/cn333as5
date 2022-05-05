package com.example.mynotes.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "color_id") val colorId: Long,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
) {
    companion object {
        val DEFAULT_NOTES = listOf(
            NoteDbModel(1, "Anna Jame", "0656251147",  1, 2,false),
            NoteDbModel(2, "Bob Lope", "0854629873",  2, 2,false),
            NoteDbModel(3, "Mike Ronny", "0924478952",  3, 2,false),
            NoteDbModel(4, "Tim Cook", "0985623415", 4,2, false),
        )
    }
}
