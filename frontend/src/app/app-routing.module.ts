import { NgModule } from '@angular/core';

import { Routes, RouterModule } from '@angular/router';

import { SortNumberComponent } from './sort/sort-number/sort-number.component';



const routes: Routes = [
    { path: 'sort',      component: SortNumberComponent },
    { path: '',               redirectTo: '', pathMatch: 'full' }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, {useHash: true})
  ],
  exports: [RouterModule],
})
export class AppRoutingModule { }
