import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { RootComponent } from './root/root.component';
import { CompAComponent } from './comp-a/comp-a.component';
import { CompBComponent } from './comp-b/comp-b.component';
import { CompCComponent } from './comp-c/comp-c.component';
import { CompDComponent } from './comp-d/comp-d.component';
import { CompEComponent } from './comp-e/comp-e.component';
import { CompFComponent } from './comp-f/comp-f.component';

@NgModule({
    declarations: [RootComponent, CompAComponent, CompBComponent, CompCComponent, CompDComponent, CompEComponent, CompFComponent],
    imports: [
        BrowserModule,
        FormsModule,
    ],
    bootstrap: [RootComponent]
})
export default class AppModule { }

