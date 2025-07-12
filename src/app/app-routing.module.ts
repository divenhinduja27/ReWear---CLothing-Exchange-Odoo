import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CoverPageComponent } from './home/cover-page/cover-page.component';
import { LandingComponent } from './home/landing/landing.component';
import { ItemListingComponent } from './products/item-listing/item-listing.component';
import { ProductDetailComponent } from './products/product-detail/product-detail.component';
import { LoginComponent } from './auth/login/login.component';
import { RegisterComponent } from './auth/register/register.component';
import { AdminPanelComponent } from './home/admin-panel/admin-panel.component';
import { UserDashboardComponent } from './auth/user-dashboard/user-dashboard.component';
import { NavbarComponent } from './shared/navbar/navbar.component';

const routes: Routes = [
  {
    path:'',
    component:CoverPageComponent
  },
  {
    path:'landing',
    component:LandingComponent
  },
  {
    path:'itemListing',
    component:ItemListingComponent
  },
  {
    path:'productDetail',
    component:ProductDetailComponent
  },
  {
    path:'login',
    component:LoginComponent
  },
  {
    path:'register',
    component:RegisterComponent
  },
  {
    path:'adminPanel',
    component:AdminPanelComponent
  },
  {
    path:'userDashboard',
    component:UserDashboardComponent
  },
  {
    path: 'navbar',
    component: NavbarComponent
  }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
