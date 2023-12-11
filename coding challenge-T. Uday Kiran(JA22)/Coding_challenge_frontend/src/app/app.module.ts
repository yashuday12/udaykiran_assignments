import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddplayerComponent } from './components/addplayer/addplayer.component';
import { ViewplayersComponent } from './components/viewplayers/viewplayers.component';
import { SecondhighestplayerComponent } from './components/secondhighestplayer/secondhighestplayer.component';
import{HttpClientModule}   from "@angular/common/http";
import { DeleteplayerComponent } from './components/deleteplayer/deleteplayer.component';
@NgModule({
  declarations: [
    AppComponent,
    AddplayerComponent,
    ViewplayersComponent,
    SecondhighestplayerComponent,
    DeleteplayerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
