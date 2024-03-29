package com.acciojob.bookmyshowapplications.Models;

import com.acciojob.bookmyshowapplications.Enums.Genre;
import com.acciojob.bookmyshowapplications.Enums.Language;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Movies")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @Column(unique = true)
    private String movieName;

    private Double duration;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    private LocalDate releaseDate;

    private Double rating;

    @Enumerated(value = EnumType.STRING)
    private Language language;


}
