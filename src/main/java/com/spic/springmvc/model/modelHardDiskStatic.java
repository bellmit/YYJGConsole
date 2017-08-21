package com.spic.springmvc.model;

public class modelHardDiskStatic {
    String serverIP;        //服务器ip
    String driveLetter;     //盘符
    String maxCapacity;     //磁盘容量
    String usedCapacity;    //已用容量
    String systemTime;      //系统时间

    public modelHardDiskStatic(String serverIP, String driveLetter, String maxCapacity, String usedCapacity, String systemTime) {
        this.serverIP = serverIP;
        this.driveLetter = driveLetter;
        this.maxCapacity = maxCapacity;
        this.usedCapacity = usedCapacity;
        this.systemTime = systemTime;
    }


    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP;
    }

    public String getDriveLetter() {
        return driveLetter;
    }

    public void setDriveLetter(String driveLetter) {
        this.driveLetter = driveLetter;
    }

    public String getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(String maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(String usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public String getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }
}
