import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './root.component.html',
  styleUrls: ['./root.component.css']
})
export class RootComponent implements OnInit {

  name:string = "123";
  a:string = "2";
  
  constructor() { }

  ngOnInit(): void {
  }

}
