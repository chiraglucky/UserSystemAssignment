import axios from "axios";
import React, { useEffect,useState } from "react";
import { toast } from "react-toastify";
import { Button, Container, Form, FormGroup, Input } from "reactstrap";
import base_url from "../api/userapi";


const AddUser = () => {
  useEffect(() => {
    document.title = "AddUser:UserManagementSystem";
  }, []);

  const [form,setForm] = useState({});

  const handleChange=(e)=>{
      setForm({ ...form, [e.target.name]: e.target.value })
  }

  //form handler function
  const handleForm=(e)=>{
    e.preventDefault();
    // console.log(form);
    postDataToServer(form)
  }

  //function to post data on server
  const postDataToServer=(data)=>{
      axios.post(`${base_url}/users`,data).then(
          (response)=>{toast.success(response.data)},
          (error)=>{toast.error(error.data)}
      )
  }

  return (
    <>
      <h1 className="text-center my-3">Fill user details</h1>
      <Form onSubmit={handleForm}>
        <FormGroup>
          <label>User Id</label>
          <Input type="text" placeholder="Enter here" name="id" id="iD" onChange={handleChange}/>
        </FormGroup>
        <FormGroup>
          <label>User First Name</label>
          <Input type="text" placeholder="Enter here" name="fname" id="fname" onChange={handleChange}/>
        </FormGroup>
        <FormGroup>
          <label>User Last Name</label>
          <Input type="text" placeholder="Enter here" name="lname" id="lname" onChange={handleChange}/>
        </FormGroup>
        <FormGroup>
          <label>User City</label>
          <Input type="text" placeholder="Enter here" name="city" id="city" onChange={handleChange}/>
        </FormGroup>
        <FormGroup>
          <label>User Mobile</label>
          <Input
            type="text"
            placeholder="Enter here"
            name="mobile"
            id="mobile"
            onChange={handleChange}
          />
        </FormGroup>
        <FormGroup>
          <label>User DOB</label>
          <Input
            id="dob"
            name="dob"
            type="date"
            onChange={handleChange}
          />
        </FormGroup>

        <Container className="text-center">
          <Button type="submit" color="success">Add User</Button>
          <Button type="reset" color="warning m-2" onClick={()=>(setForm({}))}>Clear</Button>
        </Container>
      </Form>
    </>
  );
};

export default AddUser;
