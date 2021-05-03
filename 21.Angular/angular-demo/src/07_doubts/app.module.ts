import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { RootComponent } from './root/root.component';
import { MyImageComponent } from './my-image/my-image.component';
import { MyAnchorComponent } from './my-anchor/my-anchor.component';
import { RadiusDirective } from './directives/radius.directive';

@NgModule({
    declarations:[RootComponent, MyImageComponent, MyAnchorComponent, RadiusDirective],
    imports: [BrowserModule],
    bootstrap: [RootComponent]
})
export class AppModule{}
