
import React, { Component } from 'react';

import './App.css';

class App extends Component {
  constructor() {
      super();
      this.state={items:[]};
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
        console.log('return response.json(2)')
        var json_read = response.json()
        .then(json => {
          this.setState({items: json})
          console.log("RESPONSE JSON");
          console.log(json);
          console.log(this.state);
          console.log(this.state.items);
        });
        console.log('return response.json()')
        return json_read;
      } else {
        console.log('throw new Error(Something went wrong ...)')
        throw new Error('Something went wrong ...');
      }
    })
  }
  render() {
    const reversed_strings = this.state.items["reversedStrings"]
    const array_length = (reversed_strings || []).length
    console.log("ON RENDER JSON");
    console.log(this.state);
    console.log(this.state.items);
    console.log(this.state.items["reversedStrings"]);
    console.log("array_length: " + array_length);
    for (var index = 0; index < array_length; index++) {
      console.log(reversed_strings[index]);
    }
    return(
      <ul>
          {array_length ?
            reversed_strings.map(function(value, index) {
              console.log(`Mapping index ${index} value ${value}`);
              return <li key={index}>{value}</li>
            })
            : <li>Loading...</li>
          }
      </ul>
    )
  }
}

export default App;
