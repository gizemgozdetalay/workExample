package com.gizemgozde.springdbservice.controller;

import com.gizemgozde.springdbservice.entity.Work;
import com.gizemgozde.springdbservice.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WorkController {
    @Autowired
    private WorkRepository workRepository;

    @PostMapping("/engineer")
    public void createWork(@RequestBody Work work) {
        workRepository.save(work);
    }
}
