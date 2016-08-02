package com.lmntrx.basilarackal.munchits;

/***
 * Created by livin on 2/8/16.
 */
public class User {

    static String USER_ID="", PASSWORD="";

    public static boolean checkValidity(String userID, String password){
        boolean validity = false;
        //TODO: Check validity in database
        //if true
            setUserIDandPassword(userID,password);
            /*validity = true;
        //else
            validity = false;*/
        return validity;
    }

    public static String getUserId() {
        return USER_ID;
    }

    private static void setUserIDandPassword(String userID, String password){
        USER_ID = userID;
        PASSWORD = password; //TODO: hash password later
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String PASSWORD) {
        User.PASSWORD = PASSWORD;
        DatabaseManager.User.changePassword(PASSWORD);
    }

    public static void setUserId(String userId) {
        USER_ID = userId;
    }
}
