package com.hexaware.codingchallenge.services;

import java.util.List;
import java.util.Map;

import com.hexaware.codingchallenge.entities.Player;
import com.hexaware.codingchallenge.exceptions.PlayerNotFoundException;

public interface IPlayerService {
  public Player addPlayer(Player player) throws PlayerNotFoundException;
  public Player updatePlayer(Player player)throws PlayerNotFoundException;
  public List<Player> gettAllPlayers()throws PlayerNotFoundException;
  public void deletePlayerbyId(int playerId)throws PlayerNotFoundException;
  public Player getPlayerById(int playerId)throws PlayerNotFoundException;
  public Player updatePlayerById(int playerId, String role, int totalMatches)throws PlayerNotFoundException;
  public Player getPlayerBySecondHighestTotalMatches();
 
 }
