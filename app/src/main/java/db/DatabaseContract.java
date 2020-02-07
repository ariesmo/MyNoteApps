package db;

import android.net.Uri;
import android.provider.BaseColumns;

public final class DatabaseContract {

    public static final String AUTHORITY = "com.example.mynotesapp";
    private static final String SCHEME = "content";

    private DatabaseContract(){};

    public static String TABLE_NAME = "notes";

    public static final class NoteColumns implements BaseColumns {

        public static String _ID = "id";
        public static String TITLE = "title";
        public static String DESCRIPTION = "description";
        public static String DATE = "date";

        //    untuk membuat URi content: com.example.mynotesapp/note
        public static final Uri CONTENT_URI = new Uri.Builder().scheme(SCHEME).authority(AUTHORITY).appendPath(TABLE_NAME).build();

    }


}
