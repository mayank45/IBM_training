import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-my-image',
  templateUrl: './my-image.component.html',
  styleUrls: ['./my-image.component.css']
})
export class MyImageComponent implements OnInit {

  // @Input('path')
  @Input()
  path:string;
  
  constructor() { }

  ngOnInit(): void {
  }

}
