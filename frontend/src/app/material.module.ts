import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatButtonModule , MatToolbarModule, MatInputModule, MatProgressSpinnerModule,
  MatCardModule, MatListModule} from '@angular/material';

@NgModule({
  imports: [MatButtonModule, MatToolbarModule, MatInputModule, MatProgressSpinnerModule, MatCardModule, MatListModule],
  exports: [MatButtonModule, MatToolbarModule, MatInputModule, MatProgressSpinnerModule, MatCardModule, MatListModule]
})
export class MaterialModule { }
