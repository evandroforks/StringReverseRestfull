
import React, { Component } from 'react';

import './App.css';

class StringHistory extends Component {

  constructor(props) {
      super(props);
      this.state={responseJson:[]};
      console.log('I was triggered during StringHistory constructor: ' + this.props.inputString)
  }

  componentDidMount() {
    this.callStringReverseApi()
  }

  callStringReverseApi() {
    var inputString = this.props.inputString

    if(inputString.length){
      console.log('I was triggered during callStringReverseApi: ' + inputString)
      fetch('http://localhost:3000/appendstring/'
        + inputString, {
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
    } else {
      console.log('I was triggered during callStringReverseApi with no input')
    }
  }

  render() {
    console.log('I was triggered during StringHistory render(): ' + this.props.inputString)
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
