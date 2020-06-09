import React, { Component } from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import Cadastro from '../cadastro/Cadastro'
import Inicio from '../home/Inicio';

class Routes extends Component {
    render() {
      return (
          <Switch>
            <Route exact path="/">
               <Inicio />
            </Route>
            <Route path="/cadastro">
               <Cadastro />
            </Route>
         </Switch>
      );
    }
}
export default Routes;