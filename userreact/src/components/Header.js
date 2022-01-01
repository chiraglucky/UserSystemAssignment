import React from 'react'
import { Card, CardBody, Container } from 'reactstrap';

const Header = () => {
    return (
        <div>
            <Container>
            <Card className='my-2 bg-primary'>
                <CardBody>
                   <h1 className='text-center my-3'>User Management System</h1>
                </CardBody>
            </Card>
            </Container>
        </div>
    );
}

export default Header;
