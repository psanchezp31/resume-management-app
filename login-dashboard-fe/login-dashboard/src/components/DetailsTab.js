import React, { Component } from "react";

export default class CategoriesTab extends Component {
  render() {
    return (
      <div>
        <table>
          <thead>
            <tr>
              <th>Nombre categoría</th>
              <th>Total por categoría</th>
            </tr>
          </thead>
          {/* <tbody id="tbody-categoriesTab">
            <tr>
              <td>🥇 Oro</td>
              <td>{this.props.totals.gold}</td>
            </tr>
            <tr>
              <td>🥈 Plata</td>
              <td>{this.props.totals.silver}</td>
            </tr>
            <tr>
              <td>🥉 Bronce</td>
              <td>{this.props.totals.bronze}</td>
            </tr>
          </tbody> */}
        </table>
      </div>
    );
  }
}
