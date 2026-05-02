package com.klef.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.model.Booking;
import com.klef.fsad.repository.BookingRepository;

@Service
public class BookingService 
{
    @Autowired
    private BookingRepository repo;

    public Booking addBooking(Booking b) 
    {
        return repo.save(b);
    }

    public String deleteBooking(Long id) 
    {
        if(repo.existsById(id))
        {
            repo.deleteById(id);
            return "Deleted Successfully";
        }
        return "Booking Not Found";
    }
}