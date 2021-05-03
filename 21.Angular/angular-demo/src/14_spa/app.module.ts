import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RootComponent } from './root/root.component';

const routes:Routes = [
    {path: 'login', component: LoginComponent},
    {path: 'home', component: HomeComponent }
];

@NgModule({
    declarations: [HomeComponent, LoginComponent, RootComponent],
    imports: [
        BrowserModule,
        FormsModule,
        RouterModule.forRoot(routes)
    ],
    bootstrap: [RootComponent]
})
export default class AppModule { }

