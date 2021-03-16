import React, {useState, useEffect} from 'react';
import DadosBasicos from './DadoBasicos';
import DadosEntrega from './DadosEntrega';
import {Container } from "@material-ui/core"
import {validarTelefone, validarCEP} from './../../common/validacoes.js';
import ValidacaoFormulario from './../contexts/ValidacaoFormulario'

function FormularioCliente(props) {
    
    const [etapa,setEtapa] = useState(0);

    const [dadosPreenchidos,setDadosPreenchidos] = useState({});

    useEffect(() => {
       console.log(dadosPreenchidos);
    })

    const formularios =
     [
        <DadosBasicos aoSubmeter={consolidarDados} aoRetornar={anterior}/>,
        <DadosEntrega aoSubmeter={consolidarDados} aoRetornar={anterior}/>
     ];

    return (
        <Container>
           <ValidacaoFormulario.Provider value={{telefone: validarTelefone, cep: validarCEP}}>
                {formularios[etapa]}
           </ValidacaoFormulario.Provider>
        </Container>
    );

    function consolidarDados(dados){
        console.log("Dados até aqui: "+ dados);
        setDadosPreenchidos({...dadosPreenchidos,...dados});
        proximo();
    }


    function proximo(){
        let nextStep = etapa + 1;
        console.log("Proxima etapa: " + nextStep);
        setEtapa(nextStep);
    }
    
    
    function anterior(){
        let previousStep = etapa - 1;
        console.log("etapa a voltar: " + previousStep);
        setEtapa(previousStep);
    }
}



export default FormularioCliente;