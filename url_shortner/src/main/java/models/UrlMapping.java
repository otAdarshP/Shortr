package models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class UrlMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String originalUrl;
    private String shortrUrl;
    private int clickCount = 0;
    private LocalDateTime createdDate;

    @ManyToOne // many shortr urls for 1 user
    @JoinColumn (name = "user_id")
    private User user;


    @OneToMany (mappedBy = "urlMapping") // many urls shortened at 1 time only
    private List<ClickEvent> clickEvents;
}
