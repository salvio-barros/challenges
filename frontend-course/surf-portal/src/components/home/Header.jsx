import React, { Component } from 'react';
import {Link, BrowserRouter as Router} from "react-router-dom";
import Routes from '../home/Routes'

export default class Header extends Component{
    render() {
      return (
        <Router>
        <div>
          <nav class="navbar navbar-expand-lg navbar-light bg-dark">
             
                  <div class="collapse navbar-collapse"> 
                      <nav className="navbar navbar-expand-md navbar-dark bg-blue">
                              <ul className="navbar">
                                  <li className="navbar"><Link to="/">Home</Link></li>
                                  <li className="navbar"><Link to="/cadastro">Cadastro</Link></li>
                              </ul>
                      </nav>
                  </div>
            </nav>
            <hr />
            <Routes/>
        </div>
        </Router>
      );
    }
  }