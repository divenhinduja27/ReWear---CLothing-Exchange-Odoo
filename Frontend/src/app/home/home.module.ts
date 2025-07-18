import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminPanelComponent } from './admin-panel/admin-panel.component';
import { LandingComponent } from './landing/landing.component';
import { CoverPageComponent } from './cover-page/cover-page.component';
import { RouterModule } from '@angular/router';



@NgModule({
  declarations: [
    AdminPanelComponent,
    LandingComponent,
    CoverPageComponent
  ],
  imports: [
    CommonModule,
    RouterModule
  ]
})
export class HomeModule { }
