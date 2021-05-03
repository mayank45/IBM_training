import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { RootComponent } from './root/root.component';
import { BookListComponent } from './book-list/book-list.component';
import { BookCreateComponent } from './book-create/book-create.component';
import { HttpClientModule } from '@angular/common/http';
import { EditBookComponent } from './edit-book/edit-book.component';
import { RouterModule } from '@angular/router';
import routes from './app.routing';



@NgModule({
    declarations: [RootComponent, BookListComponent, BookCreateComponent, EditBookComponent],
    imports: [
        BrowserModule,
        FormsModule,
        ReactiveFormsModule,
        HttpClientModule,
        RouterModule.forRoot(routes)
    ],
    bootstrap: [RootComponent]
})
export default class AppModule { }

