package com.example.coursedatabase.domain.model;

import com.example.coursedatabase.app.dto.TimeDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  String name;
    private  String email;
    private  String phone;
    private  String password;

    @OneToOne
    private Time time;

}

