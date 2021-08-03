package com.dio.live.service;

import com.dio.live.model.WorkDay;
import com.dio.live.repositoy.WorkDayRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Evandro
 */
@Service
public class WorkDayService {

    WorkDayRepository workDayRepository;

    @Autowired
    public WorkDayService(WorkDayRepository workDayRepository) {
        this.workDayRepository = workDayRepository;
    }

    public WorkDay saveWorkDay(WorkDay workDay) {
        return workDayRepository.save(workDay);
    }

    public List<WorkDay> findAll() {
        return workDayRepository.findAll();
    }

    public Optional<WorkDay> findById(Long workDayId) {
        return workDayRepository.findById(workDayId);
    }

    public WorkDay updateWorkDay(WorkDay workDay) {
        return workDayRepository.save(workDay);
    }

    public void deliteById(Long workDayId) {
        workDayRepository.deleteById(workDayId);
    }

}
