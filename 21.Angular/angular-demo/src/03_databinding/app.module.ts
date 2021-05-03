import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AppComponent } from './app/app.component';
import { BrowserModule } from '@angular/platform-browser';
import { CounterComponent } from './counter/counter.component';
import { FormsModule } from '@angular/forms';
import { NameComponent } from './name/name.component';

@NgModule({
  declarations: [AppComponent, CounterComponent, NameComponent],
  imports: [
    CommonModule,
    BrowserModule,
    FormsModule
  ],
  bootstrap:[AppComponent]
})
export class AppModule { }

