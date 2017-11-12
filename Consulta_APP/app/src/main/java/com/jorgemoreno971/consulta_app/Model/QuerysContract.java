package com.jorgemoreno971.consulta_app.Model;

import android.provider.BaseColumns;

/**
 * Created by Jorge Moreno on 12/11/2017.
 */

public class QuerysContract {

    /**
     *
     */
    public static abstract class QueryEntry implements BaseColumns {

        /**
         *
         */
        public final static String TABLE_NAME = "query";

        /**
         *
         */
        public final static String ID = "id";

        /**
         *
         */
        public final static String NAME = "name";

        /**
         *
         */
        public final static String DESCRIPTION = "description";

        /**
         *
         */
        public final static String DATE = "date";

        /**
         *
         */
        public final static String STATUS = "status";
    }
}
