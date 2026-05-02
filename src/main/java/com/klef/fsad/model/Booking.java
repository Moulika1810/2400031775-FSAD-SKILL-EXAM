package com.klef.fsad.model;

import jakarta.persistence.*;

@Entity
@Table(name="booking_table")
public class Booking 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ⭐ IMPORTANT
    private Long bookingId;

    private String name;
    private String date;
    private String status;
    private String description;

    public Booking() {}

    public Long getBookingId() { return bookingId; }
    public void setBookingId(Long bookingId) { this.bookingId = bookingId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}