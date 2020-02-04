package db;

import android.provider.BaseColumns;

public class DatabaseContract {
    public static String TABLE_NAME = "notes";

    public static final class NoteColumns implements BaseColumns {

        public static String _ID = "id";
        public static String TITLE = "title";
        public static String DESCRIPTION = "description";
        public static String DATE = "date";

    }
}
