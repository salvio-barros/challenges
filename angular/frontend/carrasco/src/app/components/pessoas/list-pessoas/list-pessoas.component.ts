import { AfterViewInit, Component, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTable } from '@angular/material/table';
import { Pessoa } from '../model/Pessoa';
import { PessoaService } from '../service/pessoa.service';

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
  displayedColumns = ['id', 'nome','grauPericulosidade','arrependido'];

  

  constructor(private pessoaService: PessoaService) {
    this.pessoaService.obterPessoas().subscribe((listaPessoas)=> {
      console.log('servico'+listaPessoas);
      this.pessoas = listaPessoas; });
    console.log('pessoas obtidas'+this.pessoas);
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

  ngAfterViewInit(): void {
   
  }
}
