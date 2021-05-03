import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-demo2',
  templateUrl: './demo2.component.html',
  styleUrls: ['./demo2.component.scss']
})
export class Demo2Component {

  message:string = "";

  constructor(public service:UserService) { 
    if(service.login){
      this.message = "welcome user";
    } else {
      this.message = "you are not a valid user";
    }
  }


}
