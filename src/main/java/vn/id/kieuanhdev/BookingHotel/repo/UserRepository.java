package vn.id.kieuanhdev.BookingHotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.id.kieuanhdev.BookingHotel.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);
}
