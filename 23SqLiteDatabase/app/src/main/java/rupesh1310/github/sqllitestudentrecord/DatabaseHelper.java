package rupesh1310.github.sqllitestudentrecord;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public final static String DATABASE_NAME = "MYSTUDENT.db";
    public final static String TABLE_NAME = "mystudent_table";
    public final static String COL_1 = "ID";
    public final static String COL_2 = "NAME";
    public final static String COL_3 = "EMAIL";
    public final static String COL_4 = "COURSE_COUNT";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS "
                + TABLE_NAME +
                "(ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "NAME TEXT, " +
                "EMAIL TEXT," +
                " COURSE_COUNT INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
