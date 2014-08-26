package com.webapp.model;

import com.faplib.lib.admin.data.DataPreprocessor;
import com.faplib.lib.data.ConnectionFactory;

/**
 *
 * @author HuyenDo
 */
public class BaseModel extends DataPreprocessor {

    @Override
    public void open() throws Exception {
        if (mConnection == null || mConnection.isClosed()) {
            mConnection = ConnectionFactory.getConnection(ConnectionFactory.GroupType.ADMIN);
        }
    }

    
}
