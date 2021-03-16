import React, {useState} from 'react';
import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';

function DadosEntrega(props) {
   
    const fieldStyle = {
        textAlign: 'initial',
        width: '600px',
        display: 'flex', 
        flexWrap: 'wrap'
      };

    const [cep,setCep] = useState("");
    const [endereco,setEndereco] = useState("");
    const [cidade,setCidade] = useState("");
    const [uf,setUf] = useState("");
    
    return (
        <form onSubmit={
            (event) => {
                event.preventDefault();
                props.aoSubmeter({cep,endereco,cidade,uf});
            }
        }>
            <TextField value={cep} style={fieldStyle} width="10" onChange={(event) => setCep(event.target.value)} id="cep" label="CEP" variant="outlined" margin="normal"/>
            <TextField value={endereco} onChange={(event) => setEndereco(event.target.value)} id="endereco" label="Endereço" variant="outlined"  margin="normal" fullWidth/>
            <TextField value={cidade} style={fieldStyle} onChange={(event) => setCidade(event.target.value)} id="cidade" label="Cidade" variant="outlined"  margin="normal"/>
            <TextField value={uf} style={fieldStyle} onChange={(event) => setUf(event.target.value)} id="uf" label="UF:" variant="outlined"  margin="normal"/>
            
            <Button onClick={(event) => props.aoRetornar()} variant="outlined"color="primary">Retornar</Button>
            <Button type="submit" variant="outlined"color="primary">Avançar</Button>
        </form>
    );
}
function cadastrar(dados) {
    console.log(dados);
 }

export default DadosEntrega;