package com.example.uoldefi.controller.dtos;

public record PlayersRequestDTO(
        Long id,
        String name,
        String email,
        String phone,
        Boolean avengers
) {
}
