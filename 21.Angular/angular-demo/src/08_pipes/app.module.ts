import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { RootComponent } from './root/root.component';
import { MyDatePipe } from './pipes/my-date.pipe';
import { CapitalizePipe } from "./pipes/capitalize.pipe";
import { DemoPipe } from "./pipes/demo.pipe";

@NgModule({
    declarations: [RootComponent, MyDatePipe, CapitalizePipe, DemoPipe],
    imports: [BrowserModule],
    bootstrap: [RootComponent]
})
export class AppModule{
}
