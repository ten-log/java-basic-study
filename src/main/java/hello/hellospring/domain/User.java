package hello.hellospring.domain;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long index;
    private String id;
    private String name;
    private String phone;
    private String address;
    private Integer role;
}