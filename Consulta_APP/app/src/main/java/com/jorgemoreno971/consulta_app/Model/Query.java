package com.jorgemoreno971.consulta_app.Model;

import java.util.Date;

/**
 * Created by jormo on 12/11/2017.
 */

public class Query {

    /**
     *
     */
    private int id;

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
    //private String status;

    /**
     *
     * @param name
     * @param description
     */
    public Query(int id,String name, String description){
        this.name = name;
        this.date = new Date();
        this.id = id;
        this.description = description;
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

}
