package com.hexaware.codingchallenge.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.codingchallenge.entities.Player;
import com.hexaware.codingchallenge.exceptions.PlayerNotFoundException;
import com.hexaware.codingchallenge.repository.PlayerRepository;
@Service
public class PlayerServiceImp implements IPlayerService {
    @Autowired
	PlayerRepository playerRepository;
	@Override
	public Player addPlayer(Player player)throws PlayerNotFoundException {
		// TODO Auto-generated method stub
		return playerRepository.save(player);
	}

	@Override
	public Player updatePlayer(Player player)throws PlayerNotFoundException {
		// TODO Auto-generated method stub
		 return playerRepository.save(player);
	}

	@Override
	public List<Player> gettAllPlayers() throws PlayerNotFoundException{
		// TODO Auto-generated method stub
		return playerRepository.findAll();
	}

	@Override
	public void deletePlayerbyId(int playerId)throws PlayerNotFoundException {
		// TODO Auto-generated method stub
        playerRepository.deleteById(playerId);
	}

	@Override
	public Player getPlayerById(int playerId) throws PlayerNotFoundException{
		// TODO Auto-generated method stub
		return playerRepository.findById(playerId).orElse(new Player());
	}

	@Override
	public Player updatePlayerById(int playerId,String role, int totalMatches)throws PlayerNotFoundException {
		// TODO Auto-generated method stub
		Player player=playerRepository.findById(playerId).orElse(new Player());
		player.setRole(role);
		player.setTotalMatches(totalMatches);
		return playerRepository.save(player);
	}

	@Override
	public Player getPlayerBySecondHighestTotalMatches() {
		// TODO Auto-generated method stub
		return playerRepository.getPlayerBySecondHighestTm();
	}
	
}
