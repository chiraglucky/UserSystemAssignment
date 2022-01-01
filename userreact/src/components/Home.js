import React,{useEffect} from "react";
import { Button, Container } from "reactstrap";

const Home = () => {
  useEffect(()=>{
    document.title="Home:UserManagementSystem"
  },[]);

  return (
    <>
      <div>
        <div className="container text-center" style={{backgroundColor:"#eeeeee",padding:"20px"}}>
          <h1>LearnCodeWith Chirag</h1>
          <p>
              This is developed by chirag for carscan assignment using springboot and react
          </p>
          <Container>
            <Button color="primary" outline>Start Using my app</Button>
          </Container>
        </div>
      </div>
    </>
  );
};

export default Home;
