package com.hexaware.codingchallenge.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.codingchallenge.entities.Player;
@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer>{
 @Query("Select p from Player p order by p.totalMatches desc limit 1 offset 1")
 public Player getPlayerBySecondHighestTm();
 
}
