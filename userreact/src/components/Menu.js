import React from 'react'
import { Link } from 'react-router-dom';
import { ListGroup } from 'reactstrap';

const Menu = () => {
    return (
        <>
          <ListGroup className='b-shadow'>
              <Link className='list-group-item list-group-item-action' tag="a" to='/' action="true">Home</Link>
              <Link className='list-group-item list-group-item-action' tag="a" to='/add-user' action="true">Add User</Link>
              <Link className='list-group-item list-group-item-action' tag="a" to='/view-users' action="true">View Users</Link>
              <Link className='list-group-item list-group-item-action' tag="a" to='/about' action="true">About</Link>
              <Link className='list-group-item list-group-item-action' tag="a" to='/contact' action="true">Contact</Link>
          </ListGroup>  
        </>
    )
}

export default Menu;
