import { Component } from '@angular/core';
import { Player } from 'src/app/models/Player';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-secondhighestplayer',
  templateUrl: './secondhighestplayer.component.html',
  styleUrls: ['./secondhighestplayer.component.css']
})
export class SecondhighestplayerComponent {
  player!:Player;
  constructor(private service:PlayerService){}
  ngOnInit(): void {
     this.service.getPlayerBySecondHighestTotalMatches().subscribe((response)=>{

      this.player=response;
     },
     (error)=>{console.log(error)});
}
}
