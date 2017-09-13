package ua.goit.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by User on 23.08.2017.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    private String username;
    private String password;
    private String email;

    @OneToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    private String profileFotoLink;
    private String personalPageFotoLink;
//
    private String youtubeLink;
    private String aboutMe;
//
//    //TODO 6 прописать маппинг
//    private Collection<Experience> experiences;
//    private Collection<Education> educations;
    private String skills;

    @ElementCollection(targetClass=Role.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name="user_roles")
    @Column(name="role") // Column name in user_roles
    private Collection<Role> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getProfileFotoLink() {
        return profileFotoLink;
    }

    public void setProfileFotoLink(String profileFotoLink) {
        this.profileFotoLink = profileFotoLink;
    }

    public String getPersonalPageFotoLink() {
        return personalPageFotoLink;
    }

    public void setPersonalPageFotoLink(String personalPageFotoLink) {
        this.personalPageFotoLink = personalPageFotoLink;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

//    public Collection<Experience> getExperiences() {
//        return experiences;
//    }
//
//    public void setExperiences(Collection<Experience> experiences) {
//        this.experiences = experiences;
//    }
//
//    public Collection<Education> getEducations() {
//        return educations;
//    }
//
//    public void setEducations(Collection<Education> educations) {
//        this.educations = educations;
//    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

}
