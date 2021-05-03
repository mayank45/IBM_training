import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  @Input("name")
  name:string="";
  @Input()// if input property and variable name are same
  min:number=0;

  constructor() { }

  ngOnInit(): void {
  }

}
