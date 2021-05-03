import { Routes } from "@angular/router";
import { CreateComponent } from "./create/create.component";
import { EditComponent } from "./edit/edit.component";
import { ListComponent } from "./list/list.component";

const routes: Routes = [
    {
        path: 'create', 
        component: CreateComponent
    },
    {
        path: 'edit', 
        component: EditComponent
    },
    {
        path: 'list', 
        component: ListComponent
    }
  
    // {
    //     path: '**', 
    //     redirectTo: 'list'
    // }
  ];

export default routes;