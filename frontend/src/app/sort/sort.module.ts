import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MaterialModule } from './material.module';

import { SortRoutingModule } from './sort-routing.module';
import { SortService } from './sort.service';
import { SortNumberComponent } from './sort-number/sort-number.component';

@NgModule({
  imports: [
    CommonModule, FormsModule, MaterialModule,
    SortRoutingModule
  ],
  declarations: [SortNumberComponent]
})
export class SortModule { }
