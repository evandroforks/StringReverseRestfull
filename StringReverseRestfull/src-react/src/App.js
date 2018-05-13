
import React, { Component } from 'react';

import './App.css';

class App extends Component {
  constructor() {
      super();
      this.state={responseJson:[]};
  }
  componentDidMount(){
    console.log('I was triggered during componentDidMount')
    fetch(`http://localhost:8080/StringReverseRestfull/api/appendstring/abcd`, {
      method: 'GET',
      headers: {
        Accept: 'application/json',
      },
    },
    ).then(response => {
      if (response.ok) {
        return response.json()
          .then(json => {
            this.setState({responseJson: json})
          })
      } else {
        throw new Error('Something went wrong ...');
      }
    })
  }
  render() {
    const reversed_strings = this.state.responseJson["reversedStrings"]
    const array_length = (reversed_strings || []).length
    // for (var index = 0; index < array_length; index++) {
    //   console.log(reversed_strings[index]);
    // }
    return(
      <ul>
          {array_length ?
            reversed_strings.map(function(value, index) {
              console.log(`render() Mapping index ${index} value: ${value}`);
              return <li key={index}>{value}</li>
            })
            : <li>There is no reversed string history to show...</li>
          }
      </ul>
    )
  }
}

export default App;
