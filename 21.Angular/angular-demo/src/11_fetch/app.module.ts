import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { FormsModule } from "@angular/forms";
import { RootComponent } from "./root/root.component";

@NgModule({
    declarations:[RootComponent],
    imports:[BrowserModule, FormsModule],
    bootstrap:[RootComponent]
})
export class AppModule{}