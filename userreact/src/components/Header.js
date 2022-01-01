import React from 'react'
import { Card, CardBody, Container } from 'reactstrap';

const Header = () => {
    return (
        <div>
            <Card className='my-2 bg-primary b-shadow-2'>
                <CardBody>
                   <h1 className='text-center my-3'>User Management System</h1>
                </CardBody>
            </Card>
        </div>
    );
}

export default Header;
