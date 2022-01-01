import axios from 'axios';
import React from 'react'
import { Link } from 'react-router-dom';
import { toast } from 'react-toastify';
import { Button, Card, CardBody, CardSubtitle, CardText, Container } from 'reactstrap';
import base_url from '../api/userapi';

const User = ({user,update}) => {

    const deleteUser=(id)=>{
        axios.delete(`${base_url}/users/${id}`).then(
            (response)=>{
                toast.success(response.data)
                update(id)
            },
            (error)=>{
                toast.error(error.data)
            }
        )
    }

    return (
        <>
          <Card className='text-center'>
              <CardBody>
                  <CardSubtitle><b>{user.fname +" "+ user.lname}</b></CardSubtitle>
                  <CardText>{user.city}</CardText>
                  <Container>
                      <Button color="danger m-2" onClick={()=>{deleteUser(user.id)}}>Delete</Button>
                      {/* <Button color="warning" onClick={()=>{updateUser(user.id)}}>Update</Button> */}
                      <Link className='btn btn-warning' tag="a" to={`/update-user/${user.id}`} action="true">Update</Link>
                  </Container>
              </CardBody>
          </Card>  
        </>
    )
}

export default User;
