package com.example.consumerapp.helper;

import android.database.Cursor;

import com.example.consumerapp.Note;

import java.util.ArrayList;

import static com.example.consumerapp.db.DatabaseContract.NoteColumns;

public class MappingHelper {
    public static ArrayList<Note> mapCursorToArrayList(Cursor noteCursor){
        ArrayList<Note> noteList = new ArrayList<>();

        while (noteCursor.moveToNext()){
            int id = noteCursor.getInt(noteCursor.getColumnIndexOrThrow(NoteColumns._ID));
            String title = noteCursor.getString(noteCursor.getColumnIndexOrThrow(NoteColumns.TITLE));
            String description = noteCursor.getString(noteCursor.getColumnIndexOrThrow(NoteColumns.DESCRIPTION));
            String date = noteCursor.getString(noteCursor.getColumnIndexOrThrow(NoteColumns.DATE));
            noteList.add(new Note(id, title, description, date));
        }
        return noteList;
    }

    public static Note mapCursorToObject(Cursor notesCursor){
        notesCursor.moveToFirst();
        int id          = notesCursor.getInt(notesCursor.getColumnIndexOrThrow(NoteColumns._ID));
        String title    = notesCursor.getString(notesCursor.getColumnIndexOrThrow(NoteColumns.TITLE));
        String description  = notesCursor.getString(notesCursor.getColumnIndexOrThrow(NoteColumns.DESCRIPTION));
        String date     = notesCursor.getString(notesCursor.getColumnIndexOrThrow(NoteColumns.DATE));

        return new Note(id, title, description, date);
    }
}
