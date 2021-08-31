import React, { Component } from 'react';
import PDF from './PDF';
import './Post.css'

class Post extends Component {
  state = {
    fullName: '',
    content: '',
    image: '',
    age: 18,
    phone: 0,
    city: '',
    email: '',
    ocupation: '',
    description: '',
    gitHub: '',
    linkerdIn: '',
    programName: '',
    endDateStudent: '',
    institution: '',
    rol: '',
    endDateWork: '',
    company: '',
    responsibilities: '',
    Achievements: '',
    skills: '',
    hobbies: '',
    languages: '',
    postSubmitted: false
  }

  onChange = input => e => {
    this.setState({
      [input]: e.target.value
    });
  }

  sunmitPost = (e) => {

    if(!this.state.fullName){
      alert('All fields are required!');
      e.preventDefault();
    }else {
      this.setState({
        postSubmitted: true
      });
    }
  }

  render(){
    return(
      <>
        { !this.state.postSubmitted ?
          (
          <form className="inputs" method="post">
          <h1 className="title"><strong>Your Curriculum</strong></h1>
            <fieldset>
            <div className="col">
              <h2 className="title2"><strong>Personal Information</strong></h2>
                <br></br>
                <input
                  placeholder="Full name"
                  type="text"
                  className="form-control"
                  onChange={this.onChange('fullName')}
                  ></input>

                <br></br>
                <input
                  placeholder="Age"
                  type="number"
                  className="form-control"
                  onChange={this.onChange('age')}
                  ></input>

                <br></br>
                <input
                  placeholder="Phone"
                  type="number"
                  className="form-control"
                  onChange={this.onChange('phone')}
                  ></input>

                <br></br>
                <input
                  placeholder="City"
                  type="text"
                  className="form-control"
                  onChange={this.onChange('city')}
                  ></input>

                <br></br>
                <input
                    placeholder="Email"
                    type="email"
                    className="form-control"
                    onChange={this.onChange('email')}
                ></input>

                <br></br>
                <input
                  placeholder="Ocupation"
                  type="text"
                  className="form-control"
                  onChange={this.onChange('ocupation')}
                ></input>

                <br></br>
                <input
                  placeholder="Description"
                  type="text"
                  className="form-control"
                  onChange={this.onChange('Description')}
                ></input>

                <br></br>
                <input
                  placeholder="GitHub link profile"
                  type="text"
                  className="form-control"
                  onChange={this.onChange('gitHub')}
                ></input>

                <br></br>
                <input
                  placeholder="LinkedIn link profile"
                  type="text"
                  className="form-control"
                  onChange={this.onChange('linkedIn')}
                ></input>

                <br></br>
                <h2 className="title2"><strong>Education</strong></h2>
                <br></br>
                <input
                  placeholder="Program name"
                  type="text"
                  className="form-control"
                  onChange={this.onChange('promamName')}
                ></input>

                <br></br>
                <input
                  placeholder="End date"
                  type="date"
                  className="form-control"
                  onChange={this.onChange('endDateStudent')}
                ></input>

                <br></br>
                  <input
                  placeholder="Institution"
                  type="text"
                  className="form-control"
                  onChange={this.onChange('institucion')}
                ></input>

                <br></br>
                <h2 className="title2"><strong>Experience</strong></h2>
                <br></br>
                <input
                  placeholder="Rol"
                  type="text"
                  className="form-control"
                  onChange={this.onChange('rol')}
                ></input>

                <br></br>
                  <input
                    placeholder="End date"
                    type="date"
                    className="form-control"
                    onChange={this.onChange('endDateWork')}
                  ></input>

                <br></br>
                <input
                  placeholder="Company"
                  type="text"
                  className="form-control"
                  onChange={this.onChange('company')}
                ></input>

                <br></br>
                <input
                  placeholder="Responsibilities"
                  type="text"
                  className="form-control"
                  onChange={this.onChange('responsibilities')}
                >
                </input>

                <br></br>
                <input
                  placeholder="Achievements"
                  type="text"
                  className="form-control"
                  onChange={this.onChange('achievements')}
                ></input>

                <h2 className="title2"><strong>Soft Skills</strong></h2>
                <br></br>
                <input
                  placeholder="Skills"
                  type="text"
                  className="form-control"
                  onChange={this.onChange('skills')}
                ></input>

                <br></br>
                  <input
                    placeholder="Hobbies"
                    type="text"
                    className="form-control"
                    onChange={this.onChange('hobbies')}
                  ></input>

                <br></br>
                  <input
                    placeholder="Languages"
                    type="text"
                    className="form-control"
                    onChange={this.onChange('languages')}
                  ></input>

                  <br></br>
                  <button type="button" onClick={this.sunmitPost} className="btn btn-primary">Submit</button>

            </div>
            </fieldset>
          </form>
          ) : (
          <PDF  fullName={this.state.fullName} age={this.state.age} phone={this.state.phone}
                city={this.state.city} email={this.state.email} ocupation={this.state.ocupation}
                description={this.state.description} github={this.state.github} linkedIn={this.state.linkedIn}
                programName={this.state.programName} endDate={this.state.endDateStudent} institution={this.state.institucion}
                rol={this.state.rol} endDateWork={this.state.endDateWork} company={this.state.company}
                responsibilities={this.state.responsibilities} Achievements={this.state.achievements}
                skills={this.state.skills} hobbies={this.state.hobbies} languages={this.state.languages}
                />
            )
          }
      </>
    );
  }
}

export default Post;