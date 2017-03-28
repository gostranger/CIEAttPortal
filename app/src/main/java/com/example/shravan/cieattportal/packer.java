package com.example.shravan.cieattportal;

import android.content.Intent;

public class packer {
    Intent packIt(Intent i, helper obj){
        return i.putExtra("Bundle",obj);
    }

    helper unPackIt(Intent i){
        return (helper)i.getSerializableExtra("Bundle");
    }
}
