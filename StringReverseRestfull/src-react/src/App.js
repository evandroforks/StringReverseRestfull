
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
        response.json().then(json => {
          console.log(json);
        });
        console.log('return response.json()')
        return response.json();
      } else {
        console.log('throw new Error(Something went wrong ...)')
        throw new Error('Something went wrong ...');
      }
    })
    .then(items=>this.setState({items}))
    console.log('Contents: ' + this.state.items)
  }
  render() {
      return(
      <ul>
          {this.state.items.length ?
              this.state.items.map(item=><li key={item.id}>{item.body}</li>)
            : <li>Loading...</li>
          }
      </ul>
   )
  }
}

export default App;
