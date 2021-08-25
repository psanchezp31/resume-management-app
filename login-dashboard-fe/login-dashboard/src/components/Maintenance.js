import React, { Component } from "react";
import maintenance from "../assets/img/maintenance-image.png";

export default class Maintenance extends Component {
  render() {
    return (
      <div className="maintenance-container">
        <div className="maintenance-message">
          This website is under maintenance. <br></br>
          Sorry for the inconveniences, we'll be back soon.
        </div>
        <div className="maintenance-image">
          <img src={maintenance} alt="maintenance" />
        </div>
        <div className="button-container">
          <button className="logout-button" onClick={this.props.handleLogout}>
            Go to home page
          </button>
        </div>
      </div>
    );
  }
}
