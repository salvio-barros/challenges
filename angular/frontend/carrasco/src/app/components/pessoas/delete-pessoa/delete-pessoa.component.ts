import { Component, OnInit, Inject } from '@angular/core';
import { PessoaService } from '../service/pessoa.service'
import { Router, ActivatedRoute } from '@angular/router';
import { MAT_DIALOG_DATA } from '@angular/material/dialog'

export interface DialogData {
  idPessoaSerRemovido: 0;
}

@Component({
  selector: 'app-delete-pessoa',
  templateUrl: './delete-pessoa.component.html',
  styleUrls: ['./delete-pessoa.component.css']
})

export class DeletePessoaComponent implements OnInit {

  parameterId:string|null = "";
  
  constructor(
    private pessoaService: PessoaService,
    private router: Router,
    private route: ActivatedRoute,
    @Inject(MAT_DIALOG_DATA) public data: DialogData) { 
     
    }

  removerPessoa(): void {
    let idPessoa:number = this.data.idPessoaSerRemovido;
       
    this.pessoaService.remover(idPessoa).subscribe(()=> {
      this.pessoaService.exibirMensagemSucesso('Bolsominion removido com sucesso');
      this.router.navigate(["/pessoas"]);
    })
    
   }

  retornarParaListagem(): void {
    this.router.navigate(['/pessoas'])
  }

  ngOnInit(): void {
  }

}
