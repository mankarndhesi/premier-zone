package com.premierleague.premier_zone.player;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component // Tells Spring that it should manage this class
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersFromTeam(String teamName) {
        return playerRepository.findAll().stream()
                .filter(player -> teamName.equals(player.getTeam_name()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByName(String searchText) {
        return playerRepository.findAll().stream().filter(player -> player.getPlayer_name().toLowerCase()
                .contains(searchText.toLowerCase())).collect((Collectors.toList()));
    }

    public List<Player> getPlayersByPosition(String searchText) {
        return playerRepository.findAll().stream().filter(player ->
                player.getPosition().toLowerCase().contains(searchText.toLowerCase()))
                .collect((Collectors.toList()));
    }

    public List<Player> getPlayersByNation(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getNation().toLowerCase().contains(searchText.toLowerCase()))
                .collect((Collectors.toList()));
    }

    public List<Player> getPlayersByTeamAndPosition(String team, String position) {
        return playerRepository.findAll().stream()
                .filter(player -> team.equals(player.getTeam_name()) && position.equals((player.getPosition())))
                .collect((Collectors.toList()));
    }

    public Player addPlayer(Player player) {
        playerRepository.save(player);
        return player;
    }

    public Player updatePlayer(Player updatedPlayer) {
        Optional<Player> existingPlayer = playerRepository.findByPlayer_name(updatedPlayer.getPlayer_name());

        if (existingPlayer.isPresent()) {
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setPlayer_name(updatedPlayer.getPlayer_name());
            playerToUpdate.setTeam_name(updatedPlayer.getTeam_name());
            playerToUpdate.setPosition(updatedPlayer.getPosition());
            playerToUpdate.setNation(updatedPlayer.getNation());
            playerRepository.save(playerToUpdate);
            return playerToUpdate;
        }
        return null;
    }
    @Transactional
    public void deletePlayer(String playerName) {
        playerRepository.deleteByPlayer_name(playerName);
    }


}
