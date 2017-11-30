package com.xinshen.attendancesystem;

/**
 * Created by thinkpad on 2017/10/25.
 */

public class Global {

    public static class Const{
        public static final String LOG_TAG = "attendanceSystemLog";
        //相关参数
        public static final int LOGIN_TIME = 3000;
        public static final String SET_NAME = "user";
        public static final int REQUEST_CODE = 1;
        //相机
        public static final int CAMERA_ID = 1;
        public static final int ROTATE = 0;
        //SP key
        public static final String KAY_EMPLOYEE = "key_employee";
        public static final String KEY_COMPANY_NAME = "ket_cmopany_name";
    }
    public static class Variable{
        public static String COMPANY_NAME;
    }
}