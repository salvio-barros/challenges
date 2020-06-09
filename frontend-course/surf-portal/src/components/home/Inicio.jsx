import React, { Component } from 'react';

class Inicio extends Component {
  componentWillMount(){
    console.log("abriu cadastro")
  }

  
  render() {
      return (
        <div className="App">
           Seja bem vindo ao gerenciador de Produtos
        </div>
      );
    }
}

export default Inicio;