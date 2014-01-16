package com.habuma.spitter.domain;

import java.io.Serializable;
import java.util.Date;
public class Spittle implements Serializable {
    private static final String template =
            "Spittle -> id: %d, text: %s, when: %tD, (%s)";
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String text;
    private Date when;
    private Spitter spitter;

    public Spittle() {
    }

    public Spittle(Integer id) {
        this.id = id;
    }

    public Spittle(Integer id, Date when) {
        this.id = id;
        this.when = when;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    public Spitter getSpitter() {
        return spitter;
    }

    public void setSpitterId(Spitter spitter) {
        this.spitter = spitter;
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
        if (!(object instanceof Spittle)) {
            return false;
        }
        Spittle other = (Spittle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format(template, id, text, when, spitter);
    }
    
}
