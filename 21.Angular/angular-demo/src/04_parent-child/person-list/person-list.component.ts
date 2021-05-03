import { Component, Input, OnInit } from '@angular/core';
import { Person } from '../model/Person';

@Component({
  selector: 'app-person-list',
  templateUrl: './person-list.component.html',
  styleUrls: ['./person-list.component.css']
})
export class PersonListComponent implements OnInit {

  @Input('prop')
  persons:Person[] = [];
  constructor() { }

  ngOnInit(): void {
  }

}
