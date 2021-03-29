import { AfterViewInit, Component, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTable } from '@angular/material/table';
import { Pessoa } from '../model/Pessoa';
import { PessoaService } from '../service/pessoa.service';
import {MatDialog, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { DeletePessoaComponent } from '../delete-pessoa/delete-pessoa.component';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-list-pessoas',
  templateUrl: './list-pessoas.component.html',
  styleUrls: ['./list-pessoas.component.css']
})
export class ListPessoasComponent implements AfterViewInit {
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;
  @ViewChild(MatTable) table!: MatTable<Pessoa[]>;
    
  pessoas: Pessoa[] = [
   
  ];
  descricao: string = "";


  /** Columns displayed in the table. Columns IDs can be added, removed, or reordered. */
  displayedColumns = ['id', 'nome','grauPericulosidade','arrependido','acoes'];

  

  constructor(private pessoaService: PessoaService, 
    private dialog: MatDialog) {
    // this.pessoaService.obterPessoas().subscribe((listaPessoas)=> {
    //   console.log('servico'+listaPessoas);
    //   this.pessoas = listaPessoas; });
    // console.log('pessoas obtidas'+this.pessoas);
  }

  obterDescricaoPericulosidade(valor: number): string{
    if(valor == 1){
      return "Baixo";
    }
   else if(valor == 2){
       return "Médio";
    }
   else{
      return "Alto";
    }
  }

  openDialog(id:number ) {
    this.dialog.open(DeletePessoaComponent, {
      data: {
        idPessoaSerRemovido: id
      }
    });
     console.log("Id number " + id)
     this.dialog.afterAllClosed.subscribe(data=> this.ngAfterViewInit() )
  }

  ngAfterViewInit(): void {
    this.pessoaService.obterPessoas().subscribe((listaPessoas)=> {
      console.log('servico'+listaPessoas);
      this.pessoas = listaPessoas; });
  }
}
