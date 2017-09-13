package ua.goit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ua.goit.entity.StartUp;

import java.util.List;


/**
 * Created by Guillaume Gingembre on 13/09/2017.
 */

/**
 * Data access object for {@link ua.goit.entity.StartUp}
 */

public interface StartUpDao extends JpaRepository<StartUp, String>{

    StartUp findByName(String name);
    List<StartUp> findByIndustry(String industry);
    List<StartUp> findByRegion(String region);
    List<StartUp> findByInvSize(long invSize);
    List<StartUp> findByMinIrr(long minIrr);
    List<StartUp> findActive();

}
