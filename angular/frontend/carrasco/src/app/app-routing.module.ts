import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './views/home/home.component';
import { PessoasCrudComponent } from './views/pessoas-crud/pessoas-crud.component';

const routes: Routes = [{
  path: "",
  component: HomeComponent
}, {
  path: "pessoas",
  component: PessoasCrudComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
