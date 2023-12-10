package com.hexaware.codingchallenge.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.codingchallenge.entities.Player;
import com.hexaware.codingchallenge.exceptions.PlayerNotFoundException;
import com.hexaware.codingchallenge.services.IPlayerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/players")
@CrossOrigin
public class PlayerRestController {
    @Autowired
	IPlayerService playerService;
    
	@PostMapping("/addplayer")
	public Player addPlayer(@RequestBody @Valid Player player) {
		Player playerTemp=playerService.addPlayer(player);
		if(player.getPlayerId()==0) {
			throw new PlayerNotFoundException(HttpStatus.NOT_FOUND,"player not inserted");
		}
		return playerTemp;
	}
	@GetMapping("/getallplayers")
	public List<Player> gettAllPlayers() {
		// TODO Auto-generated method stub
		List<Player> playerDetails=playerService.gettAllPlayers();	
		if(playerDetails.isEmpty()) {
			throw new PlayerNotFoundException(HttpStatus.NOT_FOUND,"There are no players found");
		}
		return playerDetails;
	}
	@DeleteMapping("/deletePlayer/{playerId}")
	public boolean deletePlayerbyId(@PathVariable int playerId) {
		playerService.deletePlayerbyId(playerId);
		return true;
	}
	@PutMapping("/updateplayer")
	public Player updatePlayer(@RequestBody @Valid Player player) {
		Player playerTemp= playerService.updatePlayer(player);
		if(player.getPlayerId()==0) {
			throw new PlayerNotFoundException(HttpStatus.NOT_FOUND,"player not found");
		}
		return playerTemp;
	}
	@GetMapping("/getplayerbyid/{playerId}")
	public Player getPlayerbyId(@PathVariable int playerId) {
		// TODO Auto-generated method stub
		Player playerTemp= playerService.getPlayerById(playerId);	
		if(playerTemp.getPlayerId()!=playerId) {
			throw new PlayerNotFoundException(HttpStatus.NOT_FOUND,"player not found");
		}
		return playerTemp;
	}
	@PutMapping("/updateplayerbyid/{playerId}/{role}/{totalMatches}")
	public Player updatePlayerById(@PathVariable int playerId,@PathVariable String role, @PathVariable int totalMatches) {
		Player player=playerService.updatePlayerById(playerId,role,totalMatches);
		if(player.getRole()!=role && player.getTotalMatches()!=totalMatches) {
			throw new PlayerNotFoundException(HttpStatus.NOT_FOUND,"player not updated");
		}
		return player;
	}
  @GetMapping("/get")
  public Player getPlayerBySecondHighestTotalMatches() {
	  return playerService.getPlayerBySecondHighestTotalMatches();
  }
  
}
