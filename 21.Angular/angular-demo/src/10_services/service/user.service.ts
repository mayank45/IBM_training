import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private user:any = {
    name: "miley",
    age: 14,
    city: "pune",
    phone: "25478",
    gender: "female"
  };

  constructor() { }

  set name(n){
    this.user.name = n;
  }
  set age(a){
    this.user.age = a;
  }
  set city(c){
    this.user.city = c;
  }

  get details(){
    return this.user;
  }
  
}
