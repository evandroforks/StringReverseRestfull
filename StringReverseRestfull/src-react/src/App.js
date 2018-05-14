
import React, { Component } from 'react';

import './App.css';

import StringHistory from './StringHistory';
import StringInput from './StringInput';

class App extends Component {

  constructor(props) {
    super(props);
    this.state = {inputString: ''};
    this.handleInputSubmit = this.handleInputSubmit.bind(this)
  }

  render() {
    console.log('I was triggered during App render: ' + this.state.inputString)
    return(
      <div>
        <StringInput onInputSubmit={this.handleInputSubmit} />
        <StringHistory inputString={this.state.inputString} key={this.state.inputString} />
      </div>
    )
  }

  handleInputSubmit(newName) {
    console.log('I was triggered during handleInputSubmit: ' + newName)
    this.setState({ inputString: newName });
  }

}

export default App;
