package com.jorgemoreno971.consulta_app.Model;

import java.util.Date;

/**
 * Created by jormo on 12/11/2017.
 */

public class Query {

    /**
     * 
     */
    private String id;

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
    public Query(String name, String description){
        this.name = name;
        this.date = new Date();
        this.id = ""+date.getDay()+date.getHours()+date.getMinutes()+date.getSeconds();
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
    public String getId() {
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
