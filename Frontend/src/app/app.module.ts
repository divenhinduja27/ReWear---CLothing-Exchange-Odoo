import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { AuthModule } from './auth/auth.module';
import { NavbarComponent } from './shared/navbar/navbar.component';
import { UserDashboardComponent } from './auth/user-dashboard/user-dashboard.component';
import { ProductsModule } from './products/products.module';
import { HomeModule } from './home/home.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AuthModule,
    ProductsModule,
    HomeModule
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
