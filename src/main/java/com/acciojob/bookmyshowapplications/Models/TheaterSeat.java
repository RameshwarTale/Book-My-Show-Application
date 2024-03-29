package com.acciojob.bookmyshowapplications.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "theater_seats")
public class TheaterSeat {

    @Id
    private Integer TheaterSeatId;

    private String seatNo;

    private String seatType;

    @JoinColumn
    @ManyToOne
    private Theater theater;
}
