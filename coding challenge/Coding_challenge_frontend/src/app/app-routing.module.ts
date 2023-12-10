import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddplayerComponent } from './components/addplayer/addplayer.component';
import { ViewplayersComponent } from './components/viewplayers/viewplayers.component';
import { SecondhighestplayerComponent } from './components/secondhighestplayer/secondhighestplayer.component';
import { DeleteplayerComponent } from './components/deleteplayer/deleteplayer.component';

const routes: Routes = [
  {path:"add",component:AddplayerComponent},
  {path:"viewplayer",component:ViewplayersComponent},
  {path:"secondhighestplayer",component:SecondhighestplayerComponent},
  {path:"delete",component:DeleteplayerComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
