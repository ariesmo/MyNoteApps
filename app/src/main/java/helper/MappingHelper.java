package helper;

import android.database.Cursor;

import com.example.mynotesapp.Note;

import java.util.ArrayList;

import static db.DatabaseContract.NoteColumns;

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
}
