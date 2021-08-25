import React, { Component } from "react";

export default class HeaderBar extends Component {
  
  render() {
    return (
      <div className="header-info-bar-container">
        <div id="header-bar-items">
          <div className="left-side">
            <button className="logout-button" onClick={this.props.handleLogout}>Log out</button>
            <i className="fas fa-users-cog icon"></i>
          </div>
          <div className="user right-side">
          <div className="user">{this.props.loggedUser.name}</div>
          <div className="user">{this.props.loggedUser.rol}</div>
          </div>
                   
        </div>
      </div>
    );
  }
}
