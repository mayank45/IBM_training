import { NgModule } from "@angular/core";
import { RootComponent } from './root/root.component';
import { LoginComponent } from './login/login.component';
import { InvoiceComponent } from './invoice/invoice.component';
import { BrowserModule } from "@angular/platform-browser";
import { FormsModule } from "@angular/forms";
import { UserService } from "./service/user.service";

@NgModule({
    declarations:[RootComponent, LoginComponent, InvoiceComponent],
    imports:[BrowserModule, FormsModule],
    // providers: [UserService],
    bootstrap:[RootComponent]
})
export class AppModule{}