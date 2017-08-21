package com.spic.springmvc.dao;

import com.spic.springmvc.model.*;

import java.util.List;

public interface selectMysqlService {

    public List<modelHardDiskStatic> selectHardDiskStatic();
    public modelHardDiskStatic findByCustomerId(int custId);
}
