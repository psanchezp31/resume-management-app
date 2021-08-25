import React, { Component } from "react";
import HeaderBar from "./HeaderBar";
import Tabs from "./Tabs";
import GeneralTab from "./GeneralTab";
import DetailsTab from "./DetailsTab";
import Loading from "./Loading";
import axios from "axios";

const PERSONS_RESOURCE_URL = "http://localhost:8080/persons/";

export default class Dashboard extends Component {
  constructor(props) {
    super(props);
    this.state = {
      persons: [],
      isDataLoaded: false,
    };
  }

  componentDidMount() {
    this.loadPersons();
  }

  loadPersons() {
    axios
      .get(PERSONS_RESOURCE_URL)
      .then((response) => response.data)
      .then((data) => {
        console.log("data loaded: " + data);
        const isEmpty = data === "";
        this.setState({
          persons: isEmpty ? [] : data,
          isDataLoaded: true,
        });
      });
    console.log("Dashboard state: " + JSON.stringify(this.state));
  }

  deletePerson(id) {
    const deleteUrl = PERSONS_RESOURCE_URL + id;
    axios
      .delete(deleteUrl)
      .catch((err) => {
        console.log(err);
      })
      .finally(() => {
        console.log("Finally!");
        this.setState({
          isDataLoaded: false,
        });
        this.loadPersons();
      });
  }

  renderWithLoading(input) {
    return this.state.isDataLoaded ? input : <Loading />;
  }

  renderTabs() {
    return (
      <Tabs>
        <div label="General">
          <GeneralTab
            persons={this.state.persons}
            deletePerson={(id) => this.deletePerson(id)}
          />
        </div>
        <div label="Details">
          <DetailsTab totals={this.state.persons} />
        </div>
      </Tabs>
    );
  }

  render() {
    return (
      <div>
        <HeaderBar
          loggedUser={this.props.loggedUser}
          handleLogout={this.props.handleLogout}
        />
        <div className="dashboard-container">
          {this.renderWithLoading(this.renderTabs())}
        </div>
      </div>
    );
  }
}
