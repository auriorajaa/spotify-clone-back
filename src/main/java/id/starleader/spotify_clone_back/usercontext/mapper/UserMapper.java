package id.starleader.spotify_clone_back.usercontext.mapper;

import id.starleader.spotify_clone_back.usercontext.ReadUserDTO;
import id.starleader.spotify_clone_back.usercontext.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User entity);

}
