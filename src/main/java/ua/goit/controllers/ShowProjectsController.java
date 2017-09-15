package ua.goit.controllers;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.goit.entity.*;
import ua.goit.services.ProjectService;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Guillaume Gingembre on 15/09/2017.
 */

@Controller
@RequestMapping(value = "/project")
public class ShowProjectsController {

    private final ProjectService projectsService;

    @Autowired
    public ShowProjectsController(ProjectService projectsService) {
        this.projectsService = projectsService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/show")
    public ModelAndView showProjects() {
        List<String> projectnames =
                projectsService.findAll().stream().map(Project::toString).collect(Collectors.toList());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("projects");
        modelAndView.addObject("projects", projectnames);
        return modelAndView;
    }

    @PostConstruct
    public void initDefaultProjects() {

        System.out.println("creating default projects");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Address addressKherson = new Address ("Kherson", Region.Kherson, Country.UKRAINE);
        Address addressOdessa = new Address ("Odessa", Region.Odessa, Country.UKRAINE);

        BigDecimal inv = new BigDecimal(100000);
        BigDecimal raised = new BigDecimal(10000);
        BigDecimal mininv = new BigDecimal(1000);

        Project project1 = new Project ("Kherson Farm", Industry.Agriculture, addressKherson,
                "Grow stuff in Kherson","logourl", "docurl", "weburl",
                inv, raised, mininv, 20, LocalDate.parse("10/09/2017", formatter), true);

        BigDecimal inv2 = new BigDecimal(200000);
        BigDecimal raised2 = new BigDecimal(20000);
        BigDecimal mininv2 = new BigDecimal(2000);

        Project project2 = new Project ("Odessa Terminal", Industry.Transportation, addressOdessa,
                "Export stuff from Odessa","logourl", "docurl", "weburl",
                inv2, raised2, mininv2, 30, LocalDate.parse("15/09/2017", formatter), true);

        System.out.println("saving default projects");

        projectsService.save(project1);
        projectsService.save(project2);

        System.out.println("success!");

    }

}