package sample;

import dbUtil.dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginModel {

    Connection connection;


    //constuctor
    public loginModel(){
        try {
            this.connection = dbConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (this.connection == null) System.exit(1);
    }

    public boolean isDatabaseConnection(){
        return this.connection != null;
    }

    public boolean isLogin(String Username, String Password) throws SQLException {
        PreparedStatement pr = null;
        ResultSet rs = null;

        String sql = "select * from admin where username = ? and password = ?";
        try {
            pr = this.connection.prepareStatement(sql);
            pr.setString(1,Username);
            pr.setString(2,Password);

            rs = pr.executeQuery();
            if (rs.next()){
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        finally {
            pr.close();
            rs.close();
        }
    }


}//class
