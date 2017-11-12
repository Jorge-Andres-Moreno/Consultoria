package com.jorgemoreno971.consulta_app.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jormo on 12/11/2017.
 */

public class QuerysDBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Querys.db";

    public QuerysDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public long saveQuery(Query query) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        return sqLiteDatabase.insert(
                QuerysContract.QueryEntry.TABLE_NAME,
                null,query.toContentValues());
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXIST" + QuerysContract.QueryEntry.TABLE_NAME + " ("
                + QuerysContract.QueryEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + QuerysContract.QueryEntry.ID + " TEXT NOT NULL,"
                + QuerysContract.QueryEntry.NAME + " TEXT NOT NULL,"
                + QuerysContract.QueryEntry.DESCRIPTION + " TEXT NOT NULL,"
                + QuerysContract.QueryEntry.DATE + " TEXT NOT NULL,"
                + QuerysContract.QueryEntry.STATUS + " TEXT NOT NULL,"
                + "UNIQUE (" + QuerysContract.QueryEntry.ID + "))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // No hay operaciones
    }
}
