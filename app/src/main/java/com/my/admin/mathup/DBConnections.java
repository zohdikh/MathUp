package com.my.admin.mathup;
import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

public class DBConnections extends SQLiteOpenHelper {
   public static  final String DbName = "MathUp.db";
    public static final int Version=1;
   public DBConnections(Context context){
       super(context , DbName,null,Version);
   }

    @Override
    public void onCreate(SQLiteDatabase db)
    {

        db.execSQL("create table IF NOT EXISTS level1 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level2 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level3 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level4 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level5 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS level6 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS Flevel1 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS Flevel2 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS Flevel3 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS Flevel4 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS Flevel5 (no1 INTEGER , no2 INTEGER , ope STRING)");
        db.execSQL("create table IF NOT EXISTS Flevel6 (no1 INTEGER , no2 INTEGER , ope STRING)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("Drop table if EXISTS level1");
        db.execSQL("Drop table if EXISTS level2");
        db.execSQL("Drop table if EXISTS level3");
        db.execSQL("Drop table if EXISTS level4");
        db.execSQL("Drop table if EXISTS level5");
        db.execSQL("Drop table if EXISTS level6");
        db.execSQL("Drop table if EXISTS Flevel1");
        db.execSQL("Drop table if EXISTS Flevel2");
        db.execSQL("Drop table if EXISTS Flevel3");
        db.execSQL("Drop table if EXISTS Flevel4");
        db.execSQL("Drop table if EXISTS Flevel5");
        db.execSQL("Drop table if EXISTS Flevel6");
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
        db.insert("Flevel1",null,contentValues);
    }
    public void InsertRowlvl2w(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("Flevel2",null,contentValues);
    }
    public void InsertRowlvl3w(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("Flevel3",null,contentValues);
    }
    public void InsertRowlvl4w(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("Flevel4",null,contentValues);
    }
    public void InsertRowlvl5w(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("Flevel5",null,contentValues);
    }
    public void InsertRowlvl6w(int no1,int no2,String ope)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("no1",no1);
        contentValues.put("no2",no2);
        contentValues.put("ope",ope);
        db.insert("Flevel6",null,contentValues);
    }
    public long Count(String lvl)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        SQLiteStatement statement;
        SQLiteStatement statementw;
        long count ,countw=2;
        double x=0,y=0;

        switch (lvl) {
            case "1":
                count = DatabaseUtils.queryNumEntries(db, "level1");
                //  statementw = db.compileStatement("SELECT COUNT(*) FROM Flevel1");
               // countw = statementw.simpleQueryForLong();
                break;
            case "2":
                count = DatabaseUtils.queryNumEntries(db, "level2");
               // statementw = db.compileStatement("SELECT COUNT(*) FROM Flevel2");
               // countw = statementw.simpleQueryForLong();
                break;
            case "3":
                count = DatabaseUtils.queryNumEntries(db, "level3");
               // statementw = db.compileStatement("SELECT COUNT(*) FROM Flevel3");
               // countw = statementw.simpleQueryForLong();
                break;
            case "4":
                count = DatabaseUtils.queryNumEntries(db, "level4");
               // statementw = db.compileStatement("SELECT COUNT(*) FROM Flevel4");
               // countw = statementw.simpleQueryForLong();
                break;
            case "5":
                count = DatabaseUtils.queryNumEntries(db, "level5");
               // statementw = db.compileStatement("SELECT COUNT(*) FROM Flevel5");
               // countw = statementw.simpleQueryForLong();
                break;
            case "6":
                count = DatabaseUtils.queryNumEntries(db, "level6");
               // statementw = db.compileStatement("SELECT COUNT(*) FROM Flevel6");
               // countw = statementw.simpleQueryForLong();
                break;
             default:
                 count=1;
                 countw=1;
        }
        db.close();
        x=(double) count;
        y=(double) countw;
        double stat=(x/(x+y))*100 ;
        return (int)(count);
    }
    public long getProfilesCount() {
        SQLiteDatabase db = this.getReadableDatabase();
        long count = DatabaseUtils.queryNumEntries(db, "level5");
        db.close();
        return count;
    }

}
