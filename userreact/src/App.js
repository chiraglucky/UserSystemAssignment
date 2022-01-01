import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import "./App.css";
import { ToastContainer } from "react-toastify";
import Home from "./components/Home";
import Header from "./components/Header";
import AllUser from "./components/AllUser";
import AddUser from "./components/AddUser";
import { Col, Container, Row } from "reactstrap";
import Menu from "./components/Menu";
import UpdateUser from "./components/UpdateUser";
import Contact from "./components/Contact";
import About from "./components/About";

function App() {
  
  return (
    <>
      <Router>
        <ToastContainer />
        <Container>
          <Header />
          <Row>
            <Col md={4}>
              <Menu />
            </Col>
            <Col md={8}>
              <Routes>
                <Route path="/" element={<Home/>} exact/>
                <Route path="/add-user" element={<AddUser/>} exact />
                <Route path="/view-users" element={<AllUser/>} exact />
                <Route path="/update-user/:id" element={<UpdateUser/>} exact/>
                <Route path="/about" element={<About/>} exact/>
                <Route path="/contact" element={<Contact/>} exact/>
              </Routes>
            </Col>
          </Row>
        </Container>
      </Router>
    </>
  );
}

export default App;
