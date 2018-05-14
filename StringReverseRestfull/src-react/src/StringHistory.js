
import React, { Component } from 'react';

import './App.css';

class StringHistory extends Component {

  constructor(props) {
      super(props);
      this.state={responseJson:[]};
      console.log('I was triggered during StringHistory constructor')
  }

  componentDidMount() {
    this.callStringReverseApi()
  }

  callStringReverseApi() {

    fetch(this.props.serverApiAddress, {
        method: 'GET',
        headers: {
          Accept: 'application/json',
      },
    }).then(response => {

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
    console.log('I was triggered during StringHistory render()')
    const reversed_strings = this.state.responseJson["reversedStrings"]
    const array_length = (reversed_strings || []).length
    // for (var index = 0; index < array_length; index++) {
    //   console.log(reversed_strings[index]);
    // }
    return(
      <ol>
          {array_length ?
            reversed_strings.map(function(value, index) {
              console.log(`render() Mapping index ${index} value: ${value}`);
              return <li key={index}>{value}</li>
            })
            :<b></b>
          }
      </ol>
    )
  }

}

export default StringHistory;
