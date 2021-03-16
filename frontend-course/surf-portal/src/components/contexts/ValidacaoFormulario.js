import React from 'react';

const ValidacoesFormulario = React.createContext(
    { 
        telefone: semValidacao, 
        cep: semValidacao,
    });

function semValidacao(dados) {
    console.log(dados);
    return {valido: true, mensagem: "" };
  }

export default ValidacoesFormulario