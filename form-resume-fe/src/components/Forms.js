import React, {Fragment} from 'react';
import './Forms.css';

const Form = () => {
    return (
        <Fragment>
            <h1 className="title"><strong>Your Curriculum</strong></h1>
            <form className="inputs">
                <div className="col">
                <h2 className="title2"><strong>Personal Information</strong></h2>
                <br></br>

                    <input
                        placeholder="Full name"
                        type="text"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="Age"
                        type="number"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="Phone"
                        type="number"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="City"
                        type="text"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="Email"
                        type="email"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="Ocupation"
                        type="text"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="Description"
                        type="text"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="GitHub link profile"
                        type="text"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="LinkedIn link profile"
                        type="text"
                        className="form-control"
                    ></input>

                    <br></br>
                    <h2 className="title2"><strong>Education</strong></h2>
                    <br></br>
                    <input
                        placeholder="Program name"
                        type="text"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="End date"
                        type="date"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="Institution"
                        type="text"
                        className="form-control"
                    ></input>

                    <br></br>
                    <h2 className="title2"><strong>Experience</strong></h2>
                    <br></br>
                    <input
                        placeholder="Rol"
                        type="text"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="End date"
                        type="date"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="Company"
                        type="text"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="Responsibilities"
                        type="text"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="Achievements"
                        type="text"
                        className="form-control"
                    ></input>

                    <br></br>
                    <h2 className="title2"><strong>Soft Skills</strong></h2>
                    <br></br>
                    <input
                        placeholder="Skills"
                        type="text"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="Hobbies"
                        type="text"
                        className="form-control"
                    ></input>

                    <br></br>
                    <input
                        placeholder="Languages"
                        type="text"
                        className="form-control"
                    ></input>
                    <br></br>
                    <button type="submit" class="btn btn-primary">Download PDF</button>
                </div>
            </form>
        </Fragment>
    );
}

export default Form;