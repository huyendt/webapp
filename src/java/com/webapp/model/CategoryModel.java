package com.webapp.model;

import com.faplib.lib.admin.data.AMDataPreprocessor;
import com.webapp.entity.Category;
import com.webapp.util.DatabaseUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HuyenDo
 */


public class CategoryModel extends AMDataPreprocessor {
    public List<Category> getAll() throws Exception {
        List<Category> categories = new ArrayList<Category> ();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String strSQL = "SELECT category_id, category_name, status WHERE CATEGORY";
        try {
            open();
            stmt = getConnection().prepareStatement(strSQL);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                category.setCategoryId(rs.getInt("category_id"));
                category.setCategoryName(rs.getString("category_name"));
                category.setStatus(rs.getInt("status"));
                categories.add(category);
            }
        } finally {
            close(rs);
            close(stmt);
            close();
        }
        return categories;
    }
    
    public void add(Category category) throws Exception {
        PreparedStatement stmt = null;        
        String strSQL = "INSERT INTO CATEGORY(category_id, category_name, status) VALUES (?, ?, ?)";
        try {
            open();            
            category.setCategoryId(DatabaseUtil.getSequenceValue(mConnection, strSQL));
            
            stmt = getConnection().prepareStatement(strSQL);            
            
            stmt.setInt(1, category.getCategoryId());
            stmt.setString(2, category.getCategoryName());
            stmt.setInt(3, category.getStatus());            
            stmt.executeUpdate();
        } finally {
            close(stmt);
            close();
        }
    }
    
    public void update(Category category) throws Exception {
        PreparedStatement stmt = null;        
        String strSQL = "UPDATE CATEGORY SET category_name = ?, status = ? WHERE category = ?";
        try {
            open();                        
            stmt = getConnection().prepareStatement(strSQL);                        
            stmt.setString(1, category.getCategoryName());
            stmt.setInt(2, category.getStatus());            
            stmt.setInt(3, category.getCategoryId());
            stmt.executeUpdate();
        } finally {
            close(stmt);
            close();
        }
    }
    
    public void delete(Category category) throws Exception {
        PreparedStatement stmt = null;        
        String strSQL = "DELETE CATEGORY WHERE category = ?";
        try {
            open();                        
            stmt = getConnection().prepareStatement(strSQL);                                    
            stmt.setInt(1, category.getCategoryId());
            stmt.executeUpdate();
        } finally {
            close(stmt);
            close();
        }
    }
}
