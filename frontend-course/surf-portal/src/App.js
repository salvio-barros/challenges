import React, { Component } from 'react';
import Header from './components/home/Header'
import Footer from './components/home/Footer'
import Routes from './components/home/Routes';
import './App.css';
import { BrowserRouter as Router, Route, Switch} from "react-router-dom";



class App extends Component {
  render() {
    return (
      <div className="App">
           <Header/>
          < Footer/>
       </div>
    );
  }
}

export default App;
