import React,{useEffect} from "react";
import { Button, Container } from "reactstrap";
import { Link } from "react-router-dom";

const Home = () => {
  useEffect(()=>{
    document.title="Home:UserManagementSystem"
  },[]);

  return (
    <>
      <div>
        <div className="container text-center" style={{backgroundColor:"#eeeeee",padding:"20px",height:"250px"}}>
          <h1><em>Welcome</em></h1>
          <p>
              <em>This is developed by chirag for carscan assignment using springboot and react</em>
          </p>
          <Container>
            <Link
                className="btn btn-primary mt-5"
                tag="a"
                to={`/view-users`}
                action="true"
              >
                Start using my app
              </Link>
          </Container>
        </div>
      </div>
    </>
  );
};

export default Home;
