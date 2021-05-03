import { Routes } from "@angular/router";
import { LoginComponent } from "./login/login.component";
import { ProfileComponent } from "./profile/profile.component";
import { RegisterComponent } from "./register/register.component";


// localhost:4200/user
      // /login -> loginComp
      // /signup -> registerComp
      // /account -> profileComp


const routes: Routes = [
    {path: "login", component: LoginComponent},
    {path: "signup", component: RegisterComponent},
    {path: "account", component: ProfileComponent}
  
    // {path: "**", redirectTo: "login"}
  ];

export default routes;