package com.example.alanzhu39.mycontactsapp;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class DataboardHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Contact2018.db";
    public static final String TABLE_NAME = "Contact2018_table";
    public static final String ID = "ID";
    public static final String COLUMN_NAME_CONTACT = "contact";
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    ID + " INTEGER PRIMARY KEY AUTOINCREMENT." +
                    COLUMN_NAME_CONTACT + " [TEXT}";


    public DataboardHelper(Context context, String name, SQLiteDatabase.CursorFactory factor, int version) {
        super(context,DATABASE_NAME,factory_null,DATABASE_VERSION);
        SQLiteDatabase = this.getWritableDatabase();
        Log.d( tag "MyContactApp", msg "Databasehelper: constructed Databasehelper");
    }
}
