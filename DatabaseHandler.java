package com.developer.harry.passwordcreator;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Harry on 12/18/2016.
 */
public class DatabaseHandler extends SQLiteOpenHelper{
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Master";
    private static final String TABLE = "Details";
    private static final String KEY_ID="id";
    private static final String USER="User";
    private static final String PASS="Password";

    public DatabaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    String create="CREATE TABLE"+TABLE+"("+KEY_ID+"INTEGER PRIMARY KEY,"+USER+"TEXT,"+PASS+"PASSWORD"+")";
        sqLiteDatabase.execSQL(create);
        sqLiteDatabase.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
     void addRecord(){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(USER,Password.getUser());
        values.put(PASS,Password.getPass());
        db.insert(TABLE,null,values);
        db.close();
    }
}
