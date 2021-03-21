import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './views/home/home.component';
import { PessoasCrudComponent } from './views/pessoas-crud/pessoas-crud.component';
import { CreatePessoaComponent } from './components/pessoas/create-pessoa/create-pessoa.component';

const routes: Routes = [{
  path: "",
  component: HomeComponent
}, {
  path: "pessoas",
  component: PessoasCrudComponent
},{
  path: "pessoas/criar",
  component: CreatePessoaComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
