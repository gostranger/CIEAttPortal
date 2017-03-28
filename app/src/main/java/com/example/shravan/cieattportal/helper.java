package com.example.shravan.cieattportal;

import android.content.Intent;

import java.io.Serializable;

/**
 * Created by Ghostranger on 3/27/2017.
 */

public class helper implements Serializable { //helper
    private String username;
    private String password;
    private String types;

    public class dbaccess{  //helper.dbaccess
        public class online{  //helper.dbaccess.online

        }
        public class offlie{  //helper.dbaccess.offlie

        }
    }
    void helper()
    {

    }
    void helper(String types)
    {
        this.types = types;
    }

    void helper(String username, String password, String types)
    {
        this.username = username;
        this.password = password;
        this.types = types;
    }
}


