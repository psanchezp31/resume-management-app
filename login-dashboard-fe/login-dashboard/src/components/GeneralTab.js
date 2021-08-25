import React, { Component } from "react";

export default class GeneralTab extends Component {
  render() {
    return (
      <div>
        <table>
          <thead>
            <tr>
              <th>Full Name</th>
              <th>Age</th>
              <th>Phone</th>
              <th>City</th>
              <th>Email</th>
              <th>Occupation</th>
              <th>Education</th>
              <th>Experience</th>
              <th>Details</th>
              <th>Edit</th>
              <th>Delete</th>
            </tr>
          </thead>
          <tbody>
            {this.props.persons.map((person, index) => (
              <tr key={index}>
                <td>{person.fullname}</td>
                <td>{person.age}</td>
                <td>{person.phone}</td>
                <td>{person.city}</td>
                <td>{person.email}</td>
                <td>{person.occupation}</td>
                <td>{person.educationList.length}</td>
                <td>{person.experienceList.length}</td>
                <td>
                  <button>
                    <i className="fas fa-eye"></i>
                  </button>
                </td>
                <td>
                  <button>
                    <i className="fas fa-user-edit"></i>
                  </button>
                </td>
                <td>
                  <button onClick={(e) => this.props.deletePerson(person.personId, e)}>
                    <i className="fas fa-user-minus"></i>
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}
