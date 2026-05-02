package com.klef.fsad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsad.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> 
{
}