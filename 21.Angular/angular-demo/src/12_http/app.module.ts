import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { RootComponent } from './root/root.component';
import { BookListComponent } from './book-list/book-list.component';
import { BookCreateComponent } from './book-create/book-create.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
    declarations: [RootComponent, BookListComponent, BookCreateComponent],
    imports: [
        BrowserModule,
        FormsModule,
        ReactiveFormsModule,
        HttpClientModule
    ],
    bootstrap: [RootComponent]
})
export default class AppModule { }

