import React, {useState, useContext} from 'react';
import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';
import {Switch, FormControlLabel} from '@material-ui/core';
import ValidacaoFormulario from './../contexts/ValidacaoFormulario';
import useErros from './../hooks/useErros';


function DadosBasicos(props) {
   
    const [nome,setNome] = useState("");
    const [telefone,setTelefone] = useState("");
    const [email,setEmail] = useState("");
    const [promocoes,setPromocoes] = useState(false);
    
    const validacoes = useContext(ValidacaoFormulario);
    const [erros, validarCampos] = useErros(validacoes);
    
    return (
        <form onSubmit={
            (event) => {
                event.preventDefault();
                props.aoSubmeter({nome,telefone,email});
            }
        }>
            <TextField name="nome" value={nome} onChange={(event) => setNome(event.target.value)} id="nome" label="Nome" variant="outlined" margin="normal" fullWidth/>
            <TextField name="telefone" value={telefone} onChange={(event) => setTelefone(event.target.value)}  error={!erros.telefone.valido}  helperText={erros.telefone.mensagem} onBlur={validarCampos} id="telefone" label="Telefone" variant="outlined"  margin="normal" fullWidth/>
            <TextField name="email" value={email} onChange={(event) => setEmail(event.target.value)} id="email" label="Email" variant="outlined"  margin="normal" fullWidth/>
            <FormControlLabel
                label="Promoções"
                control={<Switch 
                   checked={promocoes}
                   onChange={(event) => setPromocoes(event.target.checked)} 
                   id="notificarPromocoes" 
                   label="Notificar sobre promoções"/>}
            />
            <Button type="submit" variant="outlined"color="primary">Cadastrar</Button>
        </form>
    );
}
function cadastrar(dados) {
    console.log(dados);
 }

export default DadosBasicos;