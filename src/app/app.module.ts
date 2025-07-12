import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LandingComponent } from './home/landing/landing.component';
import { CoverPageComponent } from './home/cover-page/cover-page.component';

@NgModule({
  declarations: [
    AppComponent,
    LandingComponent,
    CoverPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
