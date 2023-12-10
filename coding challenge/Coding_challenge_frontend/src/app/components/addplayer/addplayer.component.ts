import { Component } from '@angular/core';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-addplayer',
  templateUrl: './addplayer.component.html',
  styleUrls: ['./addplayer.component.css']
})
export class AddplayerComponent {


  constructor(private service:PlayerService){

  }
  addPlayer(data:any){
    console.log(data.form.value)
    this.service.addPlayer(data.form.value).subscribe((response)=>{

      console.log(response);
     },(error)=>{console.log(error)});;
}
  }

