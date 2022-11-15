package edu.miu.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "User_Table")
public class User {

    @Id
    private Long id;
    private String name;
}
