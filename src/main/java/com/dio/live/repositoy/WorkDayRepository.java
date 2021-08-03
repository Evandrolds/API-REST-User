
package com.dio.live.repositoy;

import com.dio.live.model.WorkDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Evandro
 */
@Repository
public interface WorkDayRepository extends JpaRepository<WorkDay, Long>{
    
}
