package vn.id.kieuanhdev.BookingHotel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import vn.id.kieuanhdev.BookingHotel.entity.Room;
import vn.id.kieuanhdev.BookingHotel.entity.User;
import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDTO {
    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int numOfAdults;
    private int numOfChildren;
    private int totalNumberOfGuest;
    private String bookingConfirmationCode;
    private User user;
    private Room room;
}
