package ua.goit.dao;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.goit.entity.Project;

import java.util.List;


/**
 * Created by Guillaume Gingembre on 13/09/2017.
 */

/**
 * Data access object for {@link Project}
 */

public interface ProjectDao extends JpaRepository<Project, String>{

    /*Project findByName(String name);
    List<Project> findByIndustry(String industry);
    List<Project> findByRegion(String region);
    List<Project> findByInvSize(long invSize);
    List<Project> findByMinIrr(long minIrr);
    List<Project> findActive();*/

}
