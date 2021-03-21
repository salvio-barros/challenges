import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar'

@Injectable({
  providedIn: 'root'
})
export class PessoaService {

  constructor(private snackBar: MatSnackBar) { }

  exibirMensagemSucesso(msg: string){
    this.snackBar.open(msg,'X',{
      duration: 3000
    })
  }
}
