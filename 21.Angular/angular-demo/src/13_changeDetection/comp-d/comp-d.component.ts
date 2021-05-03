import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-comp-d',
  templateUrl: './comp-d.component.html',
  styleUrls: ['./comp-d.component.css']
})
export class CompDComponent implements OnInit {

  @Input()
  names:string[] = [];

  constructor() { }

  ngOnInit(): void {
  }

}
