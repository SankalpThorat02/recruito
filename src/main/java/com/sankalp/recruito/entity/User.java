package com.sankalp.recruito.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sankalp_recrut")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recrut_seq_gen")
    @SequenceGenerator(
            name = "recrut_seq_gen",
            sequenceName = "sankalp_recrut_seq",
            allocationSize = 1
    )
    @Column(name = "RID")
    private Long id;

    @Column(name = "EMAIL_ID")
    private String emailId;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ROLE_ID")
    private Integer roleId;
}
