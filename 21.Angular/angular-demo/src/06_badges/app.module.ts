import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AppComponent } from './app/app.component';
import { BrowserModule } from '@angular/platform-browser';
import { BadgeComponent } from './badge/badge.component';



@NgModule({
  declarations: [AppComponent, BadgeComponent],
  imports: [
    CommonModule,
    BrowserModule
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
