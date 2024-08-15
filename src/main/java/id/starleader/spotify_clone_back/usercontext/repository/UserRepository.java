package id.starleader.spotify_clone_back.usercontext.repository;

import id.starleader.spotify_clone_back.usercontext.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
