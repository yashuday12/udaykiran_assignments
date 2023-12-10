import { Component } from '@angular/core';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-deleteplayer',
  templateUrl: './deleteplayer.component.html',
  styleUrls: ['./deleteplayer.component.css']
})
export class DeleteplayerComponent {
  title = 'codingchallenge';
  constructor(private service:PlayerService){}
  deleteStatus:boolean=false;
  deletePlayer(data:any){
    this.service.deletePlayerbyId(data.form.value.playerId).subscribe((response)=>{
      this.deleteStatus=response;
    })
  }
}
