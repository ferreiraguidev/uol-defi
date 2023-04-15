package com.example.uoldefi.gateway;


import com.example.uoldefi.model.Players;
import com.example.uoldefi.repository.PlayersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class PlayersGateway {

    private final PlayersRepository repository;


    public Players save(Players players) {
        return repository.save(players);
    }

    public List<Players> listAll() {
        return repository.findAll();
    }

}
