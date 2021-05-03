import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-comp-e',
  templateUrl: './comp-e.component.html',
  styleUrls: ['./comp-e.component.css']
})
export class CompEComponent implements OnInit {

  @Input()
  names:string[] = [];

  constructor() { }

  ngOnInit(): void {
  }

}
