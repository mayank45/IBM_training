import { RouterModule, Routes } from "@angular/router";
import { BookCreateComponent } from "./book-create/book-create.component";
import { BookListComponent } from "./book-list/book-list.component";
import { EditBookComponent } from "./edit-book/edit-book.component";

const routes:Routes = [
    {path: 'create', component: BookCreateComponent},
    {path: 'edit/:id', component: EditBookComponent},
   
    {path: 'list', component: BookListComponent},
    {path: '**', pathMatch: 'full', redirectTo: "list" }
];


export default routes;