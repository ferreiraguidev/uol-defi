package com.example.uoldefi.controller;


import com.example.uoldefi.controller.dtos.PlayersRequestDTO;
import com.example.uoldefi.controller.dtos.PlayersResponseDTO;
import com.example.uoldefi.gateway.PlayersGateway;
import com.example.uoldefi.model.Players;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.uoldefi.mapper.PlayersMapper.toDomain;
import static com.example.uoldefi.mapper.PlayersMapper.toDto;
import static org.springframework.http.HttpStatus.CREATED;




@RequiredArgsConstructor
@RestController
public class PlayersController {

    private final PlayersGateway gateway;


    @ResponseStatus(CREATED)
    @PostMapping("save")
    public PlayersResponseDTO save(@RequestBody final PlayersRequestDTO requestDTO) {
        val players = toDomain(requestDTO);
        val savedPlayer = gateway.save(players);
        val playerResponseDto = toDto(savedPlayer);
        return playerResponseDto;
    }

    @GetMapping("listAll")
    public @ResponseBody List<Players> listAll() {
        return gateway.listAll();
    }
}
