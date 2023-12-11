import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Player } from '../models/Player';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  constructor(private http:HttpClient) { }

  ROOT_URL:String="http://localhost:8080";

  addPlayer(player:Player){
    return this.http.post<Player>(this.ROOT_URL+"/api/players/addplayer",player);
  }
  getPlayers(){
    return this.http.get<Player[]>(this.ROOT_URL+"/api/players/getallplayers");
  }
  getPlayerBySecondHighestTotalMatches(){
    return this.http.get<Player>(this.ROOT_URL+"/api/players/get");
  }
  deletePlayerbyId(playerId:number):Observable<boolean>{
    return this.http.delete<boolean>(this.ROOT_URL+`/api/players/deletePlayer/${playerId}`)
  }
}

