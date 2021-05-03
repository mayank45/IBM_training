import { Component, enableProdMode, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

@Component({
  selector: "my-first-component",
  template: `<h1>It is my very first angular component+++</h1>`,
  styles: []
})
class AppComponent{
  constructor(){
    console.log("my first component is rendered")
  }
}

// import { AppModule } from './app/app.module';
// @NgModule({
//   declarations: [component, pipe, ],
//   providers: [reusable code, util, service, guards],
//   imports: [others modules],
//   exports: [..],  
//   bootstrap: [Component]
// })
@NgModule({
  declarations: [AppComponent],
  imports:[
    BrowserModule
  ],
  bootstrap: [AppComponent]
})
class AppModule{}



import { environment } from './environments/environment';

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));
