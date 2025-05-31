package com.premierleague.premier_zone.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// For crud operations
// <Player = Entity, String = Type of Primary Key>
// JPARepository gives you a full set of CRUD methods
@Repository // Tells Spring to treat this as Spring Bean
public interface PlayerRepository extends JpaRepository<Player, String> {
    void deleteByPlayer_name(String player_name);
    Optional<Player> findByPlayer_name(String player_name); //Optional accounts for if the player name dne


}
