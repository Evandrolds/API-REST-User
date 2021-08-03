package com.dio.live.controller;

import com.dio.live.model.WorkDay;
import com.dio.live.service.WorkDayService;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Evandro
 */
@RestController
@RequestMapping("/workday")
public class WorkDayController {

    @Autowired
    WorkDayService workDayService;

    @PostMapping("/create")
    public WorkDay createWorkDay(@RequestBody WorkDay workDay) {

        return workDayService.saveWorkDay(workDay);
    }

    @GetMapping
    public List<WorkDay> getListWorDay() {
        return workDayService.findAll();
    }

    @GetMapping("/{workDayId}")
    public ResponseEntity<WorkDay> getWorkDayById(@PathVariable("/{workDayId}") Long workDayId) throws Exception {
        return ResponseEntity.ok(workDayService.findById(workDayId).orElseThrow(() -> new NoSuchElementException("Was not found")));

    }

    @DeleteMapping("/{deleteworkDayId}")
    public ResponseEntity<WorkDay> deleteWorkDayById(@PathVariable("/{deleteworkDayId}") Long deleteworkDayId) throws Exception {
        try {
            workDayService.deliteById(deleteworkDayId);
        } catch (Exception e) {
            System.out.println(HttpStatus.GONE + "Was not deleted " + e.getMessage());

        }

        return (ResponseEntity<WorkDay>) ResponseEntity.ok();

    }

    @PutMapping
    public WorkDay updateWorkDay(@RequestBody WorkDay updateWorkDay) {
        return workDayService.updateWorkDay(updateWorkDay);
    }

}
