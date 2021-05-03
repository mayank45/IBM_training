import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private loggedIn: boolean = false;
  // private loggedIn: boolean = true;

  get login() { 
    return this.loggedIn; 
  }
  set login(flag:boolean) { 
    this.loggedIn = flag; 
  }

}

// LoginComponent
      // send request to get login
      // userService.login = true;

      // if(userService.login == true)
            // show logout btn
      // else 
            // show login btn
