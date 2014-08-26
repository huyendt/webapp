package com.webapp.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HuyenDo
 */


public class DatabaseUtil {
    public static int getSequenceValue(Connection conn, String sequenceName) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String strSQL = "SELECT " + sequenceName + ".nextval FROM dual";

        try {
            stmt = conn.prepareStatement(strSQL);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } finally {
            try {
                rs.close();
            } catch (Exception e) {                
            }
            
            try {
                stmt.close();
            } catch (Exception e) {
                
            }
        }        
        return 0;
    }
}
