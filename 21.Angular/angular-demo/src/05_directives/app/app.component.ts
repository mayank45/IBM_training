import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  {
  isPresent:boolean = false;
  myCssClass:string = "";
  myColor:string = "red";
  myBorder:string = "2px solid "+this.myColor;

  // hobbies:string[] = ['reading', 'music', 'movies', 'playing'];
  hobbies:Array<string> = ['reading', 'music', 'movies', 'playing'];

  constructor(){
    this.findCss();
  }

  findCss(){
    if(this.isPresent){
      this.myCssClass = "valid";
    }  else {
      this.myCssClass = "invalid";
    }
  }

  toggle(){
    this.isPresent = !this.isPresent;
    this.findCss();
  }
}
