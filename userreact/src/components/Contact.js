import React,{useEffect} from "react";
import {
    Button,
    Card,
    CardBody,
    CardImg,
    CardTitle,
    CardText,
    Container
  } from "reactstrap";
import { Link } from "react-router-dom";
import image from "../image/image.jfif";

const Contact = () => {
  useEffect(()=>{
    document.title="Contact:UserManagementSystem"
  },[]);

  return (
    <>
      <div className="container">
        <Card style={{ width: "28rem" }} className="text-center b-shadow" >
        <CardImg
          alt="..."
          className="p-3 container"
          style={{width:"300px",height:"300px",objectFit:"contain"}}
          src={image}
          top
        ></CardImg>
        <CardBody>
          <CardTitle><b>Chirag Dale</b></CardTitle>
          <CardText>
            Java Stack Developer
          </CardText>
          <Button
            className="m-3"
            color="primary"
            href="https://www.linkedin.com/in/chirag-dale-26a257176/"
          >
            Linkedin
          </Button>
          <Button
            color="success"
            href="https://github.com/chiraglucky"
          >
            <i class="fab fa-linkedin-in">Github</i>
          </Button>
        </CardBody>
      </Card>
        </div>
    </>
  );
};

export default Contact;
