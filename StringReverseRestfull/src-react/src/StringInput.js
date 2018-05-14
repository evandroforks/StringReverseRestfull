
import React, { Component } from 'react';

import './App.css';

class StringInput extends Component {

  constructor(props) {
    super(props);
    this.state = {value: ''};

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    console.log('I was triggered during StringInput constructor: ' + this.state.value)
  }

  handleChange(event) {
    this.setState({value: event.target.value});
  }

  handleSubmit(event) {
    // alert('A name was submitted: ' + this.state.value);
    event.preventDefault();
    this.props.onInputSubmit(this.state.value);
    this.sendStringToServer(this.state.value);
  }

  sendStringToServer(inputString) {
    var base_api = window.location.href
    var regex = /app\/$/g;
    base_api = base_api.replace(regex, '');

    console.log('I was triggered during callStringReverseApi: ' + base_api + inputString)
    fetch(base_api + 'api/appendstring/' + inputString, {
        method: 'GET',
        headers: {
          Accept: 'application/json',
      },
    }).then(response => {

      if (response.ok) {
        console.log('Server response OK!')
      } else {
        throw new Error('Something went wrong ...');
      }
    })
  }

  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        <label>
          Name:
          <input type="text" value={this.state.value} onChange={this.handleChange} />
        </label>
        <input type="submit" value="Submit" />
      </form>
    );
  }

}

export default StringInput;
