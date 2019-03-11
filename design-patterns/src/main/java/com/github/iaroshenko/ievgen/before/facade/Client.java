package com.github.iaroshenko.ievgen.before.facade;


import com.github.iaroshenko.ievgen.before.facade.dto.ScheduleService;

public class Client {
    private static ScheduleService scheduleServer = new ScheduleService();

    public static void main(String[] args) {
//        Execute to start service
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
//        Execute to stop service
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }
}
