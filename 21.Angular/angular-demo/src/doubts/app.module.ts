import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { BrowserModule } from "@angular/platform-browser";
import { CounterComponent } from './counter/counter.component';
import { RootComponent } from './root/root.component';
import { NameDemoComponent } from './name-demo/name-demo.component';

@NgModule({
    declarations:[CounterComponent, RootComponent, NameDemoComponent],
    imports:[
        BrowserModule,
        FormsModule
    ],
    bootstrap: [RootComponent]
})
export default class AppModule{}
