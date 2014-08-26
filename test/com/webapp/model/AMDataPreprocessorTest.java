package com.webapp.model;

import com.faplib.lib.admin.data.AMDataPreprocessor;
import java.sql.Connection;

/**
 *
 * @author HuyenDo
 */


public class AMDataPreprocessorTest {
    public static void main(String args[]) throws Exception {
        AMDataPreprocessor processor = new AMDataPreprocessor();
        processor.open();
        Connection conn = processor.getConnection();
        System.out.println(conn);
    }
}
