import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-comp-f',
  templateUrl: './comp-f.component.html',
  styleUrls: ['./comp-f.component.css']
})
export class CompFComponent implements OnInit {

  @Input()
  names:string[] = [];

  constructor() { }

  ngOnInit(): void {
  }

}
