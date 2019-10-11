package com.platform.task.api.impl;

import com.platform.task.api.PlatformProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.task.api.PlatformTaskService;

@Service
public class PlatformTaskServiceImpl implements PlatformTaskService {

    private PlatformProcessService platformProcessService;

    @Autowired
    public PlatformTaskServiceImpl(PlatformProcessService platformProcessService) {
        this.platformProcessService = platformProcessService;
    }
}
