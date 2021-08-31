import React from 'react';
import Pdf from "react-to-pdf";
import './PDF.css';

const ref = React.createRef();

const PDF = (props) => {
  return (
    <>
      <div className="Post" ref={ref}>
        <h2>{props.fullName}</h2>
        <p>Age: {props.age}</p>
        <p>Phone: {props.phone}</p>
        <p>City: {props.city}</p>
        <p>Ocupation: {props.ocupation}</p>
        <p>Description: {props.description}</p>
        <p>GitHub: {props.gitHub}</p>
        <p>LinkedIn: {props.linkedIn}</p>
        <p>Program Name: {props.programName}</p>
        <p>End Date: {props.endDate}</p>
        <p>Institution: {props.institucion}</p>
        <p>Rol: {props.rol}</p>
        <p>End Date: {props.endDateWork}</p>
        <p>Company: {props.company}</p>
        <p>Responsibilities: {props.responsibilities}</p>
        <p>Achievements: {props.achievements}</p>
        <p>skills: {props.skills}</p>
        <p>Hobbies: {props.hobbies}</p>
        <p>Languages: {props.languages}</p>
      </div>
      <Pdf targetRef={ref} filename="curriculum.pdf">
        {({ toPdf }) => <button onClick={toPdf}>Capture as PDF</button>}
      </Pdf>
    </>
  );
}

export default PDF;