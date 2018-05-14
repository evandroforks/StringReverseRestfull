
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

  /**
   * Call the string reverse API excepting it the API is available on the base URL address as
   * "http://localhost:8080/api". Exceptionally, if the base URL ends with app/, it will be
   * unprefixed. See the issue #5 "CORS (Cross-Origin Resource Sharing)".
   */
  callStringReverseApi() {
    var inputString = this.props.inputString

    if(inputString.length){
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
