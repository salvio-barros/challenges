import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pessoas-crud',
  templateUrl: './pessoas-crud.component.html',
  styleUrls: ['./pessoas-crud.component.css']
})
export class PessoasCrudComponent implements OnInit {

  constructor(private router: Router) { }

  navegarParaCriarPessoa(): void {
    console.log('Indo para Criar pessoa')
    this.router.navigate(['/pessoas/criar'])
  }

  ngOnInit(): void {
  }

}
