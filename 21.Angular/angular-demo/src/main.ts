import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { environment } from './environments/environment';

// import AppModule from "./app/app.module";
// import AppModule from "./01_databinging/app.module";
// import AppModule from "./02_databinging/app.module";
// import {AppModule} from "./03_databinding/app.module"
// import AppModule from "./doubts/app.module"
// import {AppModule} from "./04_parent-child/app.module";
// import {AppModule} from "./05_directives/app.module";
// import AppModule from './practice_01/app.module';
// import { AppModule } from './06_badges/app.module';
// import { AppModule } from './07_directives/app.module';
// import { AppModule } from './07_doubts/app.module';
// import { AppModule } from './08_pipes/app.module';
// import { AppModule } from './08_doubts/app.module';
// import { AppModule } from './09_forms/app.module';
// import { AppModule } from './10_services/app.module';
// import { AppModule } from './11_fetch/app.module';
// import AppModule from './12_http/app.module';
// import AppModule from './13_changeDetection/app.module';
// import AppModule from './14_spa/app.module';
// import AppModule from './15_books/app.module';
// import {AppModule} from './16_nested/app.module';
import {AppModule} from './17-ng-bootstrap/app.module';




if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));
