package com.example.uoldefi.repository;


import com.example.uoldefi.model.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayersRepository extends JpaRepository<Players,Long> {
}
