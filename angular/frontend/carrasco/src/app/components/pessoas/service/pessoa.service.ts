import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar'
import { HttpClient } from '@angular/common/http'
import { Pessoa } from '../model/Pessoa'
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class PessoaService {

  URL:string = "http://localhost:3001/pessoas/";

  constructor(private snackBar: MatSnackBar,
    private httpClient: HttpClient) { }

  exibirMensagemSucesso(msg: string){
    this.snackBar.open(msg,'X',{
      duration: 3000
    })
  }

  cadastrar(pessoa: Pessoa): Observable<Pessoa>{
    return this.httpClient.post<Pessoa>(this.URL,pessoa);
  }
}