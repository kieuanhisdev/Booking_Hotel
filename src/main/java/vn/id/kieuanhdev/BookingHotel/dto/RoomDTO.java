package vn.id.kieuanhdev.BookingHotel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import vn.id.kieuanhdev.BookingHotel.entity.Booking;
import java.math.BigDecimal;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomDTO {
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private String roomPhotoUrl;
    private String roomDescription;
    private List<Booking> bookings;
}
