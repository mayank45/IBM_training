import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-comp-c',
  templateUrl: './comp-c.component.html',
  styleUrls: ['./comp-c.component.css']
})
export class CompCComponent implements OnInit {

  @Input()
  names:string[] = [];
  constructor() { }

  ngOnInit(): void {
  }

}
