
import React, { Component } from 'react';

import './App.css';

import StringHistory from './StringHistory';
import StringInput from './StringInput';

class App extends Component {

  constructor(props) {
    super(props);
    this.state = {inputString: ''};
    this.baseServerApi = this.getServerApiAddress();
    this.handleInputSubmit = this.handleInputSubmit.bind(this)
  }

  render() {
    console.log('I was triggered during App render: ' + this.state.inputString)
    return(
      <div>
        <StringInput serverApiAddress={this.baseServerApi} onInputSubmit={this.handleInputSubmit} />
        <StringHistory serverApiAddress={this.baseServerApi} key={this.state.inputString} />
      </div>
    )
  }

  /**
   * We call the string reverse API, assuming the API is available on the base URL address as
   * "http://localhost:8080/api".
   *
   * Exceptionally, if the base URL ends with app/, it will be unprefixed. See the issue #5 "CORS
   * (Cross-Origin Resource Sharing)".
   */
  getServerApiAddress() {
    var base_api = window.location.href
    var regex = /app\/$/g;
    base_api = base_api.replace(regex, '') + 'api/appendstring/';

    console.log('window.location.href : ' + window.location.href)
    console.log('I was triggered during getServerApiAddress: ' + base_api);
    return base_api;
  }

  handleInputSubmit(newName) {
    console.log('I was triggered during handleInputSubmit: ' + newName)
    this.setState({ inputString: newName });
  }

}

export default App;
