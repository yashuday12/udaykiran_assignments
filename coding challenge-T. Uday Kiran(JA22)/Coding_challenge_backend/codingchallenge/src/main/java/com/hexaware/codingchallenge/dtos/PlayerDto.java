package com.hexaware.codingchallenge.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class PlayerDto {
	private int playerId;
    @NotBlank(message = "Player name is required")
    @Size(min = 2, max = 100, message = "Player name must be between 2 and 50 characters")
    @Pattern(regexp="[A-Z][a-z]*")
    private String playerName;
	@Min(value=1)
	@Max(value=100)
    private int jerseyNumber;
	@NotBlank
	@Pattern(regexp = "^(batsman|bowler|allrounder|keeper)$")
	private String role;
	@Positive
	private int totalMatches;
	@NotBlank
	@Size(min=2,max=100)
	private String teamName;
	@NotBlank
	@Size(min=2,max=100)
	private String country;
	@NotBlank
	@Size(min=2,max=100)
	private String description;
	public PlayerDto(int playerId,
			@NotBlank(message = "Player name is required") @Size(min = 2, max = 100, message = "Player name must be between 2 and 50 characters") @Pattern(regexp = "[A-Z][a-z]*") String playerName,
			@Min(1) @Max(100) int jerseyNumber,
			@NotBlank @Pattern(regexp = "^(batsman|bowler|allrounder|keeper)$") String role, @Positive int totalMatches,
			@NotBlank @Size(min = 2, max = 100) String teamName, @NotBlank @Size(min = 2, max = 100) String country,
			@NotBlank @Size(min = 2, max = 100) String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.country = country;
		this.description = description;
	}
	public PlayerDto() {
		super();
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
