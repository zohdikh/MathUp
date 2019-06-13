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
        db.execSQL("create table IF NOT EXISTS level1w (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level2w (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level3w (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level4w (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level5w (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level6w (no1 INTEGER , no2 INTEGER , ope STRING)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
       db.execSQL("Drop table if EXISTS level1");
        db.execSQL("Drop table if EXISTS level2");
        db.execSQL("Drop table if EXISTS level3");
        db.execSQL("Drop table if EXISTS level4");
        db.execSQL("Drop table if EXISTS level5");
        db.execSQL("Drop table if EXISTS level6");
        db.execSQL("Drop table if EXISTS level1w");
        db.execSQL("Drop table if EXISTS level2w");
        db.execSQL("Drop table if EXISTS level3w");
        db.execSQL("Drop table if EXISTS level4w");
        db.execSQL("Drop table if EXISTS level5w");
        db.execSQL("Drop table if EXISTS level6w");
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


    public void InsertRowlvl1w(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("level1w",null,contentValues);
    }
    public void InsertRowlvl2w(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("level2w",null,contentValues);
    }
    public void InsertRowlvl3w(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("level3w",null,contentValues);
    }
    public void InsertRowlvl4w(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("level4w",null,contentValues);
    }
    public void InsertRowlvl5w(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("level5w",null,contentValues);
    }
    public void InsertRowlvl6w(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("level6w",null,contentValues);
    }

}
