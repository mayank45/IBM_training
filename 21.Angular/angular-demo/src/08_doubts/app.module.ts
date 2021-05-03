import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { RootComponent } from "./root/root.component";
import { ReversePipe } from './pipes/reverse.pipe';
import { PowPipe } from './pipes/pow.pipe';

@NgModule({
    declarations:[RootComponent, ReversePipe, PowPipe],
    imports:[BrowserModule],
    bootstrap:[RootComponent]
})
export class AppModule{}