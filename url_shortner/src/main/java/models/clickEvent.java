package models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class clickEvent {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime clickDate;


    @ManyToOne
    @JoinColumn (name = "url_mapping")
    private urlMapping UrlMapping;
}
