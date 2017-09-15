package ua.goit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.goit.entity.*;
import ua.goit.services.BusinessPlanService;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Guillaume Gingembre on 15/09/2017.
 */

@Controller
@RequestMapping(value = "/businessplan")
public class ShowBusinessPlansController {

    private final BusinessPlanService businessPlansService;

    @Autowired
    public ShowBusinessPlansController(BusinessPlanService businessPlansService) {
        this.businessPlansService = businessPlansService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/show")
    public ModelAndView showBusinessPlans() {
        List<String> businessPlanNames =
                businessPlansService.findAll().stream().map(BusinessPlan::toString).collect(Collectors.toList());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("business plans");
        modelAndView.addObject("business plans", businessPlanNames);
        return modelAndView;
    }

    @PostConstruct
    public void initDefaultBusinessPlans() {

        System.out.println("creating default business plans");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Address addressKherson = new Address ("Kherson", Region.Kherson, Country.UKRAINE);
        Address addressOdessa = new Address ("Odessa", Region.Odessa, Country.UKRAINE);

        BigDecimal previousRounds = new BigDecimal(100000);
        BigDecimal raised = new BigDecimal(10000);
        BigDecimal mininv = new BigDecimal(1000);

        BusinessPlan businessplan1 = new BusinessPlan(2, addressKherson, "grow stuff in Kherson", "small production, I need scale",
                "stuff market in Ukraine","make more money", "get bigger", "big guys but i am better",
                "technical skills, organic, high quality", "grow organic and sell at a high price to premium shops",
                "acquire more land and machinery to grow scale", "God", "weather, raids, currency, economy",
                "really great returns", previousRounds, "real estate and machinery", "weburl", "docurl");

        BigDecimal previousRounds2 = new BigDecimal(300000);
        BigDecimal raised2 = new BigDecimal(20000);
        BigDecimal mininv2 = new BigDecimal(2000);

        BusinessPlan businessPlan2 = new BusinessPlan(3, addressOdessa, "export stuff from Odessa", "I need to expand",
                "export market","make more money", "get bigger", "big guys but i am better",
                "technical skills", "export products that big guys are too dumb to handle",
                "acquire more terminals and machinery to grow scale", "Fedex", "raids, currency, economy, politics",
                "really great returns", previousRounds2, "real estate and machinery", "weburl", "docurl");

        System.out.println("saving default business plans");

        businessPlansService.save(businessplan1);
        businessPlansService.save(businessPlan2);

        System.out.println("success!");

    }




}
