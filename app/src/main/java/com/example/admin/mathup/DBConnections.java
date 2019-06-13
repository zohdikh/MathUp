package com.example.admin.mathup;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBConnections extends SQLiteOpenHelper {
   public static  final String DbName = "MathUp.db";
    public static final int Version=1;
   public DBConnections(Context context){
       super(context , DbName,null,Version);
   }

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL("create table IF NOT EXISTS level1 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level2 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level3 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level4 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level5 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level6 (no1 INTEGER , no2 INTEGER , ope STRING)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
       db.execSQL("Drop table if EXISTS level1");
        db.execSQL("Drop table if EXISTS level2");
        db.execSQL("Drop table if EXISTS level3");
        db.execSQL("Drop table if EXISTS level4");
        db.execSQL("Drop table if EXISTS level5");
        db.execSQL("Drop table if EXISTS level6");
        onCreate(db);
    }
    public void InsertRowlvl1(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("level1",null,contentValues);
    }
    public void InsertRowlvl2(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("level2",null,contentValues);
    }
    public void InsertRowlvl3(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("level3",null,contentValues);
    }
    public void InsertRowlvl4(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("level4",null,contentValues);
    }
    public void InsertRowlvl5(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("level5",null,contentValues);
    }
    public void InsertRowlvl6(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("level6",null,contentValues);
    }
    
}
