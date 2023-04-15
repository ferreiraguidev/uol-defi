package com.example.uoldefi.mapper;


import com.example.uoldefi.controller.dtos.PlayersRequestDTO;
import com.example.uoldefi.controller.dtos.PlayersResponseDTO;
import com.example.uoldefi.model.Players;
import org.springframework.stereotype.Component;


@Component
public class PlayersMapper {

    public static Players toDomain(final PlayersRequestDTO requestDTO) {
        return new Players(null, requestDTO.name(), requestDTO.email(), requestDTO.phone(),requestDTO.avengers());
    }

    public static PlayersResponseDTO toDto(final Players players) {
        return new PlayersResponseDTO(players.getEmail(), players.getName(),players.getPhone(),players.getAvengers());
    }
}
