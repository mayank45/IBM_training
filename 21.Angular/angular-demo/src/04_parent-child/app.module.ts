import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AppComponent } from './app/app.component';
import { BrowserModule } from '@angular/platform-browser';
import { PersonListComponent } from './person-list/person-list.component';



@NgModule({
  declarations: [AppComponent, PersonListComponent],
  imports: [
    CommonModule,
    BrowserModule
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
