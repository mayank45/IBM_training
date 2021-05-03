import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-name-demo',
  templateUrl: './name-demo.component.html',
  styleUrls: ['./name-demo.component.css']
})
export class NameDemoComponent implements OnInit {

  a:string = "arun";
  b:string = "demo";
  c:string = "some text";

  constructor() { }

  ngOnInit(): void {
  }

  readDataFromTemplate(data:string){
    console.log(data);
  }

  readDataFromTemplateForB(data:string){
    console.log(data);
    this.b = data;
  }

  


}
