import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-name',
  templateUrl: './name.component.html',
  styleUrls: ['./name.component.css']
})
export class NameComponent  {

  nameVar2:string = "";
  nameVar3:string = "";

  updateNameVar2(n:string){
    console.log(n)
    this.nameVar2 = n;
  }

  setDefault(){
    this.nameVar2 = "";
    this.nameVar3 = "";
  }
  
}
