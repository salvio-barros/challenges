function validarCEP(cep){
    if(cep.length > 8){
        return {valido: true , mensagem: "CEP deve possuir no máximo 8 digitos"};
    }
 }

function validarTelefone(telefone){
   console.log(telefone);
    if(telefone.length > 9){
       return {valido: false , mensagem: "Telefone deve possuir no máximo 9 digitos"};
    }
}

export {validarCEP, validarTelefone};
