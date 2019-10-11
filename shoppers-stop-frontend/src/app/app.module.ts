import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ProductListComponent } from './product-list/product-list.component';
import { FilterComponent } from './filter/filter.component';
import { ProductDescComponent } from './product-desc/product-desc.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    FilterComponent,
    ProductDescComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
