package ua.goit.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Guillaume Gingembre on 13/09/2017.
 */

//@Entity
//@Table(name = "projects")
public class Project { // name it Project

    //
/*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private long projectId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "project_industry") // do enum of 10 industries
    private String projectIndustry;

    @Column(name = "project_address") // do a class address
    private Address projectAddress;

    @Column(name = "project_description")
    private String projectDescription;

    @Column(name = "project_logo_link")
    private String logoLink;

    @Column(name = "project_doc_link")
    private String projectDocLink;

    @Column(name = "project_site_link")
    private String projectSiteLink;

    @Column(name = "project_expected_raise")
    private BigDecimal projectExpectedRaise;

    @Column(name = "project_amount_raised")
    private BigDecimal projectAmountRaised;

    @Column(name = "project_min_inv")
    private BigDecimal projectMinInv;

    @Column(name = "project_return")
    private long projectReturn;

    @Column(name = "project_last_change")
    private LocalDate projectLastChange;

    @Column(name = "isActive")
    private boolean isActive;

    public Project(){}

    public Project(String projectName, String projectIndustry, Address projectAddress, String projectDescription, String logoLink, String projectDocLink, String projectSiteLink, BigDecimal projectExpectedRaise, BigDecimal projectAmountRaised, BigDecimal projectMinInv, long projectReturn, LocalDate projectLastChange, boolean isActive) {
        this.projectName = projectName;
        this.projectIndustry = projectIndustry;
        this.projectAddress = projectAddress;
        this.projectDescription = projectDescription;
        this.logoLink = logoLink;
        this.projectDocLink = projectDocLink;
        this.projectSiteLink = projectSiteLink;
        this.projectExpectedRaise = projectExpectedRaise;
        this.projectAmountRaised = projectAmountRaised;
        this.projectMinInv = projectMinInv;
        this.projectReturn = projectReturn;
        this.projectLastChange = projectLastChange;
        this.isActive = isActive;
    }



    // one start up may have many business plans, and one business plan may have many start ups: many to many

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<BusinessPlan> businessPlans = new HashSet<BusinessPlan>(0);

    @JoinTable(name = "startups_businessplans", joinColumns = {
            @JoinColumn(name = "startUpId", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "businessplan_id",
                    nullable = false, updatable = false) })



    public long getStartUpId() {
        return startUpId;
    }

    public void setStartUpId(long startUpId) {
        this.startUpId = startUpId;
    }

    public String getStartUpName() {
        return startUpName;
    }

    public void setStartUpName(String startUpName) {
        this.startUpName = startUpName;
    }

    public String getStartUpIndustry() {
        return startUpIndustry;
    }

    public void setStartUpIndustry(String startUpIndustry) {
        this.startUpIndustry = startUpIndustry;
    }

    public String getStartUpDescription() {
        return startUpDescription;
    }

    public void setStartUpDescription(String startUpDescription) {
        this.startUpDescription = startUpDescription;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getStartUpDoc() {
        return startUpDoc;
    }

    public void setStartUpDoc(String startUpDoc) {
        this.startUpDoc = startUpDoc;
    }

    public String getStartUpSite() {
        return startUpSite;
    }

    public void setStartUpSite(String startUpSite) {
        this.startUpSite = startUpSite;
    }

    public long getStartUpExpectedRaise() {
        return startUpExpectedRaise;
    }

    public void setStartUpExpectedRaise(long startUpExpectedRaise) {
        this.startUpExpectedRaise = startUpExpectedRaise;
    }

    public long getStartUpMinInv() {
        return startUpMinInv;
    }

    public void setStartUpMinInv(long startUpMinInv) {
        this.startUpMinInv = startUpMinInv;
    }

    public long getStartUpIrr() {
        return startUpIrr;
    }

    public void setStartUpIrr(long startUpIrr) {
        this.startUpIrr = startUpIrr;
    }

    public LocalDate getStartUpLastChange() {
        return startUpLastChange;
    }

    public void setStartUpLastChange(LocalDate startUpLastChange) {
        this.startUpLastChange = startUpLastChange;
    }

    public boolean isStartUpActive() {
        return startUpActive;
    }

    public void setStartUpActive(boolean startUpActive) {
        this.startUpActive = startUpActive;
    }

    public String getStartUpRegion() {
        return startUpRegion;
    }

    public void setStartUpRegion(String startUpRegion) {
        this.startUpRegion = startUpRegion;
    }

    @Override
    public String toString() {
        return "Project{" +
                "startUpId=" + startUpId +
                ", startUpName='" + startUpName + '\'' +
                ", startUpIndustry='" + startUpIndustry + '\'' +
                ", startUpDescription='" + startUpDescription + '\'' +
                ", logo='" + logo + '\'' +
                ", startUpDoc='" + startUpDoc + '\'' +
                ", startUpSite='" + startUpSite + '\'' +
                ", startUpExpectedRaise='" + startUpExpectedRaise + '\'' +
                ", startUpMinInv='" + startUpMinInv + '\'' +
                ", startUpIrr='" + startUpIrr + '\'' +
                ", startUpLastChange=" + startUpLastChange +
                ", startUpActive=" + startUpActive +
                '}';
    }

    */
}
