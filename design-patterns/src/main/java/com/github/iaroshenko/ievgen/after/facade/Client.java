package com.github.iaroshenko.ievgen.after.facade;


import com.github.iaroshenko.ievgen.before.facade.dto.ScheduleService;

public class Client {

    public static void main(String[] args) {
        ScheduleService scheduleServer = new ScheduleService();
        ScheduleServerFacade scheduleServerFacade = new ScheduleServerFacade(scheduleServer);
        scheduleServerFacade.startServer();
        scheduleServerFacade.stopServer();

    }
}
