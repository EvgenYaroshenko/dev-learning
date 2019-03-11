package com.github.iaroshenko.ievgen.after.facade;

import com.github.iaroshenko.ievgen.before.facade.dto.ScheduleService;

public class ScheduleServerFacade {
    private ScheduleService scheduleServer;

    public ScheduleServerFacade(ScheduleService scheduleServer) {
        this.scheduleServer = scheduleServer;
    }

    public void startServer(){
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
    }

    public void stopServer() {
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }
}
