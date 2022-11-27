package org.example.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Contest {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int capacity;



    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(nullable = true)
    private Date date;

    public Contest()
    {

    }

    public Contest(String name, int capacity,  Date date) {
        this.name = name;
        this.capacity = capacity;
        this.date = date;

    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() { return capacity; }

    public void setCapacity(int capacity) { this.capacity = capacity; }

    public Date getDate() { return date; }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, capacity, date);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contest other = (Contest) obj;
        return Objects.equals(id, other.id) && Objects.equals(name, other.name) && capacity == other.capacity;
    }



}

