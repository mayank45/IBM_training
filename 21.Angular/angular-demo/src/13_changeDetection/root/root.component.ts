import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './root.component.html',
  styleUrls: ['./root.component.css']
})
export class RootComponent implements OnInit {

  names:string[]=["arun", "ramesh", "miley"];

  constructor() { }

  ngOnInit(): void {
  }

  doPop(){
    this.names.pop();
    console.log(this.names);
  }
  doPush(name){
    this.names.push(name);
    console.log(this.names);    
  }

}
