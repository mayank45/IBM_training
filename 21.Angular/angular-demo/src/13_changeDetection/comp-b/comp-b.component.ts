import { ChangeDetectionStrategy, Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-comp-b',
  templateUrl: './comp-b.component.html',
  styleUrls: ['./comp-b.component.css'],
  // changeDetection: ChangeDetectionStrategy.Default // default
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class CompBComponent implements OnInit {

  @Input()
  names:string[] = [];
  constructor() { }

  ngOnInit(): void {
  }

}
