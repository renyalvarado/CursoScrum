package com.habuma.spitter.domain;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ralvarado
 */
public class Spitter implements Serializable {
    private static final String template =
            "Spitter -> id: %d, username: %s, fullname: %s, "
          + "password: %s, email: %s, updatebyemail: %b";
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String username;
    private String fullname;
    private String password;
    private String email;
    private Boolean updatebyemail;
    private List<Spittle> spittleList;

    public Spitter() {
    }

    public Spitter(Integer id) {
        this.id = id;
    }

    public Spitter(Integer id, String username) {
        this.id = id;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public Boolean getUpdatebyemail() {
        return updatebyemail;
    }

    public void setUpdatebyemail(Boolean updatebyemail) {
        this.updatebyemail = updatebyemail;
    }

    @XmlTransient
    public List<Spittle> getSpittleList() {
        return spittleList;
    }

    public void setSpittleList(List<Spittle> spittleList) {
        this.spittleList = spittleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Spitter)) {
            return false;
        }
        Spitter other = (Spitter) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format(template, id, username, fullname,
                password, email, updatebyemail);
    }
    
}
