import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  // title = 'dummy-server-demo';

  // create user / registration / signup
  // login
  // show all users

  private url:string = "http://localhost:3000/users"

  register(){
    let user = {
      email: "demo@gmail.com", 
      password: "demo",
      age: 24,
      address: "India",
      gender: "male"
    };
    fetch(this.url, {
      method: "post",
      headers: {
        "content-type": "application/json"
      },
      body: JSON.stringify(user)
    })
    .then((response:any)=>{
      return response.json();
    })
    .then((data:any)=>{
      console.log(data);
    });
    
  }


  showUsers(){
    fetch(this.url, {
      method: "get"
    })
    .then((response:any)=>{
      return response.json();
    })
    .then((data:any)=>{
      console.log(data);
    });
  }

}
