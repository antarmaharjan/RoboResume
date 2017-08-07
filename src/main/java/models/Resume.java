package models;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Resume {

    @NotNull
    @Size(min=1)
    private int id;
    @NotNull
    @Size(min = 1,max = 30)
    private String firstName;
    @NotNull
    @Size(min = 1,max = 30)
    private String lastName;
    @NotNull
    @Size(min = 1,max = 50)
    private String email;
    private String organisation;
    @DateTimeFormat(pattern ="yyyy/mm/dd")
    private Date beginDate;
    @DateTimeFormat(pattern ="yyyy/mm/dd")
    private Date endDate;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getOrganisation() {
        return organisation;
    }
    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }
    public Date getBeginDate() {
        return beginDate;
    }
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}
