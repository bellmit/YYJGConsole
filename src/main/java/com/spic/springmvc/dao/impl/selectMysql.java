package com.spic.springmvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import com.spic.springmvc.dao.selectMysqlService;
import com.spic.springmvc.model.modelHardDiskStatic;
import org.springframework.stereotype.Service;

public class selectMysql implements selectMysqlService {

    modelHardDiskStatic modelharddiskstatic;
    private DataSource dataSource;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setmodelHardDiskStatic(modelHardDiskStatic modelharddiskstatic) {
        this.modelharddiskstatic = modelharddiskstatic;
    }

    public modelHardDiskStatic findByCustomerId(int IDKEY){

        String sql = "SELECT * FROM CUSTOMER WHERE IDKEY = ?";

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, IDKEY);
            modelHardDiskStatic customer = null;
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                customer = new modelHardDiskStatic(
                        rs.getString("serverIP"),
                        rs.getString("driveLetter"),
                        rs.getString("maxCapacity"),
                        rs.getString("usedCapacity"),
                        rs.getString("systemTime"));
            }
            rs.close();
            ps.close();
            return customer;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }



    public List<modelHardDiskStatic> selectHardDiskStatic(){


        return null;
    }
}
