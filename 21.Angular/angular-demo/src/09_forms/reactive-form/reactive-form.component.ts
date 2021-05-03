import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent {

  myForm:FormGroup;


  constructor() { 
    this.myForm = new FormGroup({

        email: new FormControl("demo@gmail.com", [
          Validators.required,
          Validators.pattern("^[A-Za-z0-9._-]+@[a-z0-9.]+\.[a-z]{2,6}$")
        ]),
        
        password: new FormControl("123", Validators.required),

        address: new FormGroup({
          city: new FormControl('Bangalore'),
          zip: new FormControl('42541')
        })
    
    });
  }

  getRegister() {
    console.log(this.myForm)
    console.log("send request");
  }

}
