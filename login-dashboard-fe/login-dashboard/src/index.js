import React from "react";
import ReactDOM from "react-dom";
import "./style/index.css";
import Home from "./components/Home";

const rootElement = document.getElementById("root");

ReactDOM.render(
  <React.StrictMode>
    <Home/>
  </React.StrictMode>,
  rootElement
);
