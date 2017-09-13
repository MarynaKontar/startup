package ua.goit.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Guillaume Gingembre on 12/09/2017.
 */

//@Entity
//@Table(name = "businessplans")
public class BusinessPlan {
/*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "businessplan_id")
    private long businessplan_id;

    // one start up may have many business plans, many to one relationship
    //@ManyToOne(cascade = CascadeType.ALL)
    @Column(name = "project_id")
    private String projectId;

    @Column(name = "idea")
    private String idea;

    @Column(name = "current_state")
    private String currentState;

    @Column(name = "market")
    private String market;

    @Column(name = "opportunity")
    private String opportunity;

    @Column(name = "solution")
    private String solution;

    @Column(name = "competition")
    private String competition;

    @Column(name = "usp")
    private String usp;

    @Column(name = "business_model")
    private String businessModel;

    @Column(name = "funds_uses")
    private String fundsUses;

    @Column(name = "mentors")
    private String mentors;

    @Column(name = "risks")
    private String risks;

    @Column(name = "finances")
    private String finances;

    @Column(name = "previous_rounds")
    private String previousRounds;

    @Column(name = "collateral")
    private String collateral;

    @Column(name = "weburl")
    private String weburl;

    @Column(name = "docurl")
    private String docurl;


    public BusinessPlan (){}

    public BusinessPlan(String startUpId, String idea, String currentState, String market, String opportunity, String solution, String competition, String usp, String businessModel, String fundsUses, String mentors, String risks, String finances, String previousRounds, String collateral, String weburl, String docurl) {
        this.startUpId = startUpId;
        this.idea = idea;
        this.currentState = currentState;
        this.market = market;
        this.opportunity = opportunity;
        this.solution = solution;
        this.competition = competition;
        this.usp = usp;
        this.businessModel = businessModel;
        this.fundsUses = fundsUses;
        this.mentors = mentors;
        this.risks = risks;
        this.finances = finances;
        this.previousRounds = previousRounds;
        this.collateral = collateral;
        this.weburl = weburl;
        this.docurl = docurl;
    }



    // many to many relationship mapping:

    @ManyToMany(mappedBy = "businessplans")
    private Collection<Project> projects;

    public long getBusinessplan_id() {
        return businessplan_id;
    }

    public void setBusinessplan_id(long businessplan_id) {
        this.businessplan_id = businessplan_id;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(String opportunity) {
        this.opportunity = opportunity;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getUsp() {
        return usp;
    }

    public void setUsp(String usp) {
        this.usp = usp;
    }

    public String getBusinessModel() {
        return businessModel;
    }

    public void setBusinessModel(String businessModel) {
        this.businessModel = businessModel;
    }

    public String getFundsUses() {
        return fundsUses;
    }

    public void setFundsUses(String fundsUses) {
        this.fundsUses = fundsUses;
    }

    public String getMentors() {
        return mentors;
    }

    public void setMentors(String mentors) {
        this.mentors = mentors;
    }

    public String getRisks() {
        return risks;
    }

    public void setRisks(String risks) {
        this.risks = risks;
    }

    public String getFinances() {
        return finances;
    }

    public void setFinances(String finances) {
        this.finances = finances;
    }

    public String getPreviousRounds() {
        return previousRounds;
    }

    public void setPreviousRounds(String previousRounds) {
        this.previousRounds = previousRounds;
    }

    public String getCollateral() {
        return collateral;
    }

    public void setCollateral(String collateral) {
        this.collateral = collateral;
    }

    public String getStartUpId() {
        return startUpId;
    }

    public void setStartUpId(String startUpId) {
        this.startUpId = startUpId;
    }

    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl;
    }

    public String getDocurl() {
        return docurl;
    }

    public void setDocurl(String docurl) {
        this.docurl = docurl;
    }

    @Override
    public String toString() {
        return "BusinessPlan{" +
                "businessplan_id=" + businessplan_id +
                ", startUpId='" + startUpId + '\'' +
                ", idea='" + idea + '\'' +
                ", currentState='" + currentState + '\'' +
                ", market='" + market + '\'' +
                ", opportunity='" + opportunity + '\'' +
                ", solution='" + solution + '\'' +
                ", competition='" + competition + '\'' +
                ", usp='" + usp + '\'' +
                ", businessModel='" + businessModel + '\'' +
                ", fundsUses='" + fundsUses + '\'' +
                ", mentors='" + mentors + '\'' +
                ", risks='" + risks + '\'' +
                ", finances='" + finances + '\'' +
                ", previousRounds='" + previousRounds + '\'' +
                ", collateral='" + collateral + '\'' +
                ", weburl='" + weburl + '\'' +
                ", docurl='" + docurl + '\'' +
                '}';
    }

    */
}
