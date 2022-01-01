import React, { useEffect, useState } from "react";
import User from "./User";
import base_url from "../api/userapi";
import axios from "axios";
import { toast } from "react-toastify";
import { CardGroup, Row,Col } from "reactstrap";

const AllUser = () => {
  useEffect(() => {
    document.title = "All Users:UserManagementSystem";
    getAllUserFromServer();
  }, []);

  //function to call server
  const getAllUserFromServer = () => {
    axios.get(`${base_url}/users`).then(
      (response) => {
        // console.log(response.data)
        toast.success("Users has been loaded");
        setUsers(response.data);
      },
      (error) => {
        // console.log(error)
        toast.error(error.data);
      }
    );
  };

  const [users, setUsers] = useState([]);

  const updateUsers = (id) => {
    setUsers(users.filter((user) => user.id !== id));
  };

  return (
    <div>
      <h1>All Users</h1>
      <p>List of users are as follows</p>

      {users.length > 0
        ? users.map((item) => (
             <div className="b-shadow" style={{ width: "38rem" }}>
              <User key={item.id} user={item} update={updateUsers} />           
              </div>
          ))
        : "No Users"}
    </div>
  );
};

export default AllUser;
