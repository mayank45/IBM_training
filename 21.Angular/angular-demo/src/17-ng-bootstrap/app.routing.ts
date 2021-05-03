import { Routes } from "@angular/router";
import { AboutComponent } from "./about/about.component";
import { HomeComponent } from "./home/home.component";

const routes:Routes = [
    {path: 'home', component: HomeComponent},
    {path: 'about', component: AboutComponent},
    {path: 'user', loadChildren: () => import('./user/user.module').then(m => m.UserModule)},
    {path: 'item', loadChildren: () => import('./item/item.module').then(m => m.ItemModule)},
    

    {path: '**', pathMatch: 'full', redirectTo: 'home'}
];

export default routes;