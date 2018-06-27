package com.atguigu;


import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * Created by Administrator on 2018/5/19.
 */
public class HIve extends UDF {


        public String evaluate (final String s) {

            if (s == null) {
                return null;
            }

            return s.toString().toLowerCase();
        }

}
