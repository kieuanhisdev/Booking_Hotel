package vn.id.kieuanhdev.BookingHotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.id.kieuanhdev.BookingHotel.entity.Booking;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findBookingById(Long roomId);

    List<Booking> findBookingConfirmationCode(String confirmationCode);

    List<Booking> findByUserId(Long userId);

}
