import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { BrandsComponent } from './brands/brands.component';
import { TransportsComponent } from './transports/transports.component';
import { Routes, RouterModule } from '@angular/router';
import { DataComponent } from './data/data.component';
import { DatadetailsComponent } from './datadetails/datadetails.component';
import { ServeComponent } from './serve/serve.component';

import { HttpClient, HttpClientModule } from '@angular/common/http';
import { DataService } from './data.service';
import { FormsModule} from '@angular/forms';

const routes: Routes = [
  {path:" ",component:HomeComponent},
  {path:"brands", component:BrandsComponent}, 
  {path:"transporters" ,component:TransportsComponent},
  {path:"datadetails/:id",component:DatadetailsComponent},
  {path:"data", component:DataComponent,
  children:[
    {path:"datadetails/:id",component:DatadetailsComponent}
  ]}
 

];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    BrandsComponent,
    TransportsComponent,
    DataComponent,
    DatadetailsComponent,
    ServeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
     [RouterModule.forRoot(routes)]
 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
