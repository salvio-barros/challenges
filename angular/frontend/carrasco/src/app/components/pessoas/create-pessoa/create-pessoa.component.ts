import { Component, OnInit } from '@angular/core';
import { PessoaService } from '../service/pessoa.service'
import { Router } from '@angular/router';
import { GrauPericulosidade } from '../model/GrauPericulosidade';
import { Pessoa } from '../model/Pessoa'


@Component({
  selector: 'app-create-pessoa',
  templateUrl: './create-pessoa.component.html',
  styleUrls: ['./create-pessoa.component.css']
})
export class CreatePessoaComponent implements OnInit {

  listaGrauPericulosidade: GrauPericulosidade[] = [
    {valor: 1, label: 'Baixo'},
    {valor: 2, label: 'Médio'},
    {valor: 3, label: 'Alto'}
  ];

  pessoa: Pessoa = {
    nome: '',
    observacao: '',
    grauPericulosidade: 1,
    arrependido: false
  }

  constructor(
    private pessoaService: PessoaService,
    private router: Router) { }

  criarPessoa(): void{
    console.log('Chamando Criar Bolsominion :' + this.pessoa)
    this.pessoaService.cadastrar(this.pessoa).subscribe(()=> {
        this.pessoaService.exibirMensagemSucesso('Bolsominion criado com sucesso');
    })
   }

  limparCampos(): void{
    console.log('Limpando a tela');
  }

  retornar(): void{
    console.log('Voltando para Menu Inicial de Pessoas');
    this.router.navigate(['/pessoas'])
  }
  ngOnInit(): void {
  }

}
