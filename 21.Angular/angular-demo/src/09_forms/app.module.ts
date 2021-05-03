import { NgModule } from "@angular/core";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { BrowserModule } from "@angular/platform-browser";
import { RootComponent } from "./root/root.component";
import { TemplateDrivenFormComponent } from './template-driven-form/template-driven-form.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';

@NgModule({
    declarations:[RootComponent, TemplateDrivenFormComponent, ReactiveFormComponent],
    imports:[BrowserModule, FormsModule, ReactiveFormsModule],
    bootstrap:[RootComponent]
})
export class AppModule{}