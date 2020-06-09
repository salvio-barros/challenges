import React, { Component } from 'react';
import Input from '@material-ui/core/Input';
import TextField from '@material-ui/core/TextField';
import InputLabel from '@material-ui/core/InputLabel';
import Button from '@material-ui/core/Button';
import MenuItem from '@material-ui/core/MenuItem';
import {Select } from '@material-ui/core';

import IconButton from '@material-ui/core/IconButton';

import {ServiceAPI as shopAPI} from '../../common/backend' ;


const fieldStyle = {
  textAlign: 'initial',
  width: '600px',
  display: 'flex', 
  flexWrap: 'wrap'
};

const comboStyle = {
  textAlign: 'initial',
  width: '200px',
  display: 'flex', 
  flexWrap: 'wrap'
};

const incrementStyle = {
  textAlign: 'center',
  width: '200px',
  display: 'flex', 
  flexWrap: 'wrap'
};

const labelStyle = {
  textAlign: 'left',
  width: '400px'
};


class Cadastro extends Component {

   constructor(props) {
    super(props);
    this.state = {
      nome: "",
      descricao: "",
      tamanho: "",
      categoria: "",
      qtdItens:0,
    };

    this.handleDiminuir = this.handleDiminuir.bind(this);
    this.handleIncrement = this.handleIncrement.bind(this);
    this.handleChange = this.handleChange.bind(this);
    this.reset = this.reset.bind(this);
    this.cadastrar = this.cadastrar.bind(this);
  }

  handleDiminuir (){
    this.setState({
      qtdItens: this.state.qtdItens - 1
    });
  }

  handleIncrement (){
    this.setState({
      qtdItens: this.state.qtdItens + 1
    });
  }

  handleChange(e) {
    console.log(e.target.name)
    this.setState({
      [e.target.name]:e.target.value 
     })
   }

  cadastrar() {
    this.data = JSON.stringify(this.state)
    console.log(this.data)
  }

  reset (){
    this.setState({
      state: {}
    });
  }

    render() {
       
      return (
          <form>
                <div textAlign="left">
                  <InputLabel style={labelStyle} id="label-nome">Nome do Produto</InputLabel>
                  <Input style={fieldStyle} name="nome" value={this.state.nome} onChange={this.handleChange}/>
                </div>
                <div>
                  <InputLabel style={labelStyle} id="label-descricao">Descrição do Produto</InputLabel>
                  <TextField  style={fieldStyle} multiline rows={2}
                        rowsMax={4} name="descricao" value={this.state.descricao} onChange={this.handleChange}/>
                </div>
              
                <div flexWrap="wrap" display="flex">
                  <InputLabel style={labelStyle} htmlFor="qtd-produto" id="label-descricao">Quantidade</InputLabel>
                  <div style={incrementStyle}>
                    <Button onClick={this.handleDiminuir}>-</Button>{this.state.qtdItens}<Button onClick={this.handleIncrement}>+</Button>
                  </div> 
                </div>
                
                <InputLabel style={labelStyle} htmlFor="qtd-produto" id="label-descricao">Categoria</InputLabel>
                <Select style={comboStyle} labelId="label" id="select" 
                      onChange={this.handleChange} name="categoria" value={this.state.categoria}>
                  <MenuItem value="1">Meninas</MenuItem>
                  <MenuItem value="2">Meninos</MenuItem>
                  <MenuItem value="3">Bebês</MenuItem>
                  <MenuItem value="4">Acessórios</MenuItem>
                </Select>
                
                <InputLabel style={labelStyle} htmlFor="qtd-produto" id="label-descricao">Tamanho</InputLabel>
                <Select style={comboStyle} labelId="label" id="select" 
                    onChange={this.handleChange} name="tamanho" value={this.state.tamanho}>
                  <MenuItem value="P">Pequeno</MenuItem>
                  <MenuItem value="M">Médio</MenuItem>
                  <MenuItem value="G">Grande</MenuItem>
                </Select>
              
                <InputLabel style={labelStyle} htmlFor="icon-button-file">
                  Selecione uma imagem para seu produto
                  <IconButton color="primary" aria-label="upload picture" component="span">
                  <input accept="image/*" id="icon-button-file" type="file" />
                  </IconButton>
                </InputLabel>

                <Button onClick={this.cadastrar} variant="outlined" color="primary">Cadastrar</Button>
                <Button onClick={this.reset} variant="outlined" color="primary">Limpar Campos</Button>
            </form>
       );
    }
  }
  
  export default Cadastro;
  