package com.owode.expenses.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "expense")
public class Expense {
    @Id
    private Long id;

    private String descript;
    private Instant expansedate;
    private String location;
    @ManyToOne
    private Category category;

    public String getDescript() {
        return descript;
    }

    public Instant getExpansedate() {
        return expansedate;
    }

    public String getLocation() {
        return location;
    }

    public Category getCategory() {
        return category;
    }

    public User getUser() {
        return user;
    }
    @JsonIgnore
    @ManyToOne
    private User user;


    public Long getId() {
        return this.id;
    }
}
