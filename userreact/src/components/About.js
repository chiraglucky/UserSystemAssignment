import React,{useEffect} from "react";
import {
    Button,
    Card,
    CardBody,
    CardImg,
    CardTitle,
    CardText,
    CardSubtitle,
  } from "reactstrap";
import { Link } from "react-router-dom";
import image from "../image/image.jfif";

const About = () => {
  useEffect(()=>{
    document.title="Contact:UserManagementSystem"
  },[]);

  return (
    <>
      <div className="container">
        <Card style={{ width: "28rem" }} className="text-center b-shadow" >
        <CardBody>
          <CardTitle><b>Chirag Dale</b></CardTitle>
          <CardSubtitle>
            Java Stack Developer
          </CardSubtitle>
          <Button
            className="m-3"
            color="primary"
            href="#"
          >
            Portfolio
          </Button>
        </CardBody>
      </Card>
        </div>
    </>
  );
};

export default About;
