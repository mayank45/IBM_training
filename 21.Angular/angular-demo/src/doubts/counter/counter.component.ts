import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-counter',
  templateUrl: './counter.component.html',
  styleUrls: ['./counter.component.css']
})
export class CounterComponent implements OnInit {

  num:number = 5;

  constructor() { }

  ngOnInit(): void {
  }

  increase(){
    // console.log("plus")
    // if(this.num < 10)
    // this.num++;
    // else 
    // alert(`${this.num} is max value`)

    this.change(this.num + 1);
  }
  decrease(){
    // console.log("minus")
    // if(this.num > 0)
    // this.num--;
    // else 
    // alert(`${this.num} is min value`)

    this.change(this.num - 1);
  }

  change(n){
    this.num = n;
  }

}
