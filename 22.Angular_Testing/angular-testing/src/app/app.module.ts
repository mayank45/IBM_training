import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DemoComponent } from './demo/demo.component';
import { CapitalizePipe } from './pipes/capitalize.pipe';
import { Demo2Component } from './demo2/demo2.component';
import { DemoDemoComponent } from './demo-demo/demo-demo.component';

@NgModule({
  declarations: [
    AppComponent,
    DemoComponent,
    CapitalizePipe,
    Demo2Component,
    DemoDemoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
