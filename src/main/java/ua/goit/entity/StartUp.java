package ua.goit.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Guillaume Gingembre on 13/09/2017.
 */

@Entity
@Table(name = "startups")
public class StartUp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "startup_id")
    private long startUpId;

    @Column(name = "startup_name")
    private String startUpName;

    @Column(name = "startup_industry")
    private String startUpIndustry;

    @Column(name = "startup_region")
    private String startUpRegion;

    @Column(name = "startup_description")
    private String startUpDescription;

    @Column(name = "startup_logo")
    private String logo;

    @Column(name = "startup_doc")
    private String startUpDoc;

    @Column(name = "startup_site")
    private String startUpSite;

    @Column(name = "startup_expected_raise")
    private long startUpExpectedRaise;

    @Column(name = "startup_min_inv")
    private long startUpMinInv;

    @Column(name = "startup_irr")
    private long startUpIrr;

    @Column(name = "startup_last_change")
    private LocalDate startUpLastChange;

    @Column(name = "startup_active")
    private boolean startUpActive;

    public StartUp (){}

    public StartUp(String startUpName, String startUpIndustry, String startUpRegion, String startUpDescription, String logo, String startUpDoc, String startUpSite, long startUpExpectedRaise, long startUpMinInv, long startUpIrr, LocalDate startUpLastChange, boolean startUpActive) {
        this.startUpName = startUpName;
        this.startUpIndustry = startUpIndustry;
        this.startUpRegion = startUpRegion;
        this.startUpDescription = startUpDescription;
        this.logo = logo;
        this.startUpDoc = startUpDoc;
        this.startUpSite = startUpSite;
        this.startUpExpectedRaise = startUpExpectedRaise;
        this.startUpMinInv = startUpMinInv;
        this.startUpIrr = startUpIrr;
        this.startUpLastChange = startUpLastChange;
        this.startUpActive = startUpActive;
    }

    // one start up may have many business plans, many to one relationship


    /*

    IN CASE WE DECIDE MANY TO MANY, HERE IS THE CODE...
    But I prefer many business plans to one start up (i.e. each business plan has just one start up, but a start up
    may have many business plans).

    // one start up may have many business plans, and one business plan may have many start ups: many to many

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<BusinessPlan> businessPlans = new HashSet<BusinessPlan>(0);

    @JoinTable(name = "startups_businessplans", joinColumns = {
            @JoinColumn(name = "startUpId", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "businessplan_id",
                    nullable = false, updatable = false) })

    */

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
        return "StartUp{" +
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
}
