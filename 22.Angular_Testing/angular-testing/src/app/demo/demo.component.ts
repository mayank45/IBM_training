import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.scss']
})
export class DemoComponent {

  num:number = 0;

  decrease(){
    // this.num--;
    this.update(this.num - 1);
  }
  increase(){
    // this.num++;
    this.update(this.num + 1);
  }

  update(n:number){
    this.num = n;
  }

}
