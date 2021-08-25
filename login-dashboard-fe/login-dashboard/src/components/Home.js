import React, { Component } from "react";
import "../style/index.css";
import Dashboard from "./Dashboard";
import Login from "./Login";
//import HeaderBar from "./HeaderBar";
import Maintenance from "./Maintenance";
import axios from "axios";

const GET_USERS_URL =
  "https://run.mocky.io/v3/ddd089dc-d880-44c8-a4f2-a6a493d0b0bc";
const LOGGED_USER_STORAGE_KEY = "logged-user";
const GENERIC_PASSWORD = "1234";

export default class Home extends Component {
  constructor(props) {
    super(props);
    let loggedUser = sessionStorage.getItem(LOGGED_USER_STORAGE_KEY);
    this.state = {
      loggedUser: loggedUser ? JSON.parse(loggedUser) : undefined,
      loginError: "",
    };
  }

  async handleLogin(email, password) {
    const users = await axios
      .get(GET_USERS_URL)
      .then((response) => response.data);

    let filteredUsers = users.filter((user) => user.email === email);
    let user = filteredUsers[0];

    if (user && password === GENERIC_PASSWORD) {
      sessionStorage.setItem(LOGGED_USER_STORAGE_KEY, JSON.stringify(user));
      this.setState({
        loggedUser: user,
        loginError: "",
      });
    } else {
      this.setState({
        loginError: `El correo ingresado ${email} no existe`,
      });
    }
  }

  handleLogout() {
    sessionStorage.clear();
    this.setState({
      loggedUser: undefined,
      loginError: "",
    });
  }

  renderScreen() {
    const loggedUser = this.state.loggedUser;

    if (!loggedUser) {
      return (
        <Login
          handleLogin={(email, password) => this.handleLogin(email, password)}
          loginError={this.state.loginError}
        />
      );
    }

    if (loggedUser.rol === "Administrador") {
      return (
        <Dashboard
          loggedUser={this.state.loggedUser}
          handleLogout={() => this.handleLogout()}
        />
      );
    }

    return <Maintenance handleLogout={() => this.handleLogout()} />;
  }

  render() {
    return <div className="home-container">{this.renderScreen()}</div>;
  }
}
