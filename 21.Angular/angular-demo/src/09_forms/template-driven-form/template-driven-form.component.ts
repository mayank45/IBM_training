import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-template-driven-form',
  templateUrl: './template-driven-form.component.html',
  styleUrls: ['./template-driven-form.component.css']
})
export class TemplateDrivenFormComponent {

  // myForm:NgForm;
  user:any = {
    // email: "arun@test.com",
    // password: "123"
    email: "",
    password: ""
  }

  getLogin(myForm){
    console.log("+++++");
    console.log(myForm);
    console.log(myForm.value);
    console.log(this.user);
    console.log("send request to server");
  }

}
