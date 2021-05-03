import { Component, OnInit } from '@angular/core';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  name:string = "arun";
  age:number = 35;
  city:string = "delhi";
  phone:string = "96587";
  gender:'male'|'female' = "male";
  
  constructor(private userService:UserService) { }

  save(){
    console.log(this.name)
    console.log(this.age)
    console.log(this.city)
    console.log(this.phone)
    console.log(this.gender)

    this.userService.name = this.name;
    this.userService.age = this.age;
    this.userService.city = this.city;
  }


}
