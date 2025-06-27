package models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // automatically updates the Id of the users.
    private Long id;
    private String email;
    private String username;
    private String password;
    private String role = "ROLE_USER";

}
