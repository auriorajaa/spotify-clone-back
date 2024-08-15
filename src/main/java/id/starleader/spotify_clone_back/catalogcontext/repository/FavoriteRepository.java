package id.starleader.spotify_clone_back.catalogcontext.repository;

import id.starleader.spotify_clone_back.catalogcontext.domain.Favorite;
import id.starleader.spotify_clone_back.catalogcontext.domain.FavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {

}
