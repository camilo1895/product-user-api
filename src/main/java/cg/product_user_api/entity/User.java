package cg.product_user_api.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;


    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Product> products;

}
