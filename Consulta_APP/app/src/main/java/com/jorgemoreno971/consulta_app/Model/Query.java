package com.jorgemoreno971.consulta_app.Model;

import android.content.ContentValues;

import java.util.Date;

/**
 * Created by Jorge Moreno on 12/11/2017.
 */

public class Query {

    /**
     *
     */
    public final static String STATE_WAIT = "wait";

    /**
     *
     */
    public final static String STATE_SEND = "send";

    /**
     *
     */
    public final static String STATE_ATTENDED = "attended";

    /**
     *
     */
    public final static String STATE_SOLVE = "solve";

    /**
     *
     */
    private int id;

    /**
     *
     */
    private String status;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private Date date;

    /**
     *
     */
    private String description;

    /**
     *
     * @param name
     * @param description
     */
    public Query(int id,String name, String description , String status){
        this.name = name;
        this.date = new Date();
        this.id = id;
        this.description = description;
        this.status = status;
    }

    /**
     *
     */
    public Query(){

    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     *
     * @return
     */
    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(QuerysContract.QueryEntry.ID, id);
        values.put(QuerysContract.QueryEntry.NAME, name);
        values.put(QuerysContract.QueryEntry.DESCRIPTION, description);
        values.put(QuerysContract.QueryEntry.DATE, date.toString());
        values.put(QuerysContract.QueryEntry.STATUS, status);
        return values;
    }
}
