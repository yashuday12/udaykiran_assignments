import { Component, OnInit } from '@angular/core';
import { Player } from 'src/app/models/Player';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-viewplayers',
  templateUrl: './viewplayers.component.html',
  styleUrls: ['./viewplayers.component.css']
})
export class ViewplayersComponent implements OnInit {
  players!:Player[];
  constructor(private service:PlayerService){}
  ngOnInit(): void {
     this.service.getPlayers().subscribe((response)=>{
      console.log(response);
      this.players=response;
     },(error)=>{console.log(error)});
     
     
   }
 
  
}
