import axios from "axios";
import React from "react";
import { Link } from "react-router-dom";
import { toast } from "react-toastify";
import {
  Button,
  Card,
  CardBody,
  CardSubtitle,
  CardText,
  CardTitle,
  Container,
} from "reactstrap";
import base_url from "../api/userapi";

const User = ({ user, update }) => {
  const deleteUser = (id) => {
    axios.delete(`${base_url}/users/${id}`).then(
      (response) => {
        toast.success(response.data);
        update(id);
      },
      (error) => {
        toast.error(error.data);
      }
    );
  };

  return (
    <div className="p-2">  
        <Card className="text-center card-frame">
          <CardBody>
            <CardTitle>
              <b>{user.fname + " " + user.lname}</b>
            </CardTitle>
            <CardSubtitle>{user.mobile}</CardSubtitle>
            <CardText>{user.city}</CardText>
            <CardText>{user.dob.slice(0, 10)}</CardText>
            <Container>
              <Button
                color="danger m-2"
                onClick={() => {
                  deleteUser(user.id);
                }}
              >
                Delete
              </Button>
              <Link
                className="btn btn-warning"
                tag="a"
                to={`/update-user/${user.id}`}
                action="true"
              >
                Update
              </Link>
            </Container>
          </CardBody>
        </Card>
    </div>
  );
};

export default User;
