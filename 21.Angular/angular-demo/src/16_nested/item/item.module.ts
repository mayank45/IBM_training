import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateComponent } from './create/create.component';
import { EditComponent } from './edit/edit.component';
import { ListComponent } from './list/list.component';
import { RouterModule, Routes } from '@angular/router';
import routes from './item.routes';



@NgModule({
  declarations: [CreateComponent, EditComponent, ListComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(routes)
  ]
})
export class ItemModule { }
