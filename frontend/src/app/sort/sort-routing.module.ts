import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SortNumberComponent } from './sort-number/sort-number.component';

const routes: Routes = [
  {path: 'sort', component: SortNumberComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SortRoutingModule { }
