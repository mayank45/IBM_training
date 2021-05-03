import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { RootComponent } from './root/root.component';
import { UnlessDirective } from './unless.directive';
import { HighlightDirective } from './highlight.directive';

@NgModule({
    declarations: [RootComponent, UnlessDirective, HighlightDirective],
    imports: [BrowserModule],
    bootstrap: [RootComponent]
})
export class AppModule{}
