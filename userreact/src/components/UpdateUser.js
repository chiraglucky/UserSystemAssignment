import axios from "axios";
import React, { useEffect, useState } from "react";
import { toast } from "react-toastify";
import { Button, Container, Form, FormGroup, Input } from "reactstrap";
import base_url from "../api/userapi";
import { useParams } from "react-router-dom";

const initialState={
    id:"",
    fname:"",
    lname:"",
    city:"",
    mobile:"",
    dob:""
}

const UpdateUser = () => {

  const params=useParams();

  const [form, setForm] = useState({});

  const [user,setUser] = useState(initialState);

  useEffect(() => {
      document.title="UpdateUser:UserManagementSystem"
      axios.get(`${base_url}/users/${params.id}`).then(
          (response)=>{
              console.log(response.data)
              setUser(response.data)
            }
      )
  }, [])

  //form handler function
  const handleForm=(e)=>{
    e.preventDefault();
    // console.log(form);
    updateDataToServer(user)
  }

  //function to update data on server
  const updateDataToServer=(data)=>{
      console.log(data)
    axios.put(`${base_url}/users`,data).then(
        (response)=>{toast.success(response.data)},
        (error)=>{toast.error(error)}
    )
  }

  return (
    <>
      <h1 className="text-center my-3">Fill user details</h1>
      <Form onSubmit={handleForm}>
        <FormGroup>
          <label>User Id</label>
          <Input
            type="text"
            placeholder={user.id}
            value={user.id}
            name="id"
            id="id"
            onChange={(e)=>{
                setUser({...user,id:e.target.value})
            }}
          />
        </FormGroup>
        <FormGroup>
          <label>User First Name</label>
          <Input
            type="text"
            placeholder={user.fname}
            value={user.fname}
            name="fname"
            id="fname"
            onChange={(e)=>{
                setUser({...user,fname:e.target.value})
            }}
          />
        </FormGroup>
        <FormGroup>
          <label>User Last Name</label>
          <Input
            type="text"
            placeholder={user.lname}
            value={user.lname}
            name="lname"
            id="lname"
            onChange={(e)=>{
                setUser({...user,lname:e.target.value})
            }}
          />
        </FormGroup>
        <FormGroup>
          <label>User City</label>
          <Input
            type="text"
            placeholder={user.city}
            value={user.city}
            name="city"
            id="city"
            onChange={(e)=>{
                setUser({...user,city:e.target.value})
            }}
          />
        </FormGroup>
        <FormGroup>
          <label>User Mobile</label>
          <Input
            type="text"
            placeholder={user.mobile}
            value={user.mobile}
            name="mobile"
            id="mobile"
            onChange={(e)=>{
                setUser({...user,mobile:e.target.value})
            }}
          />
        </FormGroup>
        <FormGroup>
          <label>User DOB</label>
          <Input placeholder={toString(user.dob)} value={user.dob} id="dob" name="dob" type="date" onChange={(e)=>{
                setUser({...user,dob:e.target.value})
            }} />
        </FormGroup>

        <Container className="text-center">
          <Button type="submit" color="success">
            Add User
          </Button>
          <Button type="reset" color="warning m-2" onClick={() => setForm({})}>
            Clear
          </Button>
        </Container>
      </Form>
    </>
  );
};

export default UpdateUser;
