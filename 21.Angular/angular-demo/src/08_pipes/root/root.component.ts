import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './root.component.html',
  styleUrls: ['./root.component.css']
})
export class RootComponent implements OnInit {

  name:string = "aRuN KumAR";
  str:string = "my rANdoM sTRIng iS my rANdoM sTRIng iS my rANdoM sTRIng iS my rANdoM sTRIng iS my rANdoM sTRIng iS my rANdoM sTRIng iS my rANdoM sTRIng iS ";
  today:Date = new Date();
  now:number = Date.now();


  persons:Array<any> = []

  constructor() { 
    for(var i=0;i<100;i++){
      let person = {name: "demo_"+i, age: Math.floor((Math.random()*100))}
      this.persons.push(person);
    }
  }

  ngOnInit(): void {
  }

}
