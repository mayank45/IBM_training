import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { RootComponent } from './root/root.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { RouterModule } from "@angular/router";
import routes from "./app.routing";
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';


@NgModule({
    declarations: [RootComponent, HomeComponent, AboutComponent, HeaderComponent, FooterComponent],
    imports: [BrowserModule, RouterModule.forRoot(routes), NgbModule],
    bootstrap: [RootComponent]
})
export class AppModule{}