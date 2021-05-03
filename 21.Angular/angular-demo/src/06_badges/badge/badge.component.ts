import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-badge',
  templateUrl: './badge.component.html',
  styleUrls: ['./badge.component.css']
})
export class BadgeComponent implements OnInit {

  @Input("color")
  myColor:string = "cornflowerblue";
  @Input()
  text:string = "Button";
  @Input()
  count:number = 0;
  constructor() { }

  ngOnInit(): void {
  }

}
