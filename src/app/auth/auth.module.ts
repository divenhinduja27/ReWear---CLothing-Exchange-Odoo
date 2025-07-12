import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { UserDashboardComponent } from './user-dashboard/user-dashboard.component';
import { ItemListingComponent } from './item-listing/item-listing.component';



@NgModule({
  declarations: [
    LoginComponent,
    RegisterComponent,
    UserDashboardComponent,
    ItemListingComponent
  ],
  imports: [
    CommonModule
  ]
})
export class AuthModule { }
