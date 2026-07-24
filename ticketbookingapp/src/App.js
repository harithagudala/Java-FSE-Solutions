import React, { Component } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

class App extends Component {

  constructor() {
    super();

    this.state = {
      loggedIn: false
    };
  }

  login = () => {
    this.setState({
      loggedIn: true
    });
  };

  logout = () => {
    this.setState({
      loggedIn: false
    });
  };

  render() {

    return (

      <div style={{ padding: "20px" }}>

        <h1>Ticket Booking App</h1>

        {this.state.loggedIn ? (
          <div>

            <button onClick={this.logout}>
              Logout
            </button>

            <UserPage />

          </div>
        ) : (
          <div>

            <button onClick={this.login}>
              Login
            </button>

            <GuestPage />

          </div>
        )}

      </div>

    );
  }
}

export default App;