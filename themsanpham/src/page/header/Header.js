import Container from "react-bootstrap/Container"
import {Link} from "react-router-dom"
import Nav from "react-bootstrap/Nav"
import Navbar from "react-bootstrap/Navbar"


const Header =()=>{
    return(
        <><Navbar bg="primary" variant="dark">
            <Container>
                <Navbar.Brand to="/">
                    <strong>Product Management</strong>
                </Navbar.Brand>
                <Nav className="ml-auto">
                    <Nav.Link as = {Link} to="/" className="nav-link"> Product</Nav.Link>
                    {/*2.	Quản trị viên chọn  "Post Product". */}
                    <Nav.Link as = {Link} to="/product" className="nav-link"> Post Product</Nav.Link>
                </Nav>

            </Container>
        </Navbar>
        </>
    )
}
export default Header;